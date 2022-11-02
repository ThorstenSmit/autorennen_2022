package Projekt_Autorennen;

public class Rennstrecke {
    private Auto autoLinks;
    private Auto autoRechts;
    private int laenge = 500;
    private Wetter wetter;
    private int autoRechtsPos = 0;
    private int autoLinksPos = 0;

    public Rennstrecke(Auto autoLinks, Auto autoRechts, Wetter wetter) {
        this.autoLinks = autoLinks;
        this.autoRechts = autoRechts;
        this.wetter = wetter;
    }
    
    public Auto getAutoLinks() {
        return autoLinks;
    }

    public void setAutoLinks(Auto autoLinks) {
        this.autoLinks = autoLinks;
    }

    public Auto getAutoRechts() {
        return autoRechts;
    }

    public void setAutoRechts(Auto autoRechts) {
        this.autoRechts = autoRechts;
    }

    public int getLaenge() {
        return laenge;
    }

    public void setLaenge(int laenge) {
        this.laenge = laenge;
    }

    public Wetter getWetter() {
        return wetter;
    }

    public void setWetter(Wetter wetter) {
        this.wetter = wetter;
    }

    public int getAutoRechtsPos() {
        return autoRechtsPos;
    }

    public void setAutoRechtsPos(int autoRechtsPos) {
        this.autoRechtsPos = autoRechtsPos;
    }

    public int getAutoLinksPos() {
        return autoLinksPos;
    }

    public void setAutoLinksPos(int autoLinksPos) {
        this.autoLinksPos = autoLinksPos;
    }

    
}
