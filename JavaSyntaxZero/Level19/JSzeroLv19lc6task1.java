package JavaSyntaxZero.Level19;


import java.util.stream.Stream;

/*
Анализ потока чисел
*/
public class JSzeroLv19lc6task1 {

    public static void main(String[] args) {
        String answerYes = "Yes";
        String answerNo = "No";

        Stream<Integer> stream1 = Stream.of(10, -22, 3, 12, -85, 0, 142);

        String answerNegativeEvenNumbers = hasNegativeEvenNumbers(stream1) ? answerYes : answerNo;
        System.out.println("Has stream negative even numbers? " + answerNegativeEvenNumbers);

        Stream<Integer> stream2 = Stream.of(10, 22, 3, 12, 85, 142);

        String answerOnlyPositiveNumbers = hasOnlyPositiveNumbers(stream2) ? answerYes : answerNo;
        System.out.println("Has stream only positive numbers? " + answerOnlyPositiveNumbers);

        Stream<Integer> stream3 = Stream.of(-10, -22, -3, -12, -85, -142);

        String answerOnlyNegativeNumbers = hasOnlyNegativeNumbers(stream3) ? answerYes : answerNo;
        System.out.println("Has stream only negative numbers? " + answerOnlyNegativeNumbers);
    }

    public static boolean hasNegativeEvenNumbers(Stream<Integer> stream) {
        //return stream.anyMatch(x -> x < 0 && x % 2 == 0);
        if (stream.filter(x -> (x % 2 == 0)).anyMatch(x -> x < 0)) {
            return true;
        } else
            return false;
    }

    public static boolean hasOnlyPositiveNumbers(Stream<Integer> stream) {
        if (stream.allMatch(x -> x > 0))
            return true;
        else
            return false;
    }

    public static boolean hasOnlyNegativeNumbers(Stream<Integer> stream) {
        if (stream.noneMatch(x -> x > 0))
            return true;
        else
            return false;
    }
}
