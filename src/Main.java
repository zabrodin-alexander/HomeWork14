import example.*;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("car1", 4);
        Car car2 = new Car("car2", 4);

        Truck truck = new Truck("Truck", 6);
        Truck truck2 = new Truck("Truck2", 6);

        Bicycle bicycle = new Bicycle("bike", 2);
        Bicycle bicycle2 = new Bicycle("bike2", 2);

        Transport[] transports = {
                car,
                car2,
                truck,
                truck2,
                bicycle,
                bicycle2
        };

        ServiceStation station = new ServiceStation();
        for (Transport transport : transports) {
            station.check(transport);
            System.out.println();
        }
    }
}