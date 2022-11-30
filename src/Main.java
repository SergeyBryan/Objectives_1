import transport.Car;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Human maksim = new Human("Максим", "Минск", "бренд-менеджер", 1988);
        Human anna = new Human("Аня", "Москва", "методист образовательных программ", 1993);
        Human kate = new Human("Катя", "Калининград", "продакт-менеджером", 1992);
        Human artem = new Human("Артем", "Москва", "директор по развитию бизнеса", 1995);
        Human vladimir = new Human("Владимир", "", "", 0);
        System.out.println(maksim);
        System.out.println(anna);
        System.out.println(kate);
        System.out.println(artem);
        System.out.println(vladimir);
        Car ladaGranta = new Car("Lada", "Granta", 2015, "Россия", "желтый", 1.7f);
        Car audiA8 = new Car("Audi", "A8 L TDI quattro", 2020, "Германия", "черный", 3f);
        Car bmwz8 = new Car("BMW", "Z8", 2021, "Германия", "черный", 3f);
        Car kiaSportage4 = new Car("Kia", "Sportage 4-го поколения", 2018, "Южная Корея", "красный", 2.4f);
        Car hyundaiAvante = new Car("Hyundai", "Avante", 2016, "Южная Корея", "оранжевый", 1.6f);
        System.out.println(ladaGranta);
        System.out.println(audiA8);
        System.out.println(bmwz8);
        System.out.println(kiaSportage4);
        System.out.println(hyundaiAvante);
        ladaGranta.setInsurance(new Car.Insurance(null, 12000, "9292929"));
        ladaGranta.getInsurance().checkNumber();
        printInfo(bmwz8);
        printInfo(ladaGranta);
        System.out.println(hyundaiAvante.getGearbox() + " " + hyundaiAvante.getCarBodyType() + " " + hyundaiAvante.getSeats());
        Flower flower1 = new Flower("", "Голландия", 35.59f, 0);
        flower1.flowerName = "Роза";
        Flower flower2 = new Flower("", "", 15, 5);
        flower2.flowerName = "Хоризонтема";
        Flower flower3 = new Flower(" ", "Англия", 69.9f, 1);
        flower3.flowerName = "Пион";
        Flower flower4 = new Flower(" ", "Турция", 19.5f, 10);
        flower4.flowerName = "Гипсофила";
        float sumMoney = flower1.getCost() + flower2.getCost() + flower3.getCost() + flower4.getCost();
        System.out.println(flower1.getFlowerColor());
        System.out.println(flower2.getCountry());
        System.out.println(flower1);
        System.out.println(flower2);
        System.out.println(flower3);
        System.out.println(flower4);
        System.out.println(sumMoney);
        printCostOfFlowers(flower3, flower4, flower3, flower3, flower3);
    }

    public static void printCostOfFlowers(Flower... flowers) {
        double totalCost = 0;
        int minimumLifeSpan = Integer.MAX_VALUE;
        for (Flower flower : flowers) {
            if (flower.lifeSpan < minimumLifeSpan) {
                minimumLifeSpan = flower.lifeSpan;
            }
            totalCost += flower.getCost();

        }
        totalCost = totalCost * 1.1;
        System.out.println("Стоимость букета: " + totalCost);
        System.out.println("" + minimumLifeSpan);
    }

    public static void printInfo(Car car) {
        System.out.println(
                car.getMark() + " " + car.getModel() +
                        ", год выпуска " + car.getReleaseYear() +
                        ", страна сборки " + car.getProducedBy() +
                        ", цвет кузова " + car.getColor() +
                        ", объем двигателя " + car.getEngineVolume() +
                        ", коробка передач " + car.getGearbox() +
                        ", тип кузова " + car.getCarBodyType() +
                        ", рег. номер " + car.getRegNumber() +
                        ", кол-во мест " + car.getSeats() +
                        ", " + (car.isRubberIsSummer() ? "летняя" : "зимняя") + " резина" +
                        ", " + (car.getKey().isRadioEngineLaunching() ? "безключевой доступ" : "доступ с ключем") +
                        ", " + (car.getKey().isDigitalCarAccess() ? "удаленный запуск" : "обычный запуск") +
                        ", номер страховки: " + car.getInsurance().getNumber() +
                        ", стоимость: " + car.getInsurance().getCost() +
                        ", срок действия страховки: " + car.getInsurance().getPeriodOfInsurance()
        );
    }
}