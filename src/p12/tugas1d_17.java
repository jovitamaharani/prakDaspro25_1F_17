package p12;

import java.util.Scanner;

public class tugas1d_17 {
    public static void main(String[] args) {
        Scanner jovita = new Scanner(System.in);
        int[][] survei17 = new int[10][6];
        int jawaban17;
        double totalKeseluruhan17, rata17, jmlElemen17;

        for (int i = 0; i < survei17.length; i++) {
            System.out.println("Responden ke-" + (i + 1));
            for (int j = 0; j < survei17[i].length; j++) {
                System.out.print("Pertanyaan ke-" + (j + 1) + " input jawaban: ");
                jawaban17 = jovita.nextInt();
                survei17[i][j] = jawaban17;

                if (jawaban17 > 5 || jawaban17 < 1) {
                    System.out.println("angka tidak valid input (1-5)");
                    continue;
                }
            }
        }

        System.out.println("\n=== Rata-rata Keseluruhan ===");
        totalKeseluruhan17 = 0;
        jmlElemen17 = survei17.length * survei17[0].length;

        for (int i = 0; i < survei17.length; i++) {
            for (int j = 0; j < survei17[i].length; j++) {
                totalKeseluruhan17 += survei17[i][j];
            }
        }

        rata17 = totalKeseluruhan17 / jmlElemen17;
        System.out.println("rata keseluruhan: " + rata17);
    }
}
