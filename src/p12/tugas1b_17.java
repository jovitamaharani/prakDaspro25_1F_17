package p12;

import java.util.Scanner;

public class tugas1b_17 {
    public static void main(String[] args) {
        Scanner jovita = new Scanner(System.in);

        int[][] survei17 = new int[10][6];
        int jawaban17;
        double total17 = 0, rata17;

        for (int i = 0; i < survei17.length; i++) {
            System.out.println("Responden ke-" + (i+1));
            total17 = 0;
            for (int j = 0; j < survei17[i].length; j++) {
                System.out.print("Pertanyaan ke-" + (j+1) + " input jawaban: ");
                jawaban17 = jovita.nextInt();

                if (jawaban17 > 5 || jawaban17 < 1) {
                    System.out.println("angka tidak valid input (1-5)");
                    continue;
                }

                total17 += jawaban17;
            }

            rata17 = total17 / survei17[i].length;
            System.out.println("Rata responden ke-" + (i+1) + ": " + rata17);
        }
    }
}
