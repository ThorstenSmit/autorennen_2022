package autorennen;
public class Auto {
    private String fahrerName;
    private Tank tank;
    private int geschwindigkeit;
    private int maxGeschwindigkeit = 150;
    private int geschwindigkeitsSchritt = 15;

    public Auto(String name){}
    private void fahren(){}
    public int getGeschwindigkeit() {
        return geschwindigkeit;}
    public void beschleunigen(){
    }
    public void bremsen(){
    }
    public void weiterFahren(){
    }
    public Tank getTank() {
        return tank;
    }
}
