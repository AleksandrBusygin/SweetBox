package HomeWork;

public class Box implements BoxInter {

    private double totalWeight;
    private double totalPrice;
    private Sweet[] giftBoxArray = new Sweet[1];

    @Override
    public void add(Sweet sweet) {
        for (int i=0; i < giftBoxArray.length; i++ ){
            if (giftBoxArray[i] == null){
                giftBoxArray[i] = sweet;
            }
        }
    }
    @Override
    public void remove(Sweet sweet) {
        for (int i=0; i < giftBoxArray.length; i++ ){
            if (giftBoxArray[i] == sweet){
                giftBoxArray[i] = null;
                return;
            }
        }
    }
    @Override
    public void weightInfo(Sweet sweet) {
        double count = 0;
        for (int i=0; i < giftBoxArray.length; i++ ){
                count += giftBoxArray[i].weight;
            }
        System.out.println(count);
    }
    @Override
    public void priceInfo(Sweet sweet) {
        double count = 0;
        for (int i=0; i < giftBoxArray.length; i++ ){
            count += giftBoxArray[i].price;
        }
        System.out.println(count);
    }
    @Override
    public void allInfo(Sweet sweet) {
        totalPrice = 0;
        totalWeight = 0;
        for (int i=0; i < giftBoxArray.length; i++ ){
            totalPrice += giftBoxArray[i].price;
            totalWeight += giftBoxArray[i].weight;
        }
        System.out.println(sweet.toString());
        System.out.println("Общий вес: " + totalWeight + "; общая стоимость: " + totalPrice + ".");
    }
}


