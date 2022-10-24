public class Main {
    public static void main(String[] args) {
        System.out.println("Автомобили");

        Car lada = new Car("Lada", "Granta", 1.7, "желтый", 2015, "Россия");
        lada.car();
        System.out.println();


        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия");
        audi.car();
        System.out.println();

        Car bmv = new Car("BMV", "Z8", 3.0, "черный", 2020, "Германия");
        bmv.car();
        System.out.println();

        Car kia = new Car("KIA", "Sportage 4-го поколения",2.4, "красный", 2018, "Южная Корея");
        kia.car();
        System.out.println();

        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея");
        hyundai.car();
        System.out.println();



    }
}