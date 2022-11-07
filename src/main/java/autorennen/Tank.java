package autorennen;
public class Tank {
    private int tankstand;
    private int tankstandMaximal = 100;
    private int genormterVerbrauch  = 5;

    public int getTankstand() {
        return tankstand;
    }
    
    public void tankVerbrauch(int geschwindigkeit){  
        int verbrauch = this.tankstand-this.genormterVerbrauch*geschwindigkeit;    
    }

    public int getTankstandMaximal() {
        return tankstandMaximal;
    }
}
