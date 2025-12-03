import java.util.Scanner;

public class Kafe17 {
    static void Menu(String namaPelanggan17, boolean isMember17, String kodePromo) {
        System.out.println("Selamat datang, " + namaPelanggan17 + "!");
        if (isMember17) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        // if (kodePromo.equalsIgnoreCase("diskon30")) {
        //     System.out.println("Selamat! Anda mendapatkan diskon 30%");
        // } else if (kodePromo.equalsIgnoreCase("diskon50")) {
        //     System.out.println("Selamat! Anda mendapatkan diskon 50%");
        // } else {
        //     System.out.println("Kode promo tidak valid.");
        // }
        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam   Rp 15,000");
        System.out.println("2. Cappuccino   Rp 20,000");
        System.out.println("3. Latte        Rp 22,000");
        System.out.println("4. Teh Tarik    Rp 12,000");
        System.out.println("5. Roti Bakar   Rp 10,000");
        System.out.println("6. Mie Goreng   Rp 18,000");
        System.out.println("Silakan pilih menu yang Anda inginkan.");
    }

    public static int hitungTotalHarga(int pilihanMenu17, int banyakItem17, String kodePromo) {
        int[] hargaItems17 = { 15000, 20000, 22000, 12000, 10000, 18000 };
        int hargaTotal17 = hargaItems17[pilihanMenu17 - 1] * banyakItem17;
        if (kodePromo.equalsIgnoreCase("diskon30")) {
            System.out.println("Selamat! Anda mendapatkan diskon 30%");
        } else if (kodePromo.equalsIgnoreCase("diskon50")) {
            System.out.println("Selamat! Anda mendapatkan diskon 50%");
        } else {
            System.out.println("Kode promo tidak valid.");
        }
        return hargaTotal17;
    }

    public static void main(String[] args) {
        Scanner jovita = new Scanner(System.in);
        Menu("Budi", true, "DISKON30");

        int totalKeseluruhan17 = 0;

        while (true) {
            System.out.print("\nMasukkan nomor menu yang ingin Anda pesan (0 untuk selesai): ");
            int pilihanMenu17 = jovita.nextInt();
            if (pilihanMenu17 == 0) {
                break;
            }
            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItem17 = jovita.nextInt();
            jovita.nextLine();
            System.out.print("Masukkan kode promo: ");
            String kodePromo17 = jovita.nextLine();

            int totalHarga17 = hitungTotalHarga(pilihanMenu17, banyakItem17, kodePromo17);
            totalKeseluruhan17 += totalHarga17;
            System.out.println("Total keseluruhan pesanan Anda: Rp" + totalKeseluruhan17);
        }
    }
}