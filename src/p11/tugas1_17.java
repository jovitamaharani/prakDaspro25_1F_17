package p11;

import java.util.Scanner;

public class tugas1_17 {
    public static void main(String[] args) {
        Scanner jovita = new Scanner(System.in);
        double total17 = 0, rata17, terendah17 = 100, tertinggi17 = 0, nilai17 = 0;

        System.out.print("Masukan banyak nilai mahasiswa yang diinput: ");
        int jmlMhs17 = jovita.nextInt();

        int[] nilaiMhs17 = new int[jmlMhs17];
        for (int i = 0; i < nilaiMhs17.length; i++) {
            System.out.print("Masukan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs17[i] = jovita.nextInt();
            total17 += nilaiMhs17[i];
        }

        System.out.println("--- Nilai seluruh Mahasiswa ---");
        for (int i = 0; i < nilaiMhs17.length; i++) {
            System.out.println("nilai mahasiswa ke-" + (i + 1) + " : " + nilaiMhs17[i]);

            if (nilaiMhs17[i] < terendah17) {
                terendah17 = nilaiMhs17[i];
            } else if (nilaiMhs17[i] > tertinggi17) {
                tertinggi17 = nilaiMhs17[i];
            }
        }
        rata17 = total17 / jmlMhs17;
        System.out.println("rata rata: " + rata17);
        System.out.println("nilai tertinggi: " + tertinggi17);
        System.out.println("nilai terendah: " + terendah17);
    }
}
