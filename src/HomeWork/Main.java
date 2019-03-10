package HomeWork;

public class Main {
    public static void main(String[] args) {
        Box box = new Box();

        if (box.weightInfo() == 0){
            System.out.println("Коробка пустая");
        }
        else {
            System.out.println("Общий вес подарка: " + box.weightInfo());
        }
        if (box.priceInfo() == 0){
            System.out.println("Коробка пустая");
        }
        else {
            System.out.println("Общая цена подарка: " + box.priceInfo());
        }

        box.delete(7);
        box.allInfo();
        box.reducePrice(300);
        box.allInfo();

    }
}
