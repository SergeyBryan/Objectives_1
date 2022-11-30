import javax.print.attribute.standard.MediaSize;

public class Flower {
    public Flower[]flowers = new Flower[10];
    private String flowerColor;
    private String country;
    private float cost;
    int lifeSpan;
    String flowerName;


    public Flower(String flowerColor, String country, float cost, int lifeSpan) {
        if (flowerColor == null || flowerColor.isEmpty() || flowerColor.isBlank()) {
            this.flowerColor = "Белый";
        } else {
            this.flowerColor = flowerColor;
        }
        if (country == null || country.isEmpty() || country.isBlank()) {
            this.country = "Россия";
        } else {
            this.country = country;
        }
        if (cost <= 0) {
            this.cost = 1;
        } else {
            this.cost = cost;
        }
        if (lifeSpan <= 0) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }
    }

    //          SETTER&GETTER
    public String getFlowerColor() {
        return flowerColor;
    }

    public String getCountry() {
        return country;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public float getCost() {
        return cost;
    }
    public float getSum(int i) {
        float sumFlo = i * this.cost;
        return sumFlo;
    }
    public void tax (float i) {
        float sumTax = (float) (i * 1.1);
         System.out.printf("Букет будет стоить "+ sumTax);
    }
    @Override
    public String toString() {
        return "Цветок "+flowerName+". Цвет "+getFlowerColor() + ". Страна производства " + getCountry() + ". Стоимость " + getCost()+" руб." + " Срок стояния " + getLifeSpan() + " дней.";
    }
}
