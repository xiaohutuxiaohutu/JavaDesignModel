package C5_FactoryMethodPattern.second;

import C5_FactoryMethodPattern.init.Human;
import untils.ClassUtils;

import java.util.List;
import java.util.Random;

/**
 * 随机产生
 */
public class HumanFactory {
    public static Human createHuman(Class c) {
        Human human = null;
        try {
            human = (Human) Class.forName(c.getName()).newInstance();
        } catch (IllegalAccessException e) {
            System.out.println("人类定义错误");
            e.printStackTrace();
        } catch (InstantiationException e) {
            System.out.println("必须制定人类的颜色");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("找不到类");
            e.printStackTrace();
        }
        return human;
    }

    public static Human CreateHuman() {
        Human human = null;
        List<Class> classByInterface =
                ClassUtils.getAllClassByInterface(Human.class);
        Random random = new Random();
        int anInt = random.nextInt(classByInterface.size());
        human = createHuman(classByInterface.get(anInt));
        return human;
    }
}
