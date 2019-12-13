package xiaohutu.java;

import lombok.Data;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Calendar;

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
        /*String property = System.getProperty("user.dir");
        System.out.println(property);
        Long nextValue = 4L;
        Long increaseValue = 1L;
        System.out.println(nextValue - increaseValue);
        List<vo> list = new ArrayList<>();
        String collect = list.stream().map(vo::getName).collect(Collectors.joining(","));
        System.out.println("collect:" + collect);
        String[] strings = list.stream().map(vo::getName).toArray(String[]::new);
        System.out.println("strings:" + strings.length);*/

        String format = "yyyMMdd";
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        DateFormatSymbols dateFormatSymbols = dateFormat.getDateFormatSymbols();
        String[] months = dateFormatSymbols.getMonths();
        for (String s : months) {
            System.out.println(s);
        }

        Calendar calendar = Calendar.getInstance();

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        System.out.println(year);
        System.out.println(month);
        System.out.println(day);


        boolean a = true;
        boolean b = false;
        boolean c = true;
        boolean d = false;
        System.out.println("true ^ false:" + (a ^ b));

        System.out.println("true ^ true:");
        System.out.println(a ^ c);

        System.out.println("false^true:");
        System.out.println(b ^ c);

        System.out.println("true^false");
        System.out.println(c ^ b);

        System.out.println("false^false");
        System.out.println(b ^ d);

        String s = ".479459ad-86a9-4c88-9ef2-56df4ccbac1c.f0818bd3-8c2b-4899-88d5-89f0e800404a.";
        String[] split = s.split("\\.");
        for (String ss : split) {
            System.out.println(ss);
        }

    }

    @Data
    public class vo {
        private String name;
        private String value;
    }

}
