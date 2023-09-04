package javaPackage;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileContentReplaceExample {
    public static void main(String[] args) {
        String folderPath = "your/folder/path";
        String oldString = "old string";
        String newString = "new string";

        try {
            // 遍历文件夹中的所有文件
            Stream<Path> files = Files.walk(Paths.get(folderPath));
            files.forEach(filePath -> {
                if (Files.isRegularFile(filePath)) { // 判断是否为普通文件
                    replaceStringInFile(filePath.toFile(), oldString, newString);
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void replaceStringInFile(File file, String oldString, String newString) {
        try {
            // 读取文件内容
            BufferedReader reader = new BufferedReader(new FileReader(file));
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
            reader.close();

            // 替换字符串
            String modifiedContent = content.toString().replaceAll(oldString, newString);

            // 写入替换后的内容到文件
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(modifiedContent);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}