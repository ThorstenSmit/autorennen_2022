package autorennen;
public class Auto {
    private String fahrerName;
    private Tank tank;
    private String name;
    private int geschwindigkeit;
    private boolean kannFahren;
    private int maxGeschwindigkeit = 150;
    private int geschwindigkeitsSchritt = 15;

    public Auto(String name, Tank tank){
        this.name = name;
        this.tank = tank;
    }
    
    private void fahren(boolean istEsAmRegnen){
        if (this.getTank().getTankstand()==0){
            System.out.println("Nicht genug Tank!");
            this.kannFahren = false;
        } else {
            this.getTank().tankVerbrauch(this.geschwindigkeit, istEsAmRegnen);
            this.kannFahren = true;
        }
    }
    
    public int getGeschwindigkeit(){
        return geschwindigkeit;
    }

    public boolean isKannFahren() {
        return kannFahren;
    }
    
    public void beschleunigen(boolean istEsAmRegnen){
        this.geschwindigkeit += this.geschwindigkeitsSchritt;
        if (this.geschwindigkeit >= this.maxGeschwindigkeit){
            this.geschwindigkeit = this.maxGeschwindigkeit;
        }
        this.fahren(istEsAmRegnen);
    }
        
    public void bremsen(boolean istEsAmRegnen){
        this.geschwindigkeit -= this.geschwindigkeitsSchritt;
        if (this.geschwindigkeit <= 0){
            this.geschwindigkeit = 0;
        }
        this.fahren(istEsAmRegnen);
    }
    
    public void weiterFahren(boolean istEsAmRegnen){
        this.fahren(istEsAmRegnen);
    }
    
    public Tank getTank() {
        return tank;
    }
}
