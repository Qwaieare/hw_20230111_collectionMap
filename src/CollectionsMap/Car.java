package CollectionsMap;

import java.util.List;

public class Car extends Transport {

    public enum BodyOfType {
        SEDAN,      // Седан
        HATCHBACK,  // Хетчбек
        COUPE,      // Купе
        UNIVERSAL,  // Универсал
        SUV,        // Внедорожник
        CROSSOVER,  // Кроссовер
        PICKUP,     // Пикап
        VAN,        // Фургон
        Minivan;    // Минивэн

    }

    private BodyOfType bodyOfType; // переменная перечисления (enum)

    public Car(String brand,
               String model,
               double engineVolume,
               BodyOfType bodyOfType) {
        super(brand, model, engineVolume);
        this.bodyOfType = bodyOfType;
    }

    public BodyOfType getBodyOfType() {
        return bodyOfType;
    }

    public void setBodyOfType(BodyOfType bodyOfType) {
        this.bodyOfType = bodyOfType;
    }

    @Override
    public void gas() {
        System.out.println(getBrand() + " " + getModel() + " начать движение");
    }

    @Override
    public void brake() {
        System.out.println(getBrand() + " " + getModel() + " закончить движение");
    }



    public void printType() {
        if (bodyOfType == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println("Тип транспортного средства " + getBrand() + " " + getModel() + " : " + bodyOfType);
        }
    }

    @Override
    public boolean service() {
        return Math.random() > 0.7;
    }


    public static void carsInTheList(List<Car> cars) { // на печать список автомобилей
        for (Car car : cars) {
            System.out.println(car.getBrand() + " " + car.getModel() + " " + car.getEngineVolume() + " " + car.getBodyOfType());
        }
    }


}

