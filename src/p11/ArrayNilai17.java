package p11;

import java.util.Scanner;

public class ArrayNilai17 {
    public static void main(String[] args) {
        Scanner jovita = new Scanner(System.in);

        int nilaiAkhir17[] = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Masukan nilai akhir ke-" + i + " : ");
            nilaiAkhir17[i] = jovita.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Nilai akhir ke-" + (i + 1) + " adalah " + nilaiAkhir17[i]);
        }
    }
}
