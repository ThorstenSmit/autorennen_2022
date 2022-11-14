package autorennen;
public class Auto {
    private String fahrerName;
    private Tank tank;
    private String name;
    private int geschwindigkeit;
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
        this.geschwindigkeit += this.geschwindigkeitsSchritt;
        if (this.geschwindigkeit >= this.maxGeschwindigkeit){
            this.geschwindigkeit = this.maxGeschwindigkeit;
        }
        this.fahren();
    }
        
    public void bremsen(){
        this.geschwindigkeit -= this.geschwindigkeitsSchritt;
        if (this.geschwindigkeit <= 0){
            this.geschwindigkeit = 0;
        }
        this.fahren();
    }
    
    public void weiterFahren(){
        this.fahren();
    }
    
    public Tank getTank() {
        return tank;
    }
}
