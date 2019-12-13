package C5_FactoryMethodPattern.third;

import C5_FactoryMethodPattern.init.Human;

import java.util.HashMap;

/**
 * 工厂模式应用-延迟初始化
 */
public class HumanFactory {
    private static HashMap<String, Human> humans = new HashMap<>();

    public static Human createHuman(Class c) {
        Human human = null;
        try {
            if (humans.containsKey(c.getSimpleName())) {
                human = humans.get(c.getSimpleName());
            } else {
                human = (Human) Class.forName(c.getName()).newInstance();
                humans.put(c.getSimpleName(), human);
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return human;
    }
}
