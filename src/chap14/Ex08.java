package chap14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex08 implements Chap14Config{
    public static void main(String[] args) {
        // 讀取 proverb.txt 檔案
        readAndPrintFile(filepath + "proverb.txt", "You can't be perfect but you can be unique.");
    }

    private static void readAndPrintFile(String fileName, String skipString) {
        try (FileReader fileReader = new FileReader(fileName, StandardCharsets.UTF_8);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            // 略過特定字串
            skipString(bufferedReader, skipString);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.print(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void skipString(BufferedReader reader, String skipString) throws IOException {
        Pattern pattern = Pattern.compile(Pattern.quote(skipString));

        String line;
        while ((line = reader.readLine()) != null) {
            Matcher matcher = pattern.matcher(line);
            if (matcher.find()) {
                // 找到要略過的字串，插入換行
                System.out.println();
                continue;
            }

            System.out.print(line);
        }
    }


}
