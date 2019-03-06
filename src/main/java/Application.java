import model.AirClass;
import model.Airline;
import model.Company;
import model.Consignment;
import model.TransportPlane;

public class Application {


    public static void main (String args[]) {
        Company belavia = init();
        System.out.println("Lets start.\n");
        //для интереса можешь почитать про String.format - позволяет удобно строки составлять с разными параметрами. тут не критично,
        //потому что ты одно число в строку вставляешь, но если было бы 2 и больше, то со String.format было бы удобнее
        System.out.println("Total people capacity of company: " + belavia.countPeopleCapacity());
        System.out.println("Total carrying capacity of company: " + belavia.countCarryingCapacity());
        belavia.sortByDistance();
    }

    //попробуй вынести в отдельный класс - CompanyBuilder или Factory - тут хорошо подойдет один из этих паттернов
    //а следующим шагом запилим вычитку данных из экселя или хмл - будет аналог БД - и уберем хардкод
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
