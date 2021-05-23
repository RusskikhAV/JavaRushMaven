package JavaCore.Level4;


import java.io.*;
import java.util.*;

/*
Нашествие исключений
*/

public class Level4lc8task11 {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {
        //the first exception
        try {
            Object i = Integer.valueOf(1);
            String s = (String) i;

        } catch (ClassCastException e) {
            exceptions.add(e);
        }
        //2
        try {
            int i = 1 / 0;
        } catch (ArithmeticException e) {
            exceptions.add(e);
        }
        //3
        try {
            List<String> list = new ArrayList<>(10);
            list.add(11, "String");
        } catch (IndexOutOfBoundsException e) {
            exceptions.add(e);
        }
        //4
        try {
            String a = null;
            int b = Integer.valueOf(a);
            float i = 1 / b;

        } catch (NumberFormatException e) {
            exceptions.add(e);
        }
        //5
        try {
            String file = "C:\\doc.txt";
            BufferedReader reader = new BufferedReader(new FileReader("file"));

        } catch (FileNotFoundException e) {
            exceptions.add(e);
        }
        //6
        try {
            Set hshSet = new HashSet();
            Hashtable hashtable = new Hashtable();

            hshSet.iterator().next();
            hashtable.elements().nextElement();
        } catch (Exception e) {
            exceptions.add(e);
        }
        //7
        try {
            throw new ArrayStoreException();
        } catch (ArrayStoreException e) {
            exceptions.add(e);
        }
        //8
        try {
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException e) {
            exceptions.add(e);
        }
        //9
        try {
            throw new RuntimeException();
        } catch (RuntimeException e) {
            exceptions.add(e);
        }
        //10
        try {
            throw new IOException();
        } catch (IOException e) {
            exceptions.add(e);
        }


    }
}
