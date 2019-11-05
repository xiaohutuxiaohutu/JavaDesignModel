package C22_InterpreterPattern.init;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Client {
    //􄖤􃸠􀲯􀟭􄖤􃅫
    public static void main(String[] args) throws IOException {
        String expStr = getExpStr();
//􄌟􀘐
        HashMap<String, Integer> var = getValue(expStr);
        Calculator cal = new Calculator(expStr);
        System.out.println("result:" + expStr + "=" + cal.run(var));
    }

    //􃦋􁕫􃸼􄖒􁓣
    public static String getExpStr() throws IOException {
        System.out.print("请输入表达式：");
        return (new BufferedReader(new InputStreamReader(System.in))).readLine();
    }

    public static HashMap<String, Integer> getValue(String exprStr) throws
            IOException {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (char ch : exprStr.toCharArray()) {
            if (ch != '+' && ch != '-') {
                if (!map.containsKey(String.valueOf(ch))) { //解决重复参数
                    System.out.print("请输入" + ch + "的:");
                    String in = (new BufferedReader(new InputStreamReader(System.in))).readLine();
                    map.put(String.valueOf(ch), Integer.valueOf(in));
                }
            }
        }
        return map;
    }
}
