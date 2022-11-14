package autorennen;

public class SpielCtrl {

    private boolean aktuellerSpieler = false;
    private final Rennstrecke rennstrecke;

    public SpielCtrl(Rennstrecke rennstrecke) {
        this.rennstrecke = rennstrecke;
    }

    private void changeSpieler() {
        this.aktuellerSpieler = !this.aktuellerSpieler;
    }

    private void autoLinksBewegung() {
        this.rennstrecke.setAutoLinksPos(this.rennstrecke.getAutoLinksPos() + this.rennstrecke.getAutoLinks().getGeschwindigkeit());
    }

    private void autoRechtsBewegung() {
        this.rennstrecke.setAutoRechtsPos(this.rennstrecke.getAutoRechtsPos() + this.rennstrecke.getAutoRechts().getGeschwindigkeit());
    }

    public Rennstrecke getRennstrecke() {
        return rennstrecke;
    }

    public void knopfLinksWeiterFahren() {
        if (aktuellerSpieler && !hatSpielerGewonnen()) {
            this.rennstrecke.getAutoLinks().weiterFahren(this.rennstrecke.getWetter().getIstEsAmRegnen());
            autoLinksBewegung();
            changeSpieler();
        }
    }

    public void knopfLinksBeschleunigen() {
        if (aktuellerSpieler && !hatSpielerGewonnen()) {
            this.rennstrecke.getAutoLinks().beschleunigen(this.rennstrecke.getWetter().getIstEsAmRegnen());
            autoLinksBewegung();
            changeSpieler();
        }
    }

    public void knopfLinksBremsen() {
        if (aktuellerSpieler && !hatSpielerGewonnen()) {
            this.rennstrecke.getAutoLinks().bremsen(this.rennstrecke.getWetter().getIstEsAmRegnen());
            autoLinksBewegung();
            changeSpieler();
        }
    }

    public void knopfRechtsWeiterFahren() {
        if (!aktuellerSpieler && !hatSpielerGewonnen()) {
            this.rennstrecke.getAutoRechts().weiterFahren(this.rennstrecke.getWetter().getIstEsAmRegnen());
            autoRechtsBewegung();
            changeSpieler();
        }
    }

    public void knopfRechtsBeschleunigen() {
        if (!aktuellerSpieler && !hatSpielerGewonnen()) {
            this.rennstrecke.getAutoRechts().beschleunigen(this.rennstrecke.getWetter().getIstEsAmRegnen());
            autoRechtsBewegung();
            changeSpieler();
        }
    }

    public void knopfRechtsBremsen() {
        if (!aktuellerSpieler && !hatSpielerGewonnen()) {
            this.rennstrecke.getAutoRechts().bremsen(this.rennstrecke.getWetter().getIstEsAmRegnen());
            autoRechtsBewegung();
            changeSpieler();
        }
    }

    public boolean hatSpielerGewonnen() {
        return this.aktuellerSpieler
                ? this.rennstrecke.getAutoLinksPos() >= 500
                : this.rennstrecke.getAutoRechtsPos() >= 500;
    }

}
