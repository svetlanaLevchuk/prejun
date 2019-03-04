package model;

public class Airline extends Plane {

    private double peopleCapacity;
    private AirClass airClass;

    public Airline(double peopleCapacity, AirClass airClass, double distance) {
        this.peopleCapacity = peopleCapacity;
        this.airClass = airClass;
        setDistanceCapacity(distance);
    }

    public Airline() {
    }

    public double getPeopleCapacity() {
        return peopleCapacity;
    }

    public void setPeopleCapacity(double peopleCapacity) {
        this.peopleCapacity = peopleCapacity;
    }

    public AirClass getAirClass() {
        return airClass;
    }

    public void setAirClass(AirClass airClass) {
        this.airClass = airClass;
    }
}
