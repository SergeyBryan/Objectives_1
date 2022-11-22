public class Main {
    public static void main(String[] args) {
        Human maksim = new Human("Максим", "Минск", "бренд-менеджер", 1988);
        Human anna = new Human("Аня", "Москва", "методист образовательных программ", 1993);
        Human kate = new Human("Катя", "Калининград", "продакт-менеджером", 1992);
        Human artem = new Human("Артем", "Москва", "директор по развитию бизнеса", 1995);
        System.out.println(maksim);
        System.out.println(anna);
        System.out.println(kate);
        System.out.println(artem);
        Car ladaGranta = new Car("Lada","Granta", 2015, "Россия", "желтый", 1.7f);
        Car audiA8 = new Car("Audi","A8 L TDI quattro", 2020, "Германия", "черный", 3f);
        Car bmwz8 = new Car("BMW","Z8", 2021, "Германия", "черный", 3f);
        Car kiaSportage4 = new Car("Kia", "Sportage 4-го поколения",2018, "Южная Корея", "красный", 2.4f);
        Car hyundaiAvante = new Car("Hyundai", "Avante",2016, "Южная Корея", "оранжевый", 1.6f);
        System.out.println(ladaGranta);
        System.out.println(audiA8);
        System.out.println(bmwz8);
        System.out.println(kiaSportage4);
        System.out.println(hyundaiAvante);
    }
}