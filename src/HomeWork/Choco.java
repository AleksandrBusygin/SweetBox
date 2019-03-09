package HomeWork;

public class Choco extends Sweet {
    private String uhique;
    public Choco(String name, double price, double weight, String uhique){
        super(name,price,weight);
        this.uhique = uhique;
    }

    @Override
    public String toString() {
        return uhique;
    }
}
