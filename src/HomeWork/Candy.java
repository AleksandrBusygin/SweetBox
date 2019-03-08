package HomeWork;

public class Candy extends Sweet {
    String composition;
    public Candy (double price, double weight,String composition){
        super(price,weight);
        this.composition = composition;
    }

    @Override
    public String toString() {
        return super.toString() + "конфета \"Трюфель\", " + " вес: " + weight + ", цена: " + price +  ", состав: " + composition + ".";
    }
}
