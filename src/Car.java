public class Car {

    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;

    void car () {
        System.out.println("Автомобиль: " + brand + " " + model);
        System.out.println("Год выпуска: " + productionYear);
        System.out.println("Страна выпуска: " + productionCountry);
        System.out.println("Цвет: " + color);
    }

}