package JavaCore.Level3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
/*
Сортировка четных чисел из файла*/


public class Level3lc11task12 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();

        List<Integer> arrayList = new ArrayList<>();
        FileInputStream fis = new FileInputStream(fileName);
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));
        String s;
        while ((s = br.readLine()) != null) {
            Integer b = Integer.valueOf(s);
            if (b % 2 == 0) {
                arrayList.add(b);
            }
        }
        Collections.sort(arrayList);
        for (Integer a : arrayList) {
            System.out.println(a);
        }
        fis.close();
    }
}

