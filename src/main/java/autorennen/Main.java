package autorennen; 
public class Main {
    public static void main(String[] args) {
        GUI Fenster = new GUI();
        Fenster.setSpielCtrl(new SpielCtrl(new Rennstrecke(new Auto("Test1", new Tank()), new Auto("Test2", new Tank()), new Wetter())));
        Fenster.setVisible(true);
    }
    
}
