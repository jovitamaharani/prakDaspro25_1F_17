package p11;

import java.util.Scanner;

public class ArrayNilai17 {
    public static void main(String[] args) {
        Scanner jovita = new Scanner(System.in);

        int nilaiAkhir17[] = new int[10];
        for (int i = 0; i < nilaiAkhir17.length; i++) {
            System.out.print("Masukan nilai akhir ke-" + (i + 1) + " : ");
            nilaiAkhir17[i] = jovita.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (nilaiAkhir17[i] > 70) {
                System.out.println("Mahasiswa ke-" + i + " lulus");
            } else {
                System.out.println("Mahasiswa ke-" + i + " tidak lulus");
            }
        }
    }
}
