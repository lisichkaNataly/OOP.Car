import transport.Car;

public class Main {
    public static void main(String[] args) {


        Car lada = new Car("Lada",
                "Granta",
                1.7,
                "желтый",
                2015,
                "Россия");
        lada.setRegNumber("М640ЕС159");
        System.out.println(lada.isCorrectRegNumber());

        Car audi = new Car("Audi",
                "A8 50 L TDI quattro",
                3.0,
                null,
                2020,
                "Германия");
        audi.setGears("Автомат");


        Car bmv = new Car("BMV",
                "Z8",
                3.0,
                "черный",
                0,
                "Германия");
        bmv.setSummerTyres(false);


        Car kia = new Car("KIA",
                "Sportage 4-го поколения",
                2.4,
                "красный",
                2018,
                "Южная Корея");


        Car hyundai = new Car("Hyundai",
                "Avante",
                0,
                "оранжевый",
                2016,
                "Южная Корея");

        printInfo(lada);
        printInfo(audi);
        printInfo(bmv);
        printInfo(kia);
        printInfo(hyundai);
    }

    private static void printInfo(Car car) {
        System.out.println("Марка автомобиля " + car.getBrand() +
                ", модель " + car.getModel() +
                ", объем двигателя " + car.getEngineVolume() +
                ", цвет кузова: " + car.getColor() +
                ", год выпуска: " + car.getProductionYear() +
                ", страна производства: " + car.getProductionCountry() +
                ", коробка передач: " + car.getGears() +
                ", тип кузова: " + car.getTypeOfBody() +
                ", регистрационный номер: " + car.getRegNumber() +
                ", количество мест: " + car.getSeatCount() +
                ", " + (car.isSummerTyres() ? "летняя" : "зимняя") + " резина");
    }
}