package CollectionsMap;

import java.util.List;

public class Truck extends Transport {

    private LoadCapacity loadCapacity;

    public Truck(String brand,
                 String model,
                 double engineVolume,
                 LoadCapacity loadCapacity) {
        super(brand, model, engineVolume);
        this.loadCapacity = loadCapacity;
    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
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
        if (loadCapacity == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            String from = loadCapacity.getFrom() == null ? "" : "от " + loadCapacity.getFrom() + " ";
            String to = loadCapacity.getTo() == null ? "" : "до " + loadCapacity.getTo();
            System.out.println("Грузоподъемность транспортного средства " + getBrand() + " " + getModel() + " : " + from + to + " тн");
        }
    }

    @Override
    public boolean service() {
        return Math.random() > 0.75;
    }

    public static void trucksInTheList(List<Truck> trucks) { // на печать список грузовиков
        for (Truck truck : trucks) {
            System.out.println(truck.getBrand() + " " + truck.getModel() + " " + truck.getEngineVolume() + " " +  truck.getLoadCapacity());
        }
    }
    public enum LoadCapacity {
        N1(0.0f, 3.5f),
        N2(3.5f, 12.0f),
        N3(12.0f, null);

        private Float from;
        private Float to;

        LoadCapacity(Float from, Float to) {
            this.from = from;
            this.to = to;
        }

        public Float getFrom() {
            return from;
        }

        public void setFrom(Float from) {
            this.from = from;
        }

        public Float getTo() {
            return to;
        }

        public void setTo(Float to) {
            this.to = to;
        }

        @Override
        public String toString() {
            if (getTo() != null) {
                return "Грузоподъемность от " + getFrom() + " тн до " + getTo() + " тн";
            } else {
                return "Грузоподъемность от " + getFrom() + " тн";
            }
        }
    }

}

