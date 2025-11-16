package p12;

import java.util.Scanner;

public class BioskopWithScanner17 {
    public static void main(String[] args) {
        Scanner jovita = new Scanner(System.in);

        String[][] penonton17 = new String[4][2];
        String nama17;
        String next17;
        int baris17;
        int kolom17;

        while (true) {
            System.out.print("Masukkan nama: ");
            nama17 = jovita.nextLine();
            System.out.print("Masukkan baris: ");
            baris17 = jovita.nextInt();
            System.out.print("Masukkan kolom: ");
            kolom17 = jovita.nextInt();
            jovita.nextLine();

            penonton17[baris17 - 1][kolom17 - 1] = nama17;

            System.out.print("Input penonton lainnya? (y/n): ");
            next17 = jovita.nextLine();

            if (next17.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}
