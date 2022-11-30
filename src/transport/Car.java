package transport;

import java.time.LocalDate;
import java.time.Year;
import java.time.YearMonth;

public class Car {
    private final String model;
    private final String mark;
    private final int releaseYear;
    private final String producedBy;
    private String color;
    private float engineVolume;
    private String gearbox;
    private final String carBodyType;
    private String regNumber;
    private final int seats;
    private boolean rubberIsSummer;
    private Key key;
    private Insurance insurance;


    public Car(String model,
               String mark,
               int releaseYear,
               String producedBy,
               String color,
               float engineVolume,
               String gearbox,
               String carBodyType,
               String regNumber,
               int seats,
               boolean rubberIsSummer,
               Key key,
               Insurance insurance) {

        if (model == null) {
            this.model = "Default";
        } else {
            this.model = model;
        }
        if (producedBy == null) {
            this.producedBy = "Default";
        } else {
            this.producedBy = producedBy;
        }
        if (mark == null) {
            this.mark = "Default";
        } else {
            this.mark = mark;
        }
        if (color == null) {
            this.color = "белый";
        } else {
            this.color = color;
        }
        if (releaseYear <= 0) {
            this.releaseYear = 2000;
        } else {
            this.releaseYear = releaseYear;
        }
        if (engineVolume <= 0) {
            this.engineVolume = 1.5f;
        } else {
            this.engineVolume = engineVolume;
        }
        if (gearbox == null) {
            this.gearbox = "МКПП";
        } else {
            this.gearbox = gearbox;
        }
        if (regNumber == null) {
            this.regNumber = "x000xx000";
        } else {
            this.regNumber = regNumber;
        }
        if (carBodyType == null) {
            this.carBodyType = "Седан";
        } else {
            this.carBodyType = carBodyType;
        }
        if (key == null) {
            this.key = new Key();
        } else {
            this.key = key;
        }
        if (insurance == null) {
            this.insurance = new Insurance();
        } else {
            this.insurance = insurance;
        }
        this.seats = 5;
        this.rubberIsSummer = true;
    }

    public Car(String model,
               String mark,
               int releaseYear,
               String producedBy,
               String color,
               float engineVolume) {
        this(model, mark, releaseYear, producedBy, color, engineVolume, "МКПП", "x000xx000", "Седан", 5, true, new Key(), new Insurance());
    }

    //GETTERS
    public String getModel() {
        return model;
    }

    public String getMark() {
        return mark;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String getProducedBy() {
        return producedBy;
    }

    public String getColor() {
        return color;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public String getGearbox() {
        return gearbox;
    }

    public String getCarBodyType() {
        return carBodyType;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public boolean isRubberIsSummer() {
        return rubberIsSummer;
    }

    public int getSeats() {
        return seats;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public Key getKey() {
        return key;
    }

    //SETTERS
    public void setColor(String color) {
        this.color = color;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setGearbox(String gearbox) {
        if (gearbox == null) {
            this.gearbox = "МКПП";
        } else {
            this.gearbox = gearbox;
        }
    }

    public void setRegNumber(String regNumber) {
        if (regNumber == null) {
            this.regNumber = "000xx000";
        } else {
            this.regNumber = regNumber;
        }
    }

    public void setRubberIsSummer(boolean rubberIsSummer) {
        this.rubberIsSummer = rubberIsSummer;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    //    METHODS
    public void changeWheels() {
        rubberIsSummer = !rubberIsSummer;
    }

    public boolean isCorrectRegNumber() {
        if (regNumber.length() != 9) {
            return false;
        }
        char chars[] = regNumber.toCharArray();
        if (Character.isAlphabetic(chars[0]) || !Character.isDigit(4) || !Character.isDigit(5)) {
            return false;
        }
        if (!Character.isDigit(chars[1]) || !Character.isDigit(chars[2]) || !Character.isDigit(chars[3]) || !Character.isDigit(chars[7]) || !Character.isDigit(chars[8])) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Автомобиль " + model + " марки " + mark + ". Год выпуска " + releaseYear + ". Страна сборки " + producedBy + ". Цвет автомобиля " + color + ". Объём двигателя " + engineVolume + " л.";
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Car car = (Car) object;
        return releaseYear == car.releaseYear && java.lang.Float.compare(car.engineVolume, engineVolume) == 0 && seats == car.seats && rubberIsSummer == car.rubberIsSummer && java.util.Objects.equals(model, car.model) && java.util.Objects.equals(mark, car.mark) && java.util.Objects.equals(producedBy, car.producedBy) && java.util.Objects.equals(color, car.color) && java.util.Objects.equals(gearbox, car.gearbox) && java.util.Objects.equals(carBodyType, car.carBodyType) && java.util.Objects.equals(regNumber, car.regNumber);
    }

    public static class Key {
        private final boolean radioEngineLaunching;
        private final boolean digitalCarAccess;

        public Key(boolean radioEngineLaunching, boolean digitalCarAccess) {
            this.radioEngineLaunching = radioEngineLaunching;
            this.digitalCarAccess = digitalCarAccess;
        }

        public Key() {
            this(false, false);
        }

        public boolean isRadioEngineLaunching() {
            return radioEngineLaunching;
        }

        public boolean isDigitalCarAccess() {
            return digitalCarAccess;
        }
    }

    public static class Insurance {
        private final LocalDate periodOfInsurance;
        private final double cost;
        private final String number;

        public Insurance(LocalDate periodOfInsurance, double cost, String number) {
            if (periodOfInsurance == null) {
                this.periodOfInsurance = LocalDate.now().plusDays(365);
            } else {
                this.periodOfInsurance = periodOfInsurance;
            }
            this.cost = cost;
            if (number == null) {
                this.number = "123456789";
            } else {
                this.number = number;
            }
        }

        public Insurance() {
            this(null, 10000, null);
        }

        public LocalDate getPeriodOfInsurance() {
            return periodOfInsurance;
        }

        public double getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }

        public void checkPeriodOfInsurance() {
            if (periodOfInsurance.isBefore(LocalDate.now()) || periodOfInsurance.isEqual(LocalDate.now())) {
                System.out.println("Срочно менять страховку");
            }
        }

        public void checkNumber() {
            if (number.length() != 9) {
                System.out.println("Номер страховки некорректный");
            }
        }
    }
}
