package JavaCore.Level4.Work;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.List;

/*
Нашествие исключений
*/


public class Level4lc8task10 {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (NullPointerException e) {
            exceptions.add(e);
        } catch (RuntimeException e) {
            exceptions.add(e);
        } catch (Exception e) {
            exceptions.add(e);
        }
    }
}

