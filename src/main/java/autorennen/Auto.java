package autorennen;
public class Auto {
    private String fahrerName;
    private Tank tank;
    private int geschwindigkeit;
    private int maxGeschwindigkeit = 150;
    private int geschwindigkeitsSchritt = 15;

    public Auto(String name){}
    private void fahren(){
        if (this.getTank().getTankstand()==0){
            System.out.println("Nicht genug Tank!");
        }else {
            int faehrt = this.geschwindigkeit*this.geschwindigkeitsSchritt;
        }
    }
    
    public int getGeschwindigkeit(){
        return geschwindigkeit;
    }
    
    public void beschleunigen(){
        int beschleunigt = this.geschwindigkeit*this.geschwindigkeitsSchritt;
        if (this.maxGeschwindigkeit == this.geschwindigkeit){
            int maxGeschwindigkeit1 = this.maxGeschwindigkeit;
        }
    }
        
    public void bremsen(){
        int bremse = this.geschwindigkeit-this.geschwindigkeitsSchritt;
    }
    public void weiterFahren(){
        int faehrtweiter = this.geschwindigkeit*this.geschwindigkeitsSchritt;
    }
    public Tank getTank() {
        return tank;
    }
}
