package p6;

import java.util.Scanner;

public class nestedUjianSkripsi17 {
    public static void main(String[] args) {
        Scanner jovita = new Scanner(System.in);
        String pesan17;

        System.out.print("Apakah Mahasiswa sudah bebas kompen? (Ya/Tidak): ");
        String bebasKompen17 = jovita.nextLine();
        System.out.print("Masukan jumlah log bimbingan Pembimbing 1: ");
        int bimbinganP1_17 = jovita.nextInt();
        System.out.print("Masukan jumlah log bimbingan Pembimbing 2: ");
        int bimbinganP2_17 = jovita.nextInt();

        if (bebasKompen17.equalsIgnoreCase("Ya")) {
            if (bimbinganP1_17 >= 8 && bimbinganP2_17 >= 4) {
                pesan17 = "Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi";
            } else if (bimbinganP1_17 < 8 && bimbinganP2_17 < 4) {
                pesan17 = "Gagal! Log bimbingan P1 kurang dari 8 kali dan P4 kurang dari 4 kali";
            } else if (bimbinganP1_17 < 8) {
                pesan17 = "Gagal! Log bimbingan P1 belum mencapai 8 kali";
            } else {
                pesan17 = "Gagal! Log bimbingan P2 belum mencapai 4 kali";
            }
        } else {
            pesan17 = "Gagal! Mahasiswa masih memiliki tanggungan kompen";
        }

        System.out.println(pesan17);
    }
}