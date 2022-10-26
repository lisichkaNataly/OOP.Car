package transport;

public class Car {

   private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int productionYear;
    private final String productionCountry;
    private String gears;
    private final String typeOfBody;
    private String regNumber;
    private final int seatCount;
    private boolean summerTyres;

    public Car(String brand,
               String model,
               double engineVolume,
               String color,
               int productionYear,
               String productionCountry,
               String gears,
               String typeOfBody,
               String regNumber,
               int seatCount,
               boolean summerTyres) {
            if (brand == null) {
                this.brand = "default";
            } else {
                this.brand = brand;
            }

            if (model == null) {
                this.model = "default";
            } else {
                this.model = model;
            }

            if (productionCountry == null) {
                this.productionCountry = "default";
            } else {
                this.productionCountry = productionCountry;
            }
                this.engineVolume = engineVolume;

            if (color == null) {
                this.color = "белый";
            } else {
                this.color = color;
            }
            this.productionYear = productionYear;
        if (gears == null) {
            this.gears = "МКПП";
        } else {
            this.gears= gears;
        }
        if (regNumber == null) {
            this.regNumber = "х000хх000";
        } else {
            this.regNumber = regNumber;
        }
        if (typeOfBody == null) {
            this.typeOfBody = "седан";
        } else {
            this.typeOfBody = typeOfBody;
        }

            this.seatCount = seatCount;
            this.summerTyres = summerTyres;
        }


    public Car(String brand,
        String model,
        double engineVolume,
        String color,
        int productionYear,
        String productionCountry) {
        this(brand, model, engineVolume, color, productionYear, productionCountry,
                "МКПП",
                "седан",
                "х000хх000",
                5,
                true);
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setGears(String gears) {
        if (gears == null) {
            this.gears = "МКПП";
        } else {
        this.gears = gears;
    }}

    public void setRegNumber(String regNumber) {
        if (regNumber == null) {
            this.regNumber = "х000хх000";
        } else {
            this.regNumber = regNumber;
        }

    }

    public void setSummerTyres(boolean summerTyres) {
        this.summerTyres = summerTyres;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public String getGears() {
        return gears;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public boolean isSummerTyres() {
        return summerTyres;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getTypeOfBody() {
        return typeOfBody;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void changeTyres() {
        summerTyres = !summerTyres;
    }

    public boolean isCorrectRegNumber() {
        if (regNumber.length() != 9) {
            return false;
        }
        char[] chars = regNumber.toCharArray();
        if (Character.isAlphabetic(chars[0]) || !Character.isDigit(chars[4]) || !Character.isDigit(chars[5])) {
            return false;
        }
        if (!Character.isDigit(chars[1]) || !Character.isDigit(chars[2]) || !Character.isDigit(chars[3])
        || !Character.isDigit(chars[6]) || !Character.isDigit(chars[7]) || !Character.isDigit(chars[8])) {
            return false;
        }
        return true;
    }
}