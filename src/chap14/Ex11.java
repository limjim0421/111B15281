package chap14;

import java.io.*;
import java.util.Random;

public class Ex11 implements Chap14Config{
    // (a) 生成100個亂數小寫英文字母，寫入 "rand99.txt"
    private static void writeData() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filepath + "rand99.txt"))) {
            Random random = new Random();
            for (int i = 0; i < 100; i++) {
                char randomChar = (char) (random.nextInt(26) + 'a');  // 產生小寫英文字母
                writer.write(randomChar);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // (b) 讀取 "rand99.txt" 的內容，計算字母 a、e、i、o、u 的出現次數
    private static void cnt() {
        try (BufferedReader reader = new BufferedReader(new FileReader(filepath + "rand99.txt"))) {
            String line = reader.readLine();
            int countA = 0, countE = 0, countI = 0, countO = 0, countU = 0;

            if (line != null) {
                for (char c : line.toCharArray()) {
                    switch (c) {
                        case 'a':
                            countA++;
                            break;
                        case 'e':
                            countE++;
                            break;
                        case 'i':
                            countI++;
                            break;
                        case 'o':
                            countO++;
                            break;
                        case 'u':
                            countU++;
                            break;
                    }
                }
            }

            System.out.println("'a'出現了: " + countA);
            System.out.println("'e'出現了: " + countE);
            System.out.println("'i'出現了: " + countI);
            System.out.println("'o'出現了: " + countO);
            System.out.println("'u'出現了: " + countU);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        // (a) 生成100個亂數小寫英文字母，寫入 "rand99.txt"
        writeData();

        // (b) 讀取 "rand99.txt" 的內容，計算字母 a、e、i、o、u 的出現次數
        cnt();
    }
}
