package C10_BuilderPattern.third;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        for (int i = 0; i < 10; i++) {
            System.out.println("create -" + i);
            director.getABenzModel().run();
        }
    }
}
