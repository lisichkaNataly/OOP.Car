public class Car {

    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;

    Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.productionCountry = productionCountry;
        this.productionYear = productionYear;
    }

    void car () {
        System.out.println("Автомобиль: " + brand + " " + model);
        System.out.println("Объем двигателя: " + engineVolume + " л");
        System.out.println("Год выпуска: " + productionYear);
        System.out.println("Страна выпуска: " + productionCountry);
        System.out.println("Цвет: " + color);
    }

}