package autorennen;
public class SpielCtrl {

    private boolean aktuellerSpieler;
    private Rennstrecke rennstrecke;

    public SpielCtrl(Rennstrecke rennstrecke) {
        this.rennstrecke = rennstrecke;
    }

    public Rennstrecke getRennstrecke() {
        return rennstrecke;
    }
    
    public void knopfLinksWeiterFahren() {
        this.rennstrecke.getAutoLinks().weiterFahren();
    }

    public void knopfLinksBeschleunigen() {
        this.rennstrecke.getAutoLinks().beschleunigen();
    }

    public void knopfLinksBremsen() {
        this.rennstrecke.getAutoLinks().bremsen();
    }

    public void knopfRechtsWeiterFahren() {
        this.rennstrecke.getAutoRechts().weiterFahren();
    }

    public void knopfRechtsBeschleunigen() {
        this.rennstrecke.getAutoRechts().beschleunigen();
    }

    public void knopfRechtsBremsen() {
        this.rennstrecke.getAutoRechts().bremsen();
    }

    public boolean hatSpielerGewonnen() {
        return !this.aktuellerSpieler
                ? this.rennstrecke.getAutoLinksPos() >= 500
                : this.rennstrecke.getAutoRechtsPos() >= 500;
    }

}
