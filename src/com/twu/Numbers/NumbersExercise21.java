package com.twu.Numbers;

public class NumbersExercise21 {

    public static void main(String[] args) {
        printRamanujanNum();
    }

    public static void printRamanujanNum() {
        int num = 100000;

        for (int a = 1; a < num; a++) {
            int a3 = (int) Math.pow(a, 3);

            if (a3 > num) break;

            for (int b = a; b < num; b++) {
                int b3 = (int) Math.pow(b, 3);

                if (a3 + b3 > num) break;

                for (int c = a + 1; c < num; c++) {
                    int c3 = (int) Math.pow(c, 3);

                    if (a3 + b3 < c3) break;

                    for (int d = c; d < num; d++) {
                        int d3 = (int) Math.pow(d, 3);

                        if (a3 + b3 < c3 + d3)
                            break;

                        if (a3 + b3 == c3 + d3) {
                            System.out.print((a3 + b3) + " = ");
                            System.out.print(a + "^3 + " + b + "^3 = ");
                            System.out.print(c + "^3 + " + d + "^3");
                            System.out.println();
                        }

                    }
                }
            }


        }
    }
}
