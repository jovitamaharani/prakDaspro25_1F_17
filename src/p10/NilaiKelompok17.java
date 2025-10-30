package p10;

import java.util.Scanner;

public class NilaiKelompok17 {
    public static void main(String[] args) {
        Scanner jovita = new Scanner(System.in);

        int i17, j17, nilai17;
        float totalNilai17, rataNilai17, rataTertinggi17 = 0, rata17;

        i17 = 1;

        while (i17 <= 6) {
            System.out.println("Kelompok " + i17);

            totalNilai17 = 0;
            for (j17 = 1; j17 <= 5; j17++) {
                System.out.print("Nilai dari Kelompok Penilai " + j17 + ": ");
                nilai17 = jovita.nextInt();
                totalNilai17 += nilai17;
            }
            rataNilai17 = totalNilai17 / 5;
            System.out.println("Kelompok" + i17 + " nilai rata-rata = " + rataNilai17);
            i17++;
        }

    }
}
