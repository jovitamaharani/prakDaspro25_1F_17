package p11;

import java.util.Scanner;

public class ArrayRataNilai17 {
    public static void main(String[] args) {
        Scanner jovita = new Scanner(System.in);
        int[] nilaiMhs17 = new int[10];
        double total17 = 0;
        double rata2_17;
        int jmlMhsLulus=0;

        for (int i = 0; i < nilaiMhs17.length; i++) {
            System.out.print("Masukan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs17[i] = jovita.nextInt();

            if (nilaiMhs17[i] > 70) {
                jmlMhsLulus++;
            }
        }

        for (int i = 0; i < nilaiMhs17.length; i++) {
            total17 += nilaiMhs17[i];
        }

        rata2_17 = total17 / nilaiMhs17.length;
        System.out.println("Rata-rata nilai = " + rata2_17);
        System.out.println("Jumlah mahasiswa lulus = " + jmlMhsLulus);
    }
}
