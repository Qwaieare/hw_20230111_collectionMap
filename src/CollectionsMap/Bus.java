package CollectionsMap;

import java.util.List;

public class Bus extends Transport {

    private Capacity capacity;

    public Bus(String brand,
               String model,
               double engineVolume,
               Capacity capacity) {
        super(brand, model, engineVolume);
        this.capacity = capacity;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }

    @Override
    public void gas() {
        System.out.println(getBrand() + " " + getModel() + " начать движение");
    }

    @Override
    public void brake() {
        System.out.println(getBrand() + " " + getModel() + " закончить движение");
    }


    @Override
    public void printType() {
        if (capacity == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println("Вместимость транспортного средства " + getBrand() + " " + getModel() +
                    " от " + capacity.getFrom() + " до " + capacity.getTo() + " чел.");
        }
    }

    @Override
    public boolean service() {
        System.out.println("Автобусу " + getBrand() + " " + getModel() + " диагностика не требуется");
        return true;
    }

    public static void busesInTheList(List<Bus> buses) { // на печать список автобусов
        for (Bus bus : buses) {
            System.out.println(bus.getBrand() + " " + bus.getModel() + " " + bus.getEngineVolume() + " " + bus.getCapacity());
        }
    }

    public enum Capacity {
        ESPEC_SMALL(0, 10),
        SMALL(10, 25),
        AVERAGE(40, 50),
        LARGE(60, 80),
        ESPEC_BIG(100, 120);

        // поля
        private final int from;
        private final int to;

        // конструктор
        Capacity(int from, int to) {
            this.from = from;
            this.to = to;
        }

        // геттеры
        public int getFrom() {
            return from;
        }
        public int getTo() {
            return to;
        }

        @Override
        public String toString() {
            return "Вместимость " + from + " - " + to + " мест";
        }


    }
}

