public class Main {
    public static void main(String[] args) {


        Car lada = new Car("Lada",
                "Granta",
                1.7,
                "желтый",
                2015,
                "Россия");
        System.out.println("марка автомобиля: " + lada.brand +
                " Модель: " + lada.model +
                " Объем двигателя " + lada.engineVolume +
                " Цвет кузова: " + lada.color +
                " Год выпуска: " + lada.productionYear +
                " Страна производства: " + lada.productionCountry);


        Car audi = new Car("Audi",
                "A8 50 L TDI quattro",
                3.0,
                null,
                2020,
                "Германия");

        System.out.println("марка автомобиля: " + audi.brand +
                " Модель: " + audi.model +
                " Объем двигателя " + audi.engineVolume +
                " Цвет кузова: " + audi.color +
                " Год выпуска: " + audi.productionYear +
                " Страна производства: " + audi.productionCountry);


        Car bmv = new Car("BMV",
                "Z8",
                3.0,
                "черный",
                0,
                "Германия");

        System.out.println("марка автомобиля: " + bmv.brand +
                " Модель: " + bmv.model +
                " Объем двигателя " + bmv.engineVolume +
                " Цвет кузова: " + bmv.color +
                " Год выпуска: " + bmv.productionYear +
                " Страна производства: " + bmv.productionCountry);



        Car kia = new Car("KIA",
                "Sportage 4-го поколения",
                2.4,
                "красный",
                2018,
                "Южная Корея");

        System.out.println("Марка автомобиля: " + kia.brand +
                " Модель " + kia.model +
                " Объем двигателя " + kia.engineVolume +
                " Цвет кузова: " + kia.color +
                " Год выпуска:"  + kia.productionYear +
                " Страна производства: " + kia.productionCountry);



        Car hyundai = new Car("Hyundai",
                "Avante",
                0,
                "оранжевый",
                2016,
                "Южная Корея");

        System.out.println("Марка автомобиля " + hyundai.brand +
                " Модель " + hyundai.model +
                " Объем двигателя " + hyundai.engineVolume +
                " Цвет кузова: " + hyundai.color +
                " Год выпуска: " + hyundai.productionYear +
                " Страна производства: " + hyundai.productionCountry);





    }
}