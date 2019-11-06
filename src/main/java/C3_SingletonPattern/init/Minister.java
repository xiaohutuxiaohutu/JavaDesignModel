package C3_SingletonPattern.init;

public class Minister {
    public static void main(String[] args) {
        Emperor instance = Emperor.getInstance();
        Emperor.emperorInfo();
        Emperor instance1 = Emperor.getInstance();
        Emperor.emperorInfo();
    }
}
