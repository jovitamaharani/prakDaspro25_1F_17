package p12;

import java.util.Scanner;

public class SIAKAD17 {
    public static void main(String[] args) {
        Scanner jovita = new Scanner(System.in);
        
        int[][] nilai17 = new int[4][3];

        for (int i17 = 0; i17 < nilai17.length; i17++) {
            System.out.println("Input nilai mahasiswa ke-" + (i17 + 1));
            double totalPerSiswa17 = 0;

            for (int j17 = 0; j17 < nilai17[i17].length; j17++) {
                System.out.print("Nilai mata kuliah " + (j17 + 1) + ": ");
                nilai17[i17][j17] = jovita.nextInt();
                totalPerSiswa17 += nilai17[i17][j17];
            }

            System.out.println("Nilai rata-rata: " + (totalPerSiswa17 / nilai17[i17].length));
            System.out.println();
        }
        System.out.println("=====================");
        System.out.println("Rata-rata Nilai setiap Mata Kuliah:");

        for (int j17 = 0; j17 < nilai17[0].length; j17++) {
            double totalPerMatkul17 = 0;

            for (int i17 = 0; i17 < nilai17.length; i17++) {
                totalPerMatkul17 += nilai17[i17][j17];
            }

            double rataRataMatkul17 = totalPerMatkul17 / nilai17.length;
            System.out.println("Mata Kuliah " + (j17 + 1) + ": " + rataRataMatkul17);
        }
    }
}
