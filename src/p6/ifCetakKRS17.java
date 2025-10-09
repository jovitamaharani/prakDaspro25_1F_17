package p6;

import java.util.Scanner;

public class ifCetakKRS17 {
    public static void main(String[] args) {
        Scanner jovita = new Scanner(System.in);

        System.out.println("--- Cetak KRS ---");
        System.out.print("Apakah UKT sudah lunas? (true / false) ");
        boolean uktLunas17 = jovita.nextBoolean();

        if (uktLunas17) {
            System.out.println("Pembayaran UKT Terverifikasi");
            System.out.println("Silakan cetak KRS dan minta tanda tangan DPA");
        } else {
            System.out.println("Registrasi Ditolak. Silakan lunasi UKT terlebih dahulu");
        }
    } 
}