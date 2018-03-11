package automat;

public class Zoneberegner {
    
    public int automatZone;
    private int destinationZone;
    
    public Zoneberegner(){
        automatZone = 0;
        destinationZone = 0;
    }
    
    // SLUTZONE ----------------------------------------------------------------
    public void setSlutZone(int destZone) {
        this.destinationZone = destZone;
    }
    public int getSlutZone() {
        return destinationZone;
    }
    
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
