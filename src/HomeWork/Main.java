package HomeWork;

public class Main {
    public static void main(String[] args) {
        Sweet choco = new Choco(99,80,50);

       BoxInter box = new Box();
       box.add(choco);
       box.weightInfo(choco);
       box.priceInfo(choco);
       box.allInfo(choco);
    }

}
