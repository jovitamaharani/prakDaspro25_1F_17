package p12;

import java.util.Scanner;

public class tugas1a_17 {
    public static void main(String[] args) {
        Scanner jovita = new Scanner(System.in);

        int[][] survei17 = new int[10][6];
        int jawaban17;

        for (int i = 0; i < survei17.length; i++) {
            System.out.println("Responden ke-" + (i+1));
            for (int j = 0; j < survei17[i].length; j++) {
                System.out.print("Pertanyaan ke-" + (j+1) + " input jawaban: ");
                jawaban17 = jovita.nextInt();

                if (jawaban17 > 5 || jawaban17 < 1) {
                    System.out.println("angka tidak valid input (1-5)");
                    continue;
                }
            }
        }
    }
}
