package p9;

import java.util.Scanner;

public class SiakadFor17 {
    public static void main(String[] args) {
        Scanner jovita = new Scanner(System.in);
        double nilai17, tertinggi17 = 0, terendah17 = 100;
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukan nilai mahasiswa ke-" + i + ": ");
            nilai17 = jovita.nextDouble();
            if (nilai17 > tertinggi17) {
                tertinggi17 = nilai17;
            }
            if (nilai17 < terendah17) {
                terendah17 = nilai17;
            }
        }

        System.out.println("Nilai tertinggi: " + tertinggi17);
        System.out.println("Nilai terendah: " + terendah17);
    }
}
