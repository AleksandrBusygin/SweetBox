package HomeWork;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(4);
        box.add(new Choco("Шоколадка", 120,100,"не содержит лактозу"));
        box.add(new Nutella("Нутелла", 300,300, "шоколадно-ореховая паста"));
        box.add(new KinderSurprise("Киндер детский", 80, 50, "полезен для детей"));
        box.add(new Candy("Конфета жевательная", 25, 30, "не подходит людям с некачественными пломбами в зубах"));
        System.out.println("Общий вес подарка: " + box.weightInfo());
        System.out.println("Общая цена подарка: " + box.priceInfo());
        box.allInfo();
        box.reducePrice(450);
        box.allInfo();
        box.reduceWeight(500);
        box.allInfo();
    }
}
