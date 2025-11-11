package p11;

import java.util.Scanner;

public class tugas2_17 {
    public static void main(String[] args) {
        Scanner jovita = new Scanner(System.in);
        double totalHarga17 = 0;

        System.out.print("Masukan jumlah pesanan: ");
        int jmlPesanan17 = jovita.nextInt();
        String[] namaPesanan17 = new String[jmlPesanan17];
        int[] hargaPesanan17 = new int[jmlPesanan17];

        for (int i = 0; i < jmlPesanan17; i++) {
            System.out.print("Masukan nama pesanan ke-" + (i+1) + " : ");
            namaPesanan17[i] = jovita.nextLine();

            jovita.nextLine();

            System.out.println("Masukan harga pesanan ke-" + (i+1) + " : ");
            hargaPesanan17[i] = jovita.nextInt();

            totalHarga17 += hargaPesanan17[i];
        }

        System.out.println("--- Daftar pesanan ---");
        for (int i = 0; i < jmlPesanan17; i++) {
            System.out.println("pesanan ke-" + (i+1) + namaPesanan17[i] + ": Rp. " + hargaPesanan17[i]);
        }
        System.out.println("Total harga: " + totalHarga17);
    }
}
