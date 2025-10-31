package p10;

import java.util.Scanner;

public class tugas3_17 {
    public static void main(String[] args) {
        Scanner jovita = new Scanner(System.in);

        int pelanggan17 = 0;
        System.out.print("Masukan jumlah cabang caffe: ");
        int cabang17 = jovita.nextInt();
        int item17 = 0, totalPelanggan17 = 0, totalSeluruhItem17 = 0;

        System.out.println("=== Input penjualan per cabang ===");

        for (int i = 0; i < cabang17; i++) {
            System.out.println("--- Cabang " + (i + 1) + " ---");
            System.out.print("Masukan jumlah pelanggan: ");
            pelanggan17 = jovita.nextInt();

            int totalItem17 = 0;
            for (int j = 0; j < pelanggan17; j++) {
                System.out.print("- Pelanggan" + (j + 1) + "memesan beraoa item? ");
                item17 = jovita.nextInt();
                totalItem17 += item17;
            }
            totalSeluruhItem17 += totalItem17;

            System.out.println("Cabang " + (i + 1) + ": \n- Pelanggan: " + pelanggan17 + " orang \n- Item terjual: " + totalItem17);
            totalPelanggan17 += pelanggan17;
        }
        System.out.println("\nTotal seluruh cabang: ");
        System.out.println("Pelanggan: " + totalPelanggan17 + " orang");
        System.out.println("Item terjual: " + totalSeluruhItem17 + " item");
    }
}
