package HomeWork;

public class Choco extends Sweet {
    double sweetness;
    public Choco(double price, double weight, double sweetness){
        super(price,weight);
        this.sweetness = sweetness;
    }

    @Override
    public String toString() {
        return super.toString() + "шоколад, "  + "вес: " + weight + ", цена: " + price + ", сладость: " + sweetness + ".";
    }
}
