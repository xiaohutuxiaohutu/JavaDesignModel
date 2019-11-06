package C4_MultitionPattern.init;

public class Minister {
    public static void main(String[] args) {
        int ministerNum = 10;
        for (int i = 0; i < ministerNum; i++) {
            Emperor emperor = Emperor.getInstance();
            System.out.print("􃄀" + (i + 1) + "􀏾􀻻􃞷􀦖􁢰􂱘􁰃􀋖");
            Emperor.emperorInfo();
        }
    }
}
