package HomeWork;

public class Main {
    public static void main(String[] args) {
        Box box = new Box();
        System.out.println("Общий вес подарка: " + box.weightInfo());
        System.out.println("Общая цена подарка: " + box.priceInfo());
        box.delete(7);
        box.allInfo();
        box.reducePrice(300);
        box.allInfo();

    }
}
