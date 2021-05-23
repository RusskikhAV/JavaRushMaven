package JavaSyntaxZero.Level6;

/*
Таблица умножения
*/
public class JSzeroLv6lc5task1 {
    public static int[][] MULTIPLICATION_TABLE;

    public static void main(String[] args) {
        MULTIPLICATION_TABLE = new int[10][10];
        for (int i = 0; i < 10; i++) {
            int k = 1;
            for (int j = 0; j < 10; j++) {
                MULTIPLICATION_TABLE[0][j] = k;
                k++;
            }
            if (k >= 10) {
                int m = 1;
                for (int j = 0; j < 10; j++) {
                    MULTIPLICATION_TABLE[1][j] = m * 2;
                    m++;
                    k++;
                }
            }
            if (k >= 20) {
                int m = 1;
                for (int j = 0; j < 10; j++) {
                    MULTIPLICATION_TABLE[2][j] = m * 3;
                    m++;
                    k++;
                }
            }
            if (k >= 30) {
                int m = 1;
                for (int j = 0; j < 10; j++) {
                    MULTIPLICATION_TABLE[3][j] = m * 4;
                    m++;
                    k++;
                }
            }
            if (k >= 40) {
                int m = 1;
                for (int j = 0; j < 10; j++) {
                    MULTIPLICATION_TABLE[4][j] = m * 5;
                    m++;
                    k++;
                }
            }
            if (k >= 50) {
                int m = 1;
                for (int j = 0; j < 10; j++) {
                    MULTIPLICATION_TABLE[5][j] = m * 6;
                    m++;
                    k++;
                }
            }
            if (k >= 60) {
                int m = 1;
                for (int j = 0; j < 10; j++) {
                    MULTIPLICATION_TABLE[6][j] = m * 7;
                    m++;
                    k++;
                }
            }
            if (k >= 70) {
                int m = 1;
                for (int j = 0; j < 10; j++) {
                    MULTIPLICATION_TABLE[7][j] = m * 8;
                    m++;
                    k++;
                }
            }
            if (k >= 80) {
                int m = 1;
                for (int j = 0; j < 10; j++) {
                    MULTIPLICATION_TABLE[8][j] = m * 9;
                    m++;
                    k++;
                }
            }
            if (k >= 90) {
                int m = 1;
                for (int j = 0; j < 10; j++) {
                    MULTIPLICATION_TABLE[9][j] = m * 10;
                    m++;
                    k++;
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++)
                System.out.print(MULTIPLICATION_TABLE[i][j] + " ");
            System.out.println();
        }
    }
}


