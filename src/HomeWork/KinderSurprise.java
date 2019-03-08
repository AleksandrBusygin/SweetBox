package HomeWork;

public class KinderSurprise extends Sweet {
    double size;
    public KinderSurprise (double price, double weight, double size){
        super(price,weight);
        this.size = size;
    }

    @Override
    public String toString() {
        return super.toString() + "киндер сюрприз, " + " вес: " + weight + ", цена: " + price +  ", размер: " + size + ".";
    }
}
