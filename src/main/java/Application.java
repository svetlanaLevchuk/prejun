import model.AirClass;
import model.Airline;
import model.Company;
import model.Consignment;
import model.TransportPlane;

public class Application {


    public static void main (String args[]) {
        Company belavia = init();
        System.out.println("Lets start.\n");
        System.out.println("Total people capacity of company: " + belavia.countPeopleCapacity());
        System.out.println("Total carrying capacity of company: " + belavia.countCarryingCapacity());
        belavia.sortByDistance();
    }

    public static Company init() {
        Company company = new Company("Belavia");
        TransportPlane transportFirst = new TransportPlane(Consignment.CAR, 26, 5000);
        TransportPlane transportSecond = new TransportPlane(Consignment.MEAL, 50, 15000);
        Airline airlineFirst = new Airline(100, AirClass.BUSINESS, 6000);
        Airline airlineSecond = new Airline(200, AirClass.SECOND, 10000);
        company.addAirline(airlineFirst);
        company.addAirline(airlineSecond);
        company.addTransportPlane(transportFirst);
        company.addTransportPlane(transportSecond);
        return company;
    }


}
