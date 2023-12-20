package chap14;

import java.io.*;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class Data implements Chap14Config{
    private String name;
    private int english;
    private int math;
    private static boolean isFirstWrite = true;

    Data(String n, int e, int m) {
        this.name = n;
        this.english = e;
        this.math = m;
    }

    // (b) 將物件 stu1、stu2 之資料成員依序寫入 student.txt
    public void writeData() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filepath + "student.txt", !isFirstWrite))) {
            writer.write(name + " " + english + " " + math + "\n");
            isFirstWrite = false; // 設定為 false，表示之後都是追加模式
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // (c) 列印 Data 類別的所有成員之值，以及英文及數學成績的平均分數
    public void show() {
        System.out.println("Name: " + name);
        System.out.println("English Score: " + english);
        System.out.println("Math Score: " + math);

        // 計算英文和數學成績的平均分數
        double average = (english + math) / 2.0;
        System.out.println("Average Score: " + average);
    }
}

public class Ex10 implements Chap14Config{
    private static final String FILE_PATH = filepath + "student.txt";


    // (d) 讀取 student.txt 的資料
    public static void readData() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // 分割每行的資料
                String[] data = line.split(" ");
                // 建立 Data 物件
                Data student = new Data(data[0], Integer.parseInt(data[1]), Integer.parseInt(data[2]));
                // 利用 show() 函數印出資料
                student.show();
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Data stu1 = new Data("Ariel", 92, 85);
        Data stu2 = new Data("Fiona", 67, 89);

        // (b) 將物件 stu1、stu2 之資料成員依序寫入 student.txt
        stu1.writeData();
        stu2.writeData();

        // (d) 讀取 student.txt 的資料後，利用 show() 函數印出各項資料
        readData();
    }
}

