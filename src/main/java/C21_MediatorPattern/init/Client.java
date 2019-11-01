package C21_MediatorPattern.init;

public class Client {
    public static void main(String[] args) {
        System.out.println("------purchase computer --------");
        Purchase purchase = new Purchase();
        purchase.buyIBMcomputer(100);
        System.out.println("\n------ sale computer--------");
        Sale sale = new Sale();
        sale.sellIBMComputer(1);
        System.out.println("\n------clear stock --------");
        Stock stock = new Stock();
        stock.clearStock();
    }
}
