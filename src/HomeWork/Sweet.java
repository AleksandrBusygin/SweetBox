package HomeWork;

public abstract class Sweet {
    double price, weight;

    public Sweet(double price, double weight) {
        this.price = price;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Тип сладкого подарка: ";
    }
}


