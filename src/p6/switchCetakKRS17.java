package p6;

import java.util.Scanner;

public class switchCetakKRS17 {
    public static void main(String[] args) {
        Scanner jovita = new Scanner(System.in);

        System.out.println("--- Cetak KRS Siakad---");
        System.out.print("Masukan semester saat ini: ");
        int semester17 = jovita.nextInt();

        switch (semester17) {
            case 1:
                System.out.println("KRS Semester 1 ditampilkan");
                break;
            case 2:
                System.out.println("KRS Semester 2 ditampilkan");
                break;
            case 3:
                System.out.println("KRS Semester 3 ditampilkan");
                break;
            case 4:
                System.out.println("KRS Semester 4 ditampilkan");
                break;
            case 5:
                System.out.println("KRS Semester 5 ditampilkan");
                break;
            case 6:
                System.out.println("KRS Semester 6 ditampilkan");
                break;
            case 7:
                System.out.println("KRS Semester 7 ditampilkan");
                break;
            case 8:
                System.out.println("KRS Semester 8 ditampilkan");
                break;

            default:
                System.out.println("Semester tidak valid");
                break;
        }
    }
}
