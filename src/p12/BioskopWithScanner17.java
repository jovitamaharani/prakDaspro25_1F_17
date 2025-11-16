package p12;

import java.util.Scanner;

public class BioskopWithScanner17 {
    public static void main(String[] args) {
        Scanner jovita = new Scanner(System.in);

        String[][] penonton17 = new String[4][2];
        String nama17;
        String next17;
        int baris17;
        int kolom17, menu17;

        while (true) {
            System.out.println("\n--- MENU BIOSKOP ---");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1-3): ");
            menu17 = jovita.nextInt();
            jovita.nextLine();

            switch (menu17) {
                case 1:
                    while (true) {
                        System.out.print("Masukkan nama: ");
                        nama17 = jovita.nextLine();

                        while (true) {
                            System.out.print("Masukkan baris: ");
                            baris17 = jovita.nextInt();
                            System.out.print("Masukkan kolom: ");
                            kolom17 = jovita.nextInt();
                            jovita.nextLine();

                            if (baris17 < 1 || baris17 > 4 || kolom17 < 1 || kolom17 > 2) {
                                System.out.println("Nomor baris/kolom tidak valid");
                            } else if (penonton17[baris17 - 1][kolom17 - 1] != null) {
                                System.out.println("Kursi sudah terisi inputkan kursi lain");
                            } else {
                                penonton17[baris17 - 1][kolom17 - 1] = nama17;
                                System.out.println("Data penonton berhasil dimasukkan.");
                                break;
                            }
                        }
                        System.out.print("Input penonton lainnya? (y/n): ");
                        next17 = jovita.nextLine();
                        if (next17.equalsIgnoreCase("n")) {
                            break;
                        }
                    }
                    break;
                case 2:
                    for (int i17 = 0; i17 < penonton17.length; i17++) {
                        for (int j17 = 0; j17 < penonton17[i17].length; j17++) {
                            if (penonton17[i17][j17] == null) {
                                System.out.printf("Baris %d, Kolom %d: %s\n", (i17 + 1), (j17 + 1), "***");
                            } else {
                                System.out.printf("Baris %d, Kolom %d: %s\n", (i17 + 1), (j17 + 1),
                                        penonton17[i17][j17]);
                            }
                        }
                    }
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Menu tidak valid.");
                    break;
            }
        }
    }
}
