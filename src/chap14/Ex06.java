package chap14;

import java.io.FileWriter;
import java.io.IOException;

public class Ex06 implements Chap14Config{
    public static void main(String[] args) {
        char hi[] = {'H', 'e', 'l', 'l', 'o', ' ', 'J', 'a', 'v', 'a', '!', '\r', '\n'};

        writeToFile(hi, filepath + "hello.txt");
    }

    private static void writeToFile(char[] content, String fileName) {
        try (FileWriter fileWriter = new FileWriter(fileName)) {
            fileWriter.write(content);

            System.out.println("檔案已成功寫入: " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
