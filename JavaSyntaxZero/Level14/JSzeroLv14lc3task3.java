package JavaSyntaxZero.Level14;

import java.util.ArrayList;
import java.util.Collections;

/*public class JSzeroLv14lc2task3 {

    public static Integer min(ArrayList<Integer> list) {
        Integer minimum = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < minimum) {
                minimum = list.get(i);
            }
        }
        return minimum;
    }

    public static Integer max(ArrayList<Integer> list) {
        Integer maximum = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > maximum) {
                maximum = list.get(i);
            }
        }
        return maximum;
    }

    public static int frequency(ArrayList<Integer> list, Integer element) {
        int frequency = 0;
        if (element == null) {
            for (Integer integer : list)
                if (integer == null)
                    frequency++;
        } else {
            for (Integer integer : list) {
                if (integer.equals(element)) {
                    frequency++;
                }
            }
        }
        return frequency;
    }

    public static int binarySearch(ArrayList<Integer> list, Integer key) {
        int low = 0;
        int high = list.size() - 1;
        int mid = (low + high) / 2;
        int index = -1;
        while (low <= high) {
            if (list.get(mid) < key) {
                low = mid + 1;
            } else if (list.get(mid).equals(key)) {
                index = mid;
                break;
            } else {
                high = mid - 1;
            }
            mid = (low + high) / 2;
        }
        return index;
    }
}*/
public class JSzeroLv14lc3task3 {

    public static Integer min(ArrayList<Integer> list) {
        int minimum = Collections.min(list);
        return minimum;
    }

    public static Integer max(ArrayList<Integer> list) {
        int maximum = Collections.max(list);
        return maximum;
    }

    public static int frequency(ArrayList<Integer> list, Integer element) {
        int frequency = Collections.frequency(list, element);
        return frequency;
    }

    public static int binarySearch(ArrayList<Integer> list, Integer key) {

        int index = Collections.binarySearch(list, key);
        return index;
    }
}