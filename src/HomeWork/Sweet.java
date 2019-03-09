package HomeWork;

public abstract class Sweet {
    String name;
    double price, weight;

    public Sweet(String name, double price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }
    @Override
    public String toString() {
        return "Тип сладкого подарка: " + name;
    }
}


