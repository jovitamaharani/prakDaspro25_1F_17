package p6;

import java.util.Scanner;

public class ifElseCetakKRS17 {
    public static void main(String[] args) {
        Scanner jovita = new Scanner(System.in);

        System.out.println("--- Cetak KRS Siakad---");
        System.out.print("Masukan semester saat ini: ");
        int semester17 = jovita.nextInt();

        if (semester17 == 1) {
            System.out.println("KRS Semester 1 ditampilkan");
        } else if (semester17 == 2) {
             System.out.println("KRS Semester 2 ditampilkan");
        } else if (semester17 == 3) {
             System.out.println("KRS Semester 3 ditampilkan");
        } else if (semester17 == 4) {
             System.out.println("KRS Semester 4 ditampilkan");
        } else if (semester17 == 5) {
             System.out.println("KRS Semester 5 ditampilkan");
        } else if (semester17 == 6) {
             System.out.println("KRS Semester 6 ditampilkan");
        } else if (semester17 == 7) {
             System.out.println("KRS Semester 7 ditampilkan");
        } else if (semester17 == 8) {
             System.out.println("KRS Semester 8 ditampilkan");
        } else {
             System.out.println("Semester tidak valid");
        }
    }
}
