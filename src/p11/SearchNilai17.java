package p11;

import java.util.Scanner;

public class SearchNilai17 {
    public static void main(String[] args) {
        Scanner jovita = new Scanner(System.in);
        int hasil17 = 0;

        System.out.print("Masukan banyaknya nilai yang akan diinput: ");
        int jmlNilai17 = jovita.nextInt();
        int[] arrNilai17 = new int[jmlNilai17];

        for (int i = 0; i < jmlNilai17; i++) {
            System.out.print("Masukan nilai mahasiswa ke-" + (i + 1) + " : ");
            arrNilai17[i] = jovita.nextInt();
        }

        System.out.print("Masukan nilai yang ingin dicari: ");
        int key17 = jovita.nextInt();

        for (int i = 0; i < arrNilai17.length; i++) {
            if (key17 == arrNilai17[i]) {
                hasil17 = i;
                break;
            }
        }

        if (hasil17 == 0) {
            System.out.println("nilai tidak ditemukan");
        } else {
            System.out.println("Nilai " + key17 + " ketemu, merupakan nilai mahasiswa ke-" + hasil17);
        }
        System.out.println();
        System.out.println();
    }
}