package HomeWork;

public class Box implements BoxInter {

    private int countOfItemsInBox;
    private Sweet[] giftBoxArray;
    private boolean isFullBox;

    public Box(int countOfItem) {
        countOfItemsInBox = countOfItem;
        giftBoxArray = new Sweet[countOfItemsInBox];
        isFullBox = false;
    }

    @Override
    public void add(Sweet sweet) {
        if (!isFullBox) {
            for (int i = 0; i < giftBoxArray.length; i++) {
                if (giftBoxArray[i] == null) {
                    giftBoxArray[i] = sweet;
                    isFullBox = false;
                    return;
                } else {
                    isFullBox = true;
                }
            }
        }
        if (isFullBox)
            System.out.println("В коробке больше нет места. Невозможно добавить сладость " + sweet.name);
    }

    @Override
    public void delete(int indexDeleted) {
        try {
            giftBoxArray[indexDeleted] = null;
        } catch (Exception e) {
            System.out.println("Невозможно удалить сладость из коробки");
        }
    }

    @Override
    public double weightInfo() {
        double totalweigth = 0;
        for (int i = 0; i < giftBoxArray.length; i++) {
            if (giftBoxArray[i] != null) {
                totalweigth += giftBoxArray[i].weight;
            }
        }
        return totalweigth;
    }

    @Override
    public double priceInfo() {
        double totalprice = 0;
        for (int i = 0; i < giftBoxArray.length; i++) {
            if (giftBoxArray[i] != null) {
                totalprice += giftBoxArray[i].price;
            }
        }
        return totalprice;
    }

    @Override
    public void allInfo() {
        String info = "";
        for (int i = 0; i < giftBoxArray.length; i++) {
            if (giftBoxArray[i] != null) {
                info += "Наименование сладости: " + giftBoxArray[i].name + "; Вес сладости: " + giftBoxArray[i].weight + "; Цена сладости: " + giftBoxArray[i].price + "; Уникальный параметр сладости: " + giftBoxArray[i].toString() + String.format("%n");;
            }
        }
        System.out.println("Общая информация о сладостях в коробке: \n" + info);
    }

    public void reduceWeight(double weight)
    {
        //если в массиве есть элементы
        if (giftBoxArray.length > 0)
        {
            double totalWeight = weightInfo();
            int indexOfMinimum = 0;
            double minimum = giftBoxArray[0].price;
        //если обший вес больше того что нужно
            while (totalWeight > weight)
            {
                for (int i = 1; i < giftBoxArray.length; i++)
                {
                    if (minimum > giftBoxArray[i].weight)
                    {
                        minimum = giftBoxArray[i].weight;
                        indexOfMinimum = i;
                    }
                }
                giftBoxArray[indexOfMinimum] = null;
                totalWeight = weightInfo();
            }
        }
    }

    public void reducePrice(double price)
    {
        //если в массиве есть элементы
        if (giftBoxArray.length > 0)
        {
            double totalPrice = priceInfo();
            int indexOfMinimum = 0;
            double minimum = giftBoxArray[0].price;
        //если общая ценна больше той что нужно
            while (totalPrice > price)
            {
                for (int i = 0; i < giftBoxArray.length; i++)
                {
                    if (minimum > giftBoxArray[i].price)
                    {
                        minimum =giftBoxArray[i].price;
                        indexOfMinimum = i;
                    }
                }
                giftBoxArray[indexOfMinimum] = null;
                totalPrice = priceInfo();
            }

        }

    }

}