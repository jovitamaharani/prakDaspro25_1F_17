package p6;

import java.util.Scanner;

public class ifCetakKRS17 {
    public static void main(String[] args) {
        Scanner jovita = new Scanner(System.in);

        System.out.println("--- Cetak KRS ---");
        System.out.print("Apakah UKT sudah lunas? (true / false) ");
        boolean uktLunas17 = jovita.nextBoolean();

        String cekKondisi17 = (uktLunas17) ? "Pembayaran UKT Terverifikasi \nSilakan cetak KRS dan minta tanda tangan DPA"
        : "Registrasi Ditolak. Silakan lunasi UKT terlebih dahulu";
        System.out.println(cekKondisi17);
    } 
}