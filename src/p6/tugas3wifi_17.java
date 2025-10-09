package p6;

import java.util.Scanner;

public class tugas3wifi_17 {
    public static void main(String[] args) {
        Scanner jovita = new Scanner(System.in);

        System.out.print("Masukan pengguna: ");
        String pengguna17 = jovita.nextLine();

        if (pengguna17.equalsIgnoreCase("dosen")) {
            System.out.println("akses wifi diberikan (dosen)");
        } else if (pengguna17.equalsIgnoreCase("mahasiswa")){
            System.out.print("Masukan jumlah SKS: ");
            int sks17 = jovita.nextInt();
            if (sks17 >= 12) {
                System.out.println("akses wifi diberikan (mahasiswa aktif)");
            } else {
                System.out.println("akses ditolak SKS kurang dari 12");
            }
        } else {
            System.out.println("akses ditolak");
        }
    }
}
