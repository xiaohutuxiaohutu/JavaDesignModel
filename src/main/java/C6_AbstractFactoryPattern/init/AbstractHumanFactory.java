package C6_AbstractFactoryPattern.init;

import org.apache.commons.lang.StringUtils;

public abstract class AbstractHumanFactory implements HumanFactory {
    protected Human createHuman(HumanEnum humanEnum) {
        Human human = null;
        if (!StringUtils.isEmpty(humanEnum.getValue())) {
            try {
                human = (Human) Class.forName(humanEnum.getValue()).newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }

        return human;
    }
}
