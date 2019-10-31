package C20_PrototypePattern.copy;

import java.util.ArrayList;

public class Thing implements Cloneable {
    private ArrayList<String> arrayList = new ArrayList<String>();

    public Thing() {
        System.out.println("构造方法被执行了...");
    }

    @Override
    public Thing clone() {
        Thing thing = null;
        try {
            thing = (Thing) super.clone();
            //增加以下代码，才会深拷贝，即引用对象也会被拷贝
            thing.arrayList = (ArrayList<String>) this.arrayList.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return thing;
    }

    public void setValue(String value) {
        this.arrayList.add(value);
    }

    //􀦪􁕫arrayList􂱘􀘐
    public ArrayList<String> getValue() {
        return this.arrayList;
    }

    public static void main(String[] args) {
        Thing thing = new Thing();
        //clone时 构造方式不会被clone
        Thing clone = thing.clone();
        //浅拷贝--只拷贝本对象，除了原始类型外（包括string）;对象内部的数组，引用对象都不拷贝，还是指向原生对象的元素地址
        //即 拷贝对象与原对象共享私有变量，
        Thing thing1 = new Thing();
        thing1.setValue("张三");
        Thing clone1 = thing1.clone();
        clone1.setValue("李四");
        System.out.println(thing1.getValue());
    }
}
