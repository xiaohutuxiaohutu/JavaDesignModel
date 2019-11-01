package C21_MediatorPattern.init;

public class Purchase {
    public void buyIBMcomputer(int number) {
        Stock stock = new Stock();
        Sale sale = new Sale();
        int saleStatus = sale.getSaleStatus();
        if (saleStatus > 80) { //􄫔􀬂􁚙􀞉􃡃􀽑
            System.out.println("purchase IBM :" + number + "个");
            stock.increase(number);
        } else { //􄫔􀬂􁚙􀞉􀏡􀽑
            int buyNumber = number / 2; //􁡬􀤞􄞛􄌁
            System.out.println("purchase IBM" + buyNumber + "个");
        }
    }

    public void refuseBuyIBM() {
        System.out.println("not purchase IBM");
    }
}
