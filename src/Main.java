public class Main {
    public static void main(String[] args) {
        System.out.println("Автомобили");

        Car lada = new Car();
        lada.brand = "Lada";
        lada.model = "Granta";
        lada.engineVolume = 1.7;
        lada.color = "желтый";
        lada.productionCountry = "Россия";
        lada.productionYear = 2015;
        lada.car();
        System.out.println();


        Car audi = new Car();
        audi.brand = "Audi";
        audi.model = "A8 50 L TDI quattro";
        audi.engineVolume = 3.0;
        audi.color = "черный";
        audi.productionCountry = "Германия";
        audi.productionYear = 2020;
        audi.car();
        System.out.println();

        Car bmv = new Car();
        bmv.brand = "BMW";
        bmv.model = "Z8";
        bmv.engineVolume = 3.0;
        bmv.color = "черный";
        bmv.productionCountry = "Германия";
        bmv.productionYear = 2020;
        bmv.car();
        System.out.println();

        Car kia = new Car();
        kia.brand = "KIA";
        kia.model = "Sportage 4-го поколения";
        kia.engineVolume = 2.4;
        kia.color = "красный";
        kia.productionCountry = "Южная Корея";
        kia.productionYear = 2018;
        kia.car();
        System.out.println();

        Car hyundai = new Car();
        hyundai.brand = "Hyundai";
        hyundai.model = "Avante";
        hyundai.engineVolume = 1.6;
        hyundai.color = "оранжевый";
        hyundai.productionCountry = "Южная Корея";
        hyundai.productionYear = 2016;
        hyundai.car();
        System.out.println();



    }
}