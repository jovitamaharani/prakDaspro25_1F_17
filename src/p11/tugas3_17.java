package p11;

import java.util.Scanner;

public class tugas3_17 {
    public static void main(String[] args) {
        Scanner jovita = new Scanner(System.in);
        int hasil17 = 0;

        String[] menu17 = { "Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino",
                "Chocolate Ice" };
        System.out.println("--- List Menu ---");
        for (int i = 0; i < menu17.length; i++) {
            System.out.println((i+1) + ". " + menu17[i]);
        }

        System.out.print("Masukan nama makanan yang ingin dicari: ");
        String key17 = jovita.nextLine();

        for (int i = 0; i < menu17.length; i++) {
            if (key17.equalsIgnoreCase(menu17[i])) {
                hasil17 = i;
                break;
            }
        }

        if (hasil17 == 0) {
            System.out.println("makanan tidak ada di menu");
        } else {
            System.out.println("Makanan " + key17 + " tersedia pada menu ke-" + (hasil17 + 1));
        }
    }
}
