public enum PlaneType {

    BOEING747(1, 50),
    BOEING777(2, 100),
    AIRBUSA300(3, 150),
    AIRBUSA310(4, 200),
    GULFSTREAMG500(5, 250);

    public final int capacity;
    public final int totalWeight;

    PlaneType(int capacity, int totalWeight){
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }


    public int getCapacity() {
        return capacity;
    }

    public int getTotalWeight() {
        return totalWeight;
    }


}
