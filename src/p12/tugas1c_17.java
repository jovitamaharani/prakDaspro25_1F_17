package p12;

import java.util.Scanner;

public class tugas1c_17 {
    public static void main(String[] args) {
        Scanner jovita = new Scanner(System.in);

        int[][] survei17 = new int[10][6];
        int jawaban17 = 0;
        double total17 = 0, rata17;

        for (int i = 0; i < survei17.length; i++) {
            System.out.println("Responden ke-" + (i + 1));
            for (int j = 0; j < survei17[i].length; j++) {
                System.out.print("Pertanyaan ke-" + (j + 1) + " input jawaban: ");
                jawaban17 = jovita.nextInt();

                if (jawaban17 > 5 || jawaban17 < 1) {
                    System.out.println("angka tidak valid input (1-5)");
                    continue;
                }
                survei17[i][j] = jawaban17;
            }
        }

        System.out.println("\n=== Rata-rata Setiap Pertanyaan ===");
        for (int j = 0; j < survei17[0].length; j++) {
            total17 = 0;

            for (int i = 0; i < survei17.length; i++) {
                total17 += survei17[i][j];
            }

            rata17 = total17 / survei17.length;
            System.out.println("Pertanyaan ke-" + (j + 1) + ": " + rata17);
        }
    }
}
