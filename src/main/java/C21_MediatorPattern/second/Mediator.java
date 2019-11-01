package C21_MediatorPattern.second;

public class Mediator extends AbstractMediator {
    public void execute(String str, Object... objects) {
        if (str.equals("purchase.buy")) { //buy
            this.buyComputer((Integer) objects[0]);
        } else if (str.equals("sale.sell")) { //sale
            this.sellComputer((Integer) objects[0]);
        } else if (str.equals("sale.offsell")) { //offSale
            this.offSell();
        } else if (str.equals("stock.clear")) { //clear
            this.clearStock();
        }
    }

    private void buyComputer(int number) {
        int saleStatus = super.sale.getSaleStatus();
        if (saleStatus > 80) { //􄫔􀬂􁚙􀞉􃡃􀽑
            System.out.println("􄞛􄌁IBM􂬉􃛥:" + number + "􀧄");
            super.stock.increase(number);
        } else { //􄫔􀬂􁚙􀞉􀏡􀽑
            int buyNumber = number / 2; //􁡬􀤞􄞛􄌁
            System.out.println("􄞛􄌁IBM􂬉􃛥􀋖" + buyNumber + "􀧄");
        }
    }

    private void sellComputer(int number) {
        if (super.stock.getStockNumber() < number) { //􁑧􁄬􁭄􄞣􀏡􀻳􄫔􀬂
            super.purchase.buyIBMcomputer(number);
        }
        super.stock.decrease(number);
    }

    private void offSell() {
        System.out.println("off sale IBM :" + stock.getStockNumber() + "ge");
    }

    private void clearStock() {
        super.sale.offSale();
        super.purchase.refuseBuyIBM();
    }

}
