package HomeWork;

public class Candy extends Sweet {
    private String uhique;

    public Candy(String name, double price, double weight, String uhique) {
        super(name, price, weight);
        this.uhique = uhique;
    }

    @Override
    public String toString() {
        return uhique;
    }
}
