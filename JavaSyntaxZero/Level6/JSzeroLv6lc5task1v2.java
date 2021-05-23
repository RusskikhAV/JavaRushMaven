package JavaSyntaxZero.Level6;

/*
Таблица умножения
*/
public class JSzeroLv6lc5task1v2 {
    public static int[][] MULTIPLICATION_TABLE;

    public static void main(String[] args) {
        MULTIPLICATION_TABLE = new int[10][10];
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                MULTIPLICATION_TABLE[i - 1][j - 1] = j * i;
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++)
                System.out.print(MULTIPLICATION_TABLE[i][j] + " ");
            System.out.println();
        }
    }
}


