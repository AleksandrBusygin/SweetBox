package HomeWork;

public class Nutella extends Sweet {
    double percentOfCacao;
    public Nutella (double price, double weight, double percentOfCacao){
        super(price,weight);
        this.percentOfCacao = percentOfCacao;
    }

    @Override
    public String toString() {
        return super.toString() + "нутелла, " + "вес: " + weight + ", цена: " + price + ", процент какао: " + percentOfCacao + ".";
    }
}
