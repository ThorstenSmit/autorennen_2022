package autorennen;
public class SpielCtrl {

    private boolean aktuellerSpieler = false;
    private final Rennstrecke rennstrecke;

    public SpielCtrl(Rennstrecke rennstrecke) {
        this.rennstrecke = rennstrecke;
    }
    private void changeSpieler(){
        this.aktuellerSpieler = !this.aktuellerSpieler;
    }

    public Rennstrecke getRennstrecke() {
        return rennstrecke;
    }
    
    public void knopfLinksWeiterFahren() {
        if(aktuellerSpieler && !hatSpielerGewonnen()){
            this.rennstrecke.getAutoLinks().weiterFahren();
            this.rennstrecke.setAutoLinksPos(this.rennstrecke.getAutoLinksPos()+this.rennstrecke.getAutoLinks().getGeschwindigkeit());
            changeSpieler();
        }
    }

    public void knopfLinksBeschleunigen() {
        if(aktuellerSpieler && !hatSpielerGewonnen()) {
            this.rennstrecke.getAutoLinks().beschleunigen();
            changeSpieler();
        }
    }

    public void knopfLinksBremsen() {
        if(aktuellerSpieler && !hatSpielerGewonnen()) {
            this.rennstrecke.getAutoLinks().bremsen();
            changeSpieler();
        }
    }

    public void knopfRechtsWeiterFahren() {
        if(!aktuellerSpieler && !hatSpielerGewonnen()) {
            this.rennstrecke.getAutoRechts().weiterFahren();
            changeSpieler();
        }
    }

    public void knopfRechtsBeschleunigen() {
        if(!aktuellerSpieler && !hatSpielerGewonnen()) {
            this.rennstrecke.getAutoRechts().beschleunigen();
            changeSpieler();
        }
    }

    public void knopfRechtsBremsen() {
        if(!aktuellerSpieler && !hatSpielerGewonnen()) {
            this.rennstrecke.getAutoRechts().bremsen();
            changeSpieler();
        }
    }

    public boolean hatSpielerGewonnen() {
        return this.aktuellerSpieler
                ? this.rennstrecke.getAutoLinksPos() >= 500
                : this.rennstrecke.getAutoRechtsPos() >= 500;
    }

}
