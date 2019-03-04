package model;

public abstract class Plane {

    private static long number;
    private double distanceCapacity;

    public static long getNumber() {
        return number;
    }

    public double getDistanceCapacity() {
        return distanceCapacity;
    }

    public void setDistanceCapacity(double distanceCapacity) {
        this.distanceCapacity = distanceCapacity;
    }
}
