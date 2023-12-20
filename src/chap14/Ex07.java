package chap14;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ex07 implements Chap14Config{
    public static void main(String[] args) {
        char hi[] = {'H', 'e', 'l', 'l', 'o', ' ', 'J', 'a', 'v', 'a', '!', '\r', '\n'};

        writeToFile(hi, filepath + "hello.txt");
        // 附加寫入檔案
        appendToFile("Welcome!", filepath + "hello.txt");
        // 讀取並印出整個檔案內容
        printFileContent(filepath + "hello.txt");
    }

    private static void writeToFile(char[] content, String fileName) {
        try (FileWriter fileWriter = new FileWriter(fileName)) {
            fileWriter.write(content);

            System.out.println("檔案已成功寫入: " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void appendToFile(String content, String fileName) {
        try (FileWriter fileWriter = new FileWriter(fileName, true)) {
            fileWriter.write(content);
            System.out.println("字串已成功附加到檔案: " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void printFileContent(String fileName) {
        try {
            Path filePath = Paths.get(fileName);
            String fileContent = Files.readString(filePath);
            System.out.print("檔案內容:\n" + fileContent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
