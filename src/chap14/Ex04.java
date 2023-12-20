package chap14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ex04 implements Chap14Config{
    public static void main(String[] args) {
        try {
            Path filePath = Paths.get(filepath + "donkey.txt");

            // (a)使用 FileReader 讀取檔案
            FileReader fileReader = new FileReader(filePath.toFile());
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            StringBuilder contentBuilder = new StringBuilder();
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                contentBuilder.append(line).append("\n");
            }

            bufferedReader.close();

            String content = contentBuilder.toString();

            int charCount = content.length();

            int chineseCount = countChineseCharacters(content);

            // (a)列印原始內容和字元數
            System.out.println("原始檔案內容:\n" + content);
            System.out.println("讀取的字元數: " + charCount);
            System.out.println("\n中文字數: " + chineseCount);

            // (b)
            check(charCount, chineseCount);

            content = content.replaceAll("\\r\\n|\\r|\\n", "");

            charCount = content.length();

            chineseCount = countChineseCharacters(content);

            // 列印轉換後的內容和字元數
            System.out.println("\n轉換後檔案內容:\n" + content);
            System.out.println("\n讀取的字元數: " + charCount);
            System.out.println("\n中文字數: " + chineseCount);

            check(charCount, chineseCount);

            System.out.println("\n在程式語言中可以透過使用\\n來讓檔案換行，不過換行符號也算是一個字元");
            System.out.print("因此在將換行符號去掉後字元便可以對上了");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int countChineseCharacters(String text) {
        int count = 0;
        int length = text.length();
        for (int i = 0; i < length; i += Character.charCount(text.codePointAt(i))) {
            int codePoint = text.codePointAt(i);
            if (isChineseCharacter(codePoint)) {
                count++;
            }
        }
        return count;
    }

    private static boolean isChineseCharacter(int codePoint) {
        return Character.UnicodeScript.of(codePoint) == Character.UnicodeScript.HAN;
    }

    private static void check(int charCount, int chineseCount) {
        System.out.println("\n比較結果:");
        System.out.println("字元數量: " + charCount);
        System.out.println("中文字數量: " + chineseCount);

        if (charCount == chineseCount) {
            System.out.println("字元數量與中文字數量相同");
        } else {
            System.out.println("字元數量與中文字數量不同");
        }
    }
}
