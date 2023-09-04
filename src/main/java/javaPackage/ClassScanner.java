package javaPackage;

import java.io.File;
import java.lang.reflect.Constructor;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * 在Java中，批量注入某个路径下的实例可以使用反射机制来实现。
 */
public class ClassScanner {
    public static void main(String[] args) {
        String packagePath = "com.example.package"; // 指定需要扫描的包路径

        List<Object> instances = getInstances(packagePath);

        // 对获取的实例进行进一步操作
        for (Object instance : instances) {
            // TODO: 进行注入的操作
        }
    }

    public static List<Object> getInstances(String packagePath) {
        List<Object> instances = new ArrayList<>();

        try {
            // 将包路径转换为文件路径
            String path = packagePath.replace('.', '/');
            URL url = Thread.currentThread().getContextClassLoader().getResource(path);

            if (url != null) {
                File root = new File(url.getFile());

                // 递归扫描包下的所有文件
                scanClasses(root, packagePath, instances);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return instances;
    }

    public static void scanClasses(File root, String packagePath, List<Object> instances) {
        File[] files = root.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    // 递归扫描子目录
                    scanClasses(file, packagePath + "." + file.getName(), instances);
                } else if (file.getName().endsWith(".class")) {
                    try {
                        // 获取类的全限定名
                        String className = packagePath + "." + file.getName().replace(".class", "");

                        // 加载类并实例化
                        Class<?> clazz = Class.forName(className);
                        Constructor<?> constructor = clazz.getConstructor();
                        Object instance = constructor.newInstance();

                        instances.add(instance);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}