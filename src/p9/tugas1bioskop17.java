package p9;

import java.util.Scanner;

public class tugas1bioskop17 {
    public static void main(String[] args) {
        Scanner jovita = new Scanner(System.in);
        double diskon1_17 = 0.1, diskon2_17 = 0.15, totalHarga17 = 0;

        double hargaTiket17 = 50000;

        while (true) {
            System.out.print("Masukan jumlah tiket dibeli (ketik '0' jika sudah selesai): ");
            int jumlahTiket17 = jovita.nextInt();
            if (jumlahTiket17 == 0) { 
                System.out.println("Transaksi selesai.");
                break;
            }
            totalHarga17 = jumlahTiket17 * hargaTiket17;
    
            if (jumlahTiket17 > 4) {
                totalHarga17 = totalHarga17 - (totalHarga17 * diskon1_17);
            } else if (jumlahTiket17 > 10) {
                totalHarga17 = totalHarga17 - (totalHarga17 * diskon2_17);
            } else if (jumlahTiket17 >= 0 && jumlahTiket17 <= 4) {
                totalHarga17 = jumlahTiket17 * hargaTiket17;
            } else {
                System.out.println("Jumlah tiket tidak valid.");
                continue;
            }
            
            System.out.println("Total harga yang harus dibayar: Rp. " + totalHarga17);
        }

    }
}
