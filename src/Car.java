public class Car {
    String model;
    String mark;
    int releaseYear;
    String producedBy;
    String color;
    float engineVolume;

    public Car(String model, String mark, int releaseYear, String producedBy, String color, float engineVolume) {
//        this.model = model;
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
        }else{
            this.mark=mark;
        }
        if (color == null) {
            this.color = "белый";
        } else {
            this.color  = color;
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
    }

    @Override
    public String toString() {
        return "Автомобиль " + model +" марки " + mark + ". Год выпуска " + releaseYear + ". Страна сборки " + producedBy + ". Цвет автомобиля " + color + ". Объём двигателя " + engineVolume + " л.";
    }
}
