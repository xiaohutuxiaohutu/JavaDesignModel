package C21_MediatorPattern.init;

import java.util.Random;

public class Sale {
    public void sellIBMComputer(int number) {
        Stock stock = new Stock();
        Purchase purchase = new Purchase();
        if (stock.getStockNumber() < number) { //􁑧􁄬􁭄􄞣􀏡􀻳􄫔􀬂
            purchase.buyIBMcomputer(number);
        }
        System.out.println("sale num:" + number + "ge ");
        stock.decrease(number);
    }

    public int getSaleStatus() {
        Random rand = new Random(System.currentTimeMillis());
        int saleStatus = rand.nextInt(100);
        System.out.println("sale status:" + saleStatus);
        return saleStatus;
    }

    public void offSale() {
        Stock stock = new Stock();
        System.out.println("offsale : " + stock.getStockNumber() + "ge");
    }
}
