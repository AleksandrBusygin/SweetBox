package HomeWork;

public class Nutella extends Sweet {
    private String  uhique;
    public Nutella (String name, double price, double weight, String uhique){
        super(name,price,weight);
        this.uhique = uhique;
    }

    @Override
    public String toString() {
        return uhique;
    }
}
