package HomeWork;

public class Box implements BoxInter {

    private Sweet[] giftBoxArray;
    private boolean isFullBox;

    public Box() {
        giftBoxArray = new Sweet[0];
        isFullBox = false;
    }

    @Override
    public void add(Sweet sweet) {
        Sweet[] newGiftBox = new Sweet[giftBoxArray.length + 1];
        for (int i = 0; i < giftBoxArray.length; i++) {
            newGiftBox[i] = giftBoxArray[i];
        }
        newGiftBox[giftBoxArray.length] = sweet;
        giftBoxArray = newGiftBox;
    }

    @Override
    public void delete(int indexDeleted) {
        Sweet[] newGiftBox = new Sweet[giftBoxArray.length - 1];
        giftBoxArray[indexDeleted] = null;
        int count = 0;
        for (int i = 0; i < giftBoxArray.length; i++) {
            if (giftBoxArray[i] != null){
            newGiftBox[count] = giftBoxArray[i];
            count++;
            }
        }
        giftBoxArray = newGiftBox;
    }

    @Override
    public double weightInfo() {
        double totalweigth = 0;
        for (int i = 0; i < giftBoxArray.length; i++) {
            if (giftBoxArray[i] != null) {
                totalweigth += giftBoxArray[i].getWeight();
            }
        }
        return totalweigth;
    }

    @Override
    public double priceInfo() {
        double totalprice = 0;
        for (int i = 0; i < giftBoxArray.length; i++) {
            if (giftBoxArray[i] != null) {
                totalprice += giftBoxArray[i].getPrice();
            }
        }
        return totalprice;
    }

    @Override
    public void allInfo() {
        String info = "";
        for (int i = 0; i < giftBoxArray.length; i++) {
            if (giftBoxArray[i] != null) {
                info += "Наименование сладости: " + giftBoxArray[i].getName() + "; Вес сладости: " + giftBoxArray[i].getWeight() + "; Цена сладости: " + giftBoxArray[i].getPrice() + "; Уникальный параметр сладости: " + giftBoxArray[i].toString() + String.format("%n");;
            }
        }
        System.out.println("Общая информация о сладостях в коробке: \n" + info);
    }

    @Override
    public void reduceWeight(double weight)
    {
        //если в массиве есть элементы
        if (giftBoxArray.length > 0)
        {
            double totalWeight = weightInfo();
            int indexOfMinimum = 0;
            double minimum = giftBoxArray[0].getWeight();
        //если обший вес больше того что нужно
            while (totalWeight > weight)
            {
                minimum = giftBoxArray[0].getWeight();
                indexOfMinimum = 0;
                for (int i = 0; i < giftBoxArray.length; i++)
                {
                    if (minimum > giftBoxArray[i].getWeight())
                    {
                        minimum = giftBoxArray[i].getWeight();
                        indexOfMinimum = i;
                    }
                }
                delete(indexOfMinimum);
                totalWeight = weightInfo();
            }
        }
    }

    @Override
    public void reducePrice(double price)
    {
        if (giftBoxArray.length > 0)
        {
            double totalPrice = priceInfo();
            int indexOfMinimum = 0;
            double minimum = giftBoxArray[0].getPrice();
            //если обший вес больше того что нужно
            while (totalPrice > price)
            {
                minimum = giftBoxArray[0].getPrice();
                indexOfMinimum = 0;
                for (int i = 0; i < giftBoxArray.length; i++)
                {
                    if (minimum > giftBoxArray[i].getPrice())
                    {
                        minimum = giftBoxArray[i].getPrice();
                        indexOfMinimum = i;
                    }
                }
                delete(indexOfMinimum);
                totalPrice = priceInfo();
            }
        }

    }

}