package HomeWork;

public abstract class Sweet {
    private String name;
    private double price, weight;
    public Sweet(String name, double price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }
    public String getName(){
        return  name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getPrice(){
        return  price;
    }
    public void setPrice(double price) {
        if (price < 0){
            System.out.println("Цена может иметь только положительное значение");
        }
        this.price = price;
    }
    public double getWeight(){
        return weight;
    }
    public void setWeight(double weight){
        if (weight < 0){
            System.out.println("Вес может иметь только положительное значение");
        }
        this.weight = weight;
    }
    @Override
    public String toString() {
        return "Тип сладкого подарка: " + name;
    }
}


