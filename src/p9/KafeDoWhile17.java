package p9;

import java.util.Scanner;

public class KafeDoWhile17 {
    public static void main(String[] args) {
        Scanner jovita = new Scanner(System.in);
        
        int kopi17, teh17, roti17;
        double hargaKopi17 = 12000, hargaTeh17 = 7000, hargaRoti17 = 20000, totalHarga17;

        do {
            System.out.print("Masukan nama pelanggan (ketik 'batal' untuk keluar): ");
            String namaPelanggan17 = jovita.nextLine();
    
            if (namaPelanggan17.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }

            System.out.print("Jumlah kopi: ");
            kopi17 = jovita.nextInt();
            System.out.print("Jumlah teh: ");
            teh17 = jovita.nextInt();
            System.out.print("Jumlah roti: ");
            roti17 = jovita.nextInt();
            jovita.nextLine(); 
            
            totalHarga17 = (kopi17 * hargaKopi17) + (teh17 * hargaTeh17) + (roti17 * hargaRoti17);
            System.out.println("Total yang harus dibayar: Rp. " + totalHarga17);
            jovita.nextLine();
        } while (true);

        System.out.println("Semua transaksi selesai.");
    }
}
