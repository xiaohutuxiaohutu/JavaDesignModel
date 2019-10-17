package xiaohutu.java;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        String webPath = System.getProperty("webroot.path");
        System.out.println(webPath);
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("user.dir"));
//        for(int i=0;i<10;i++){
//            System.out.println(UUID.randomUUID().toString());
//        }
        String property = System.getProperty("user.dir");
        System.out.println(property);
        Long nextValue = 4L;
        Long increaseValue = 1L;
        System.out.println(nextValue - increaseValue);
        List<vo> list = new ArrayList<>();
        String collect = list.stream().map(vo::getName).collect(Collectors.joining(","));
        System.out.println("collect:" + collect);

    }

    @Data
    public class vo {
        private String name;
        private String value;
    }

}
