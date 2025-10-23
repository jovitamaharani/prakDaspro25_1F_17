package p9;

import java.util.Scanner;

public class tugas2parkir17 {
    public static void main(String[] args) {
        Scanner jovita = new Scanner(System.in);

        int jenis17 = 0, durasi17, total17 = 0;

        while (true) {
            System.out.print("Masukan jenis kendaraan (1 Mobil, 2 Motor, 0 Keluar): ");
            jenis17 = jovita.nextInt();

            if (jenis17 == 1 || jenis17 == 2) {
                System.out.print("Masukan durasi (jam): ");
                durasi17 = jovita.nextInt();
                if (durasi17 > 5) {
                    total17 += 12500;
                } else if (jenis17 == 1) {
                    total17 += durasi17 * 3000;
                } else if (jenis17 == 2) {
                    total17 += durasi17 * 2000;
                }
            } else if (jenis17 == 0) {
                break;
            } else {
                System.out.println("Pilihan tidak valid masukan (1,2,0)");
                continue;
            }
        }
        System.out.println("Total: " + total17);
    }
}
