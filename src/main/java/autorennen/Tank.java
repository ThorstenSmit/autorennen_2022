package autorennen;

public class Tank {
    private final int tankstandMaximal = 100;
    private int tankstand = tankstandMaximal;
    private final int genormterVerbrauch = 5;
    private final double verbrauchsFaktor = 0.6;

    public int getTankstand() {
        return tankstand;
    }

    public void tankVerbrauch(int geschwindigkeit, boolean istEsAmRegnen) {
        if (istEsAmRegnen) {
            this.tankstand -= (int) (this.genormterVerbrauch * geschwindigkeit * 2 * verbrauchsFaktor);
        } else {
            this.tankstand -= (int) (this.genormterVerbrauch * geschwindigkeit * verbrauchsFaktor);
        }
    }

    public int getTankstandMaximal() {
        return tankstandMaximal;
    }
}
