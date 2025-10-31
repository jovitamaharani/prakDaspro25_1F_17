package p10;

import java.util.Scanner;

public class tugas2_17 {
    public static void main(String[] args) {
        Scanner jovita = new Scanner(System.in);

        while (true) {
            System.out.print("Masukan angka (minimal 3):");
            int angka17 = jovita.nextInt();

            for (int i = 0; i < angka17; i++) {

                for (int j = 0; j < angka17; j++) {
                    if (i == 0 || j == 0 || angka17 - 1 == i || angka17 - 1 == j) {
                        System.out.print(angka17);
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            
            if (angka17 < 3) {
                System.out.println("angka tidak valid, angka minimal 3");
                continue;
            } else {
                break;
            }
        }
    }
}
