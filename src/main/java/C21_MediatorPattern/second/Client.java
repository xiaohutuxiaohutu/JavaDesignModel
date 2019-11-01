package C21_MediatorPattern.second;

public class Client {
    public static void main(String[] args) {
        AbstractMediator mediator = new Mediator();
        System.out.println("------ purchase computer--------");
        Purchase purchase = new Purchase(mediator);
        purchase.buyIBMcomputer(100);
//􄫔􀬂􀒎􀨬􄫔􀬂􂬉􃛥
        System.out.println("\n------sale computer--------");
        Sale sale = new Sale(mediator);
        sale.sellIBMComputer(1);
//􁑧􁠓􃅵􂧚􀒎􀨬􃅵􂧚􁑧􁄬
        System.out.println("\n------clear computer--------");
        Stock stock = new Stock(mediator);
        stock.clearStock();
    }
}
