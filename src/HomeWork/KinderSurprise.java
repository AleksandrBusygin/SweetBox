package HomeWork;

public class KinderSurprise extends Sweet {
    private String uhique;
    public KinderSurprise (String name, double price, double weight, String uhique){
        super(name,price,weight);
        this.uhique = uhique;
    }

    @Override
    public String toString() {
        return uhique;
    }
}
