package C5_FactoryMethodPattern.init;

public class HumanFactory {
    public static Human createHuman(Class c) {
        Human human = null; //ᅮНϔϾ㉏ൟⱘҎ㉏

        try {
            human = (Human) Class.forName(c.getName()).newInstance(); //ѻ⫳ϔϾ

        } catch (InstantiationException e) {//Դ㽕ᰃϡ䇈ϾҎ㉏买㡆ⱘ䆱ˈ≵⊩⚸ˈ㽕ⱑⱘ

            System.out.println("ᖙ乏ᣛᅮҎ㉏ⱘ买㡆");
        } catch (IllegalAccessException e) {
        } catch (ClassNotFoundException e) {
            System.out.println("not class found");
        }

        return human;
    }
}