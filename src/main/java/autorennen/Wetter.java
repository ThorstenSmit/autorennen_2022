package autorennen;

public class Wetter {

    private boolean istEsAmRegnen = false;

    public boolean isIstEsAmRegnen() {
        if(Math.random()>0.9){
        istEsAmRegnen = !istEsAmRegnen;
        }
        return istEsAmRegnen;
    }

}
