package lesson10.ex4;

public class Tshirt extends Clothing implements MensCloth, WomensCloth {
    private String smell;

    public Tshirt(Clothes size, double price, String color, String smell) {
        super(size, price, color);
        this.smell = smell;
    }

    public String getSmell() {
        return smell;
    }

    public void setSmell(String smell) {
        this.smell = smell;
    }

    @Override
    public String toString() {
        return "Tshirt{" +
                "smell='" + smell + '\'' +
                "} " + super.toString();
    }

    @Override
    public String dressMen() {
        return "Men's T-shirt";
    }

    @Override
    public String dressWom() {
        return "Women's T-shirt";
    }
}

