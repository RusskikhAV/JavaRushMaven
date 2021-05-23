package JavaCore.Level3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
Сортировка четных чисел из файла
*/
public class Level3lc11task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        String file = "E:\\cod.txt";

        ArrayList<Integer> arrayList = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String a;
            int count = 0;
            while ((a = bufferedReader.readLine()) != null) {
                Integer b = Integer.valueOf(a);
                if (b % 2 == 0) {
                    arrayList.add(count, b);
                    count++;
                }
            }
            Collections.sort(arrayList);

            System.out.println(arrayList);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
