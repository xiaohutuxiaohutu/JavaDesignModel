package C3_SingletonPattern.init;

public class Emperor {
    private static Emperor emperor = null;

    private Emperor() {

    }

    public static Emperor getInstance() {
        if (null == emperor) {
            emperor = new Emperor();
        }
        return emperor;
    }

    public static void emperorInfo() {
        System.out.println("i am emperor....");
    }
}
