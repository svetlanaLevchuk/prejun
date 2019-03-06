package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Company {

    private String name;
    private List<TransportPlane> transportPlanes = new ArrayList<TransportPlane>();
    private List<Airline> airlines = new ArrayList<Airline>();

    public Company(String name, List<TransportPlane> transportPlanes, List<Airline> airlines) {
        this.name = name;
        this.transportPlanes = transportPlanes;
        this.airlines = airlines;
    }

    public Company(String name) {
        this.name = name;
    }

    public Company() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<TransportPlane> getTransportPlanes() {
        return transportPlanes;
    }

    public void setTransportPlanes(List<TransportPlane> transportPlanes) {
        this.transportPlanes = transportPlanes;
    }

    public List<Airline> getAirlines() {
        return airlines;
    }

    public void setAirlines(List<Airline> airlines) {
        this.airlines = airlines;
    }

    public void addAirline(Airline airline) {
        airlines.add(airline);
    }

    public void addTransportPlane(TransportPlane plane) {
        transportPlanes.add(plane);
    }
//попробуй переделать метод используя Stream api https://annimon.com/article/2778, https://baron.su/2017/java-summa-elementov-spiska-s-nulevymi-elementami.html
    public double countCarryingCapacity() {
        double total = 0;  
        for (TransportPlane plane : transportPlanes) {
            total += plane.getCarryingCapacity();
        }
        return total;
    }
//Stream api
    public double countPeopleCapacity () {
        double total = 0;
        for (Airline plane : airlines) {
            total += plane.getPeopleCapacity();
        }
        return total;
    }

    public void sortByDistance() {
        List<Double> listDistance = new ArrayList<Double>();
        for (TransportPlane plane : transportPlanes) {
            listDistance.add(plane.getDistanceCapacity());
        }
        for (Airline plane : airlines) {
            listDistance.add(plane.getDistanceCapacity());
        }

        Collections.sort(listDistance);
        //лучше использовать логирование вместо вывода в консоль - log4j - http://javastudy.ru/log4j/log4j-hello-world-example/
        System.out.println("Sorted by distance:\n");
        for (double distance : listDistance) {
            System.out.println("\n" + distance);
        }


    }

}
