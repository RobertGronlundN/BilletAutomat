package automat;

public class Zoneberegner
{
    public int automatZone = 1;
    private int destinationZone;

    
    // SLUTZONE ----------------------------------------------------------------
    public void setAutomatZone(int startZone) {
        this.automatZone = startZone;
    } // End of setSlutZone
    public int getAutomatZone() {
        return automatZone;
    } // End of getSlutZone


    // SLUTZONE ----------------------------------------------------------------
    public void setSlutZone(int destZone) {
        this.destinationZone = destZone;
    } // End of setSlutZone
    public int getSlutZone() {
        return destinationZone;
    } // End of getSlutZone


    // ZONEBEREGNER ------------------------------------------------------------
    public int zoneBeregner() {
        int rejseZoner = 0;
        int slutZone = getSlutZone();

        if (slutZone < automatZone) {
            rejseZoner = (automatZone - slutZone);
        }
        else if (slutZone > automatZone) {
            rejseZoner = (slutZone - automatZone);
        }
        else if (slutZone == automatZone) {
            rejseZoner = 1;
        }
        if (slutZone > 6){
            rejseZoner = 6;
        }
        return rejseZoner;
    }
}
