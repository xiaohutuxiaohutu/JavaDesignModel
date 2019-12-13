package untils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.List;

public class ClassUtils {
    //根据接口，返回接口所有的实现类
    public static List<Class> getAllClassByInterface(Class c) {
        List<Class> returnClassList = new ArrayList<>();
        if (c.isInterface()) {
            String packageName = c.getPackage().getName();
            try {
                List<Class> allClass = getClasses(packageName);
                for (Class cla : allClass) {
                    if (c.isAssignableFrom(cla) && !c.equals(cla)) {//判断是不是同一个接口
                        returnClassList.add(cla);
                    }

                }
            } catch (ClassNotFoundException | IOException e) {
                e.printStackTrace();

            }
        }

        return returnClassList;
    }

    //查找当前包路径下的所有类，除了jar
    private static List<Class> getClasses(String packageName) throws ClassNotFoundException, IOException {
        List<Class> classes = new ArrayList<>();
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        String path = packageName.replace('.', '/');
        Enumeration<URL> resources = classLoader.getResources(path);
        List<File> dirs = new ArrayList<>();
        while (resources.hasMoreElements()) {
            URL url = resources.nextElement();
            dirs.add(new File(url.getFile()));
        }
        for (File file : dirs) {
            classes.addAll(findClasses(file, packageName));
        }

        return classes;

    }

    private static Collection<? extends Class> findClasses(File directory, String packageName) throws ClassNotFoundException {
        List<Class> classes = new ArrayList<>();
        if (!directory.exists()) return classes;
        File[] files = directory.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                assert !file.getName().contains(".");
                classes.addAll(findClasses(file, packageName + "." + file.getName()));

            } else if (file.getName().endsWith(".class")) {
                classes.add(Class.forName(packageName + '.' + file.getName().substring(0, file.getName().length() - 6)));

            }
        }


        return classes;
    }
}
