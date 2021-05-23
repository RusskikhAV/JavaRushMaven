package JavaCore.Level3;

import java.io.*;
import java.util.Scanner;

public class Level3lc11task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();


        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName))) {
                String line;
                while (!(line = bufferedReader.readLine()).equals("exit")) {
                    bufferedWriter.write(line + "\n");

                }
                bufferedWriter.write("exit");


            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
