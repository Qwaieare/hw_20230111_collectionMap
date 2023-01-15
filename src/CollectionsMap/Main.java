package CollectionsMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Toyota", "Land Cruiser", 4.5, Car.BodyOfType.SUV);
        Car car2 = new Car("Mitsubishi", "Pajero", 3.0, Car.BodyOfType.SUV);
        Car car3 = new Car("Land Rover", "Range Rover P530 Long", 4.4, Car.BodyOfType.SUV);
        Car car4 = new Car("Jeep", "Grand Cherokee", 3.6, Car.BodyOfType.SUV);

        Truck truck1 = new Truck("DAF", "LF 45", 4.0, Truck.LoadCapacity.N1);
        Truck truck2 = new Truck("MAN", "TGL", 4.6, Truck.LoadCapacity.N2);
        Truck truck3 = new Truck("Daewoo", "Novus SE Medium Cargo", 5.9, Truck.LoadCapacity.N2);
        Truck truck4 = new Truck("ISUZU", "ELF", 5.2, Truck.LoadCapacity.N2);

        Bus bus1 = new Bus("ЛиАЗ", "5256", 10.85, Bus.Capacity.SMALL);
        Bus bus2 = new Bus("ПАЗ", "3206", 4.25, Bus.Capacity.SMALL);
        Bus bus3 = new Bus("КАВЗ", "4235 АВРОРА", 10.3, Bus.Capacity.AVERAGE);
        Bus bus4 = new Bus("ГАЗ", "Вектор Next", 10.0, Bus.Capacity.ESPEC_SMALL);

        List<Transport> transports = new ArrayList<>();
        transports.add(car1); transports.add(car2); transports.add(car3);  transports.add(car4);
        transports.add(truck1); transports.add(truck2); transports.add(truck3);  transports.add(truck4);
        transports.add(bus1);  transports.add(bus2); transports.add(bus3); transports.add(bus4);
        Transport.transportsInTheList(transports);

        Mechanics mechanic1 = new Mechanics("Юрий", "Петров", "RVZ",TransportType.CAR);
        Mechanics mechanic2 = new Mechanics("Юрий", "Иванов", "RVZ", TransportType.CAR);
        Mechanics mechanic3 = new Mechanics("Юрий", "Ерохин", "RVZ", TransportType.CAR);
        Mechanics mechanic4 = new Mechanics("Юрий", "Смартов", "RVZ", TransportType.ALL);

        Mechanics mechanic5 = new Mechanics("Роман", "Скворцов", "NPO", TransportType.TRUCK);
        Mechanics mechanic6 = new Mechanics("Роман", "Воронов", "NPO", TransportType.TRUCK);
        Mechanics mechanic7 = new Mechanics("Роман", "Галкин", "NPO", TransportType.TRUCK);
        Mechanics mechanic8 = new Mechanics("Роман", "Голубев", "NPO", TransportType.ALL);

        Mechanics mechanic9 = new Mechanics("Валерий", "Артемов", "NPG", TransportType.BUS);
        Mechanics mechanic10 = new Mechanics("Валерий", "Кремов", "NPG", TransportType.BUS);
        Mechanics mechanic11 = new Mechanics("Валерий", "Громов", "NPG", TransportType.BUS);
        Mechanics mechanic12 = new Mechanics("Валерий", "Хромов", "NPG", TransportType.ALL);

        System.out.println();
        List<Mechanics> mechanics = new ArrayList<>();
        mechanics.add(mechanic1); mechanics.add(mechanic2); mechanics.add(mechanic3); mechanics.add(mechanic4);
        mechanics.add(mechanic5); mechanics.add(mechanic6); mechanics.add(mechanic7); mechanics.add(mechanic8);
        mechanics.add(mechanic9); mechanics.add(mechanic10); mechanics.add(mechanic11); mechanics.add(mechanic12);
        Mechanics.mechanicsInTheList(mechanics);

        car1.addMechanics(mechanic1); car1.addMechanics(mechanic2); car1.addMechanics(mechanic3);
        truck1.addMechanics(mechanic5); truck1.addMechanics(mechanic6); truck1.addMechanics(mechanic7);
        bus1.addMechanics(mechanic9); bus1.addMechanics(mechanic10); bus1.addMechanics(mechanic11);

        System.out.println();
        for (Transport transport : transports) {
            System.out.println("Транспорт " + transport.getBrand() + " " + transport.getModel() +  " "  + transport.getMechanics());
        }

        System.out.println();
        Map<Transport, List<Mechanics>> transportMechanicMap = new HashMap<>();
        for (Transport transport : transports) {
            transportMechanicMap.put(transport, transport.getMechanics());
        }
        System.out.println(transportMechanicMap);


    }
}