package p11;

import java.util.Scanner;

public class ArrayRataNilai17 {
    public static void main(String[] args) {
        Scanner jovita = new Scanner(System.in);
        double total17 = 0, totalTdkLulus17 = 0;
        double rata2lulus_17 = 0, rata2tdklulus_17 = 0;
        int jmlMhsLulus = 0;
        int jmlMhsTdkLulus = 0;

        System.out.print("Masukan jumlah mahasiswa: ");
        int jmlMhs17 = jovita.nextInt();
        int[] nilaiMhs17 = new int[jmlMhs17];

        for (int i = 0; i < nilaiMhs17.length; i++) {
            System.out.print("Masukan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs17[i] = jovita.nextInt();

            if (nilaiMhs17[i] > 70) {
                total17 += nilaiMhs17[i];
                jmlMhsLulus++;
            } else{
                totalTdkLulus17 += nilaiMhs17[i];
                jmlMhsTdkLulus++;
            }
        }

        rata2lulus_17 = total17 / jmlMhsLulus;
        rata2tdklulus_17 = totalTdkLulus17 / jmlMhsTdkLulus;
        System.out.println("Rata-rata nilai lulus= " + rata2lulus_17);
        System.out.println("Rata-rata nilai tidak lulus= " + rata2tdklulus_17);
    }
}
