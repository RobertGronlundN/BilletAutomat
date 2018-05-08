package automat;

public class Zoneberegner
{
    public int automatZone = 1;
    private int destinationZone;
    private int rejsezoner = 1;

    
    // AUTOMATZONE ----------------------------------------------------------------
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

    
    // REJSEZONER ----------------------------------------------------------------
    public void setRejseZoner(int i) {
        this.rejsezoner = i;
    } // End of setSlutZone
    public int getRejseZoner() {
        return rejsezoner;
    } // End of getSlutZone

    // ZONEBEREGNER ------------------------------------------------------------
    public void zoneBeregner() {
        int rejsezoner = 0;
        int slutZone = getSlutZone();

        if (slutZone < automatZone) {
            rejsezoner = (automatZone - slutZone);
        }
        else if (slutZone > automatZone) {
            rejsezoner = (slutZone - automatZone);
        }
        else if (slutZone == automatZone) {
            rejsezoner = 1;
        }
        if (slutZone > 6){
            rejsezoner = 6;
        }
    }
}
