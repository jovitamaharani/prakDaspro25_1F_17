package p9;

import java.util.Scanner;

public class SiakadWhile17 {
    public static void main(String[] args) {
        Scanner jovita = new Scanner(System.in);
        double nilai17;

        System.out.print("Masukan jumlah mahasiswa: ");
        int jml17 = jovita.nextInt();

        int i = 0;
        while (i < jml17) {
            System.out.print("Masukan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai17 = jovita.nextDouble();

            if (nilai17 < 0 || nilai17 > 100) {
                System.out.println("Nilai tidak valid. Masukan nilai yang valid!");
                continue;
            }

            if (nilai17 > 80 && nilai17 <=100) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah A");
                System.out.println("Bagus, Pertahankan nilainya!");
            } else if (nilai17 > 73 && nilai17 <= 80) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah B+");
            } else if (nilai17 > 65 && nilai17 <= 73) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah B");
            } else if (nilai17 > 60 && nilai17 <= 65) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah C+");
            } else if (nilai17 > 50 && nilai17 <= 60) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah C");
            } else if (nilai17 > 39 && nilai17 <= 50) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah D");
            } else {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah E");
            }
            i++;
        }
    }
}
