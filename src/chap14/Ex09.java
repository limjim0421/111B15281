package chap14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex09 implements Chap14Config{
    public static void main(String[] args) {
        // (a) 讀取 aaa.txt 與 bbb.txt 的內容
        String contentA = readFile(filepath + "aaa.txt");
        String contentB = readFile(filepath + "bbb.txt");

        // (b) 合併 aaa.txt 與 bbb.txt 的內容並儲存成 ccc.txt
        String mergedContent = mergeContents(contentA, contentB);
        writeFile(filepath + "ccc.txt", mergedContent);

        // (c) 列印 aaa.txt、bbb.txt 及 ccc.txt 的內容
        System.out.println("aaa.txt 內容:");
        System.out.println(contentA);

        System.out.println("bbb.txt 內容:");
        System.out.println(contentB);

        System.out.println("ccc.txt 內容:");
        System.out.print(mergedContent);
    }

    private static String readFile(String fileName) {
        StringBuilder contentBuilder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                contentBuilder.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contentBuilder.toString();
    }

    private static void writeFile(String fileName, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String mergeContents(String contentA, String contentB) {
        // 移除 contentB 最後的換行符號
        if (!contentB.isEmpty() && contentB.charAt(contentB.length() - 1) == '\n') {
            contentB = contentB.substring(0, contentB.length() - 1);
        }

        // 合併兩者
        return contentA + contentB;
    }
}
