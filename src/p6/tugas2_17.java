package p6;

import java.util.Scanner;

public class tugas2_17 {
    public static void main(String[] args) {
        Scanner jovita = new Scanner(System.in);

        System.out.print("Masukan angka\t: ");
        int angka17 = jovita.nextInt();

        if (angka17 % 2 == 0) {
            System.out.println("======================================");
            System.out.println("\tAngka genap\t");
            System.out.println("======================================");
        } else {
            System.out.println("Angka ganjil");
        } 
    }
}
