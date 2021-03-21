package de.dumbuya;

import java.util.Map;
/*  A program that simulates an e-shop system
    Items can continue to be added to the basket, but it should not be possible to
    reserve more than the available stock of any item. An item's available stock
    is the stock count less the reserved amount. The stock count for each item is reduced when a basket is checked out, at which
    point all reserved items in the basket have their actual stock count reduced.

    Once checkout is complete, the contents of the basket are cleared.
    It should also be possible to "unreserve" items that were added to the basket
    by mistake. The program should prevent any attempt to unreserve more items than were
    reserved for a basket.

    Add code to Main that will unreserve items after they have been added to the basket,
    as well as unreserving items that have not been added to make sure that the code
    can cope with invalid requests like that. After checking out the baskets, display the
    full stock list and the contents of each basket that you created.  */

public class Main {
    private static StockList stockList = new StockList();

    public static void main(String[] args) {
        StockItem temp = new StockItem("bread", 0.86, 100);
        stockList.addStock(temp);

        temp = new StockItem("cake", 1.10, 7);
        stockList.addStock(temp);

        temp = new StockItem("car", 12.50, 2);
        stockList.addStock(temp);

        temp = new StockItem("chair", 62.0, 10);
        stockList.addStock(temp);

        temp = new StockItem("cup", 0.50, 200);
        stockList.addStock(temp);
        temp = new StockItem("cup", 0.45, 7);
        stockList.addStock(temp);

        temp = new StockItem("door", 72.95, 4);
        stockList.addStock(temp);

        temp = new StockItem("juice", 2.50, 36);
        stockList.addStock(temp);

        temp = new StockItem("phone", 96.99, 35);
        stockList.addStock(temp);

        temp = new StockItem("towel", 2.40, 80);
        stockList.addStock(temp);

        temp = new StockItem("vase", 8.76, 40);
        stockList.addStock(temp);

        System.out.println(stockList);

        for (String s : stockList.Items().keySet()) {
            System.out.println(s);
        }

        Basket mosesBasket = new Basket("Moses");
        sellItem(mosesBasket, "car", 1);
        System.out.println(mosesBasket);

        sellItem(mosesBasket, "car", 1);
        System.out.println(mosesBasket);

        if (sellItem(mosesBasket, "car", 1) != 1) {
            System.out.println("There are no more cars in the stock");
        }

        sellItem(mosesBasket, "spanner", 5);

        sellItem(mosesBasket, "juice", 4);
        sellItem(mosesBasket, "cup", 12);
        sellItem(mosesBasket, "bread", 1);
        //System.out.println(mosesBasket);

        //System.out.println(stockList);

        Basket basket = new Basket("customer");
        sellItem(basket, "cup", 100);
        sellItem(basket, "juice", 5);
        removeItem(basket, "cup", 1);
        System.out.println(basket);

        removeItem(mosesBasket, "car", 1);
        removeItem(mosesBasket, "cup", 9);
        removeItem(mosesBasket, "car", 1);
        System.out.println("cars removed: " + removeItem(mosesBasket, "car", 1));  // should not remove any
        System.out.println(mosesBasket);

        removeItem(mosesBasket, "bread", 1);
        removeItem(mosesBasket, "cup", 3);
        removeItem(mosesBasket, "juice", 4);
        removeItem(mosesBasket, "cup", 3);

        System.out.println("\nDisplay stock list before and after checkout");
        System.out.println(basket);
        System.out.println(stockList);
        checkout(basket);
        System.out.println(basket);
        System.out.println(stockList);


        /*
        temp = new StockItem("pen", 1.12);
        stockList.Items().put(temp.getName(), temp);
         */
        StockItem car = stockList.Items().get("car");
        if(car != null) {
            car.adjustStock(2000);
        }
        if(car != null) {
            stockList.get("car").adjustStock(-1000);
        }
        System.out.println(stockList);

        // for(Map.Entry<String, Double> price: stockList.PriceList().entrySet()) {
        //            System.out.println(price.getKey() + " costs " + price.getValue());
        //        }

        checkout(mosesBasket);
        System.out.println(mosesBasket);

    }

    public static int sellItem(Basket basket, String item, int quantity) {
        //retrieve the item from the stocklist
        StockItem stockItem = stockList.get(item);
        if (stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }
        if (stockList.reserveStock(item, quantity) != 0) {
            return basket.addToBasket(stockItem, quantity);
        }
        return 0;
    }

    public static int removeItem(Basket basket, String item, int quantity) {
        //retrieve the item from the stocklist
        StockItem stockItem = stockList.get(item);
        if (stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }
        if (basket.removeFromBasket(stockItem, quantity) == quantity) {
            return stockList.unreserveStock(item, quantity);
        }
        return 0;
    }

    public static void checkout(Basket basket) {
        //retrieve the item from the stocklist
        for (Map.Entry<StockItem, Integer> item : basket.Items().entrySet()) {
            stockList.sellStock(item.getKey().getName(), item.getValue());
        }
        basket.clearBasket();
    }
}
