package DecoratorPattern;

public class SortDecorator extends Decorator {
    public SortDecorator(SchoolReport sr) {
        super(sr);
    }
    private void resportSort(){
        System.out.println("range 38-38");
    }
    public void report(){
        super.report();
        this.resportSort();
    }
}
