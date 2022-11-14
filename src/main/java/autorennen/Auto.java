package autorennen;
public class Auto {
    private String fahrerName;
    private Tank tank;
    private String name;
    private int geschwindigkeit = 15;
    private int maxGeschwindigkeit = 150;
    private int geschwindigkeitsSchritt = 15;

    public Auto(String name, Tank tank){
        this.name = name;
        this.tank = tank;
    }
    
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
        this.fahren();
    }
    
    public Tank getTank() {
        return tank;
    }
}
