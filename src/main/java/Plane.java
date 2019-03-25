public class Plane {

    private PlaneType plane;
    private int capacity;
    private int totalWeight;

    public Plane(PlaneType plane, int capacity, int totalWeight) {
        this.plane = plane;
        this.capacity = capacity;
        this.totalWeight = totalWeight;

    }

    public PlaneType getPlane() {
        return plane;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getTotalWeight() {
        return this.totalWeight;
    }

    public int passengerCapacity() {
        return this.totalWeight / 2;
    }

    public int reserverdWeightPerPassenger(){
        return this.passengerCapacity() / this.capacity;
    }
}
