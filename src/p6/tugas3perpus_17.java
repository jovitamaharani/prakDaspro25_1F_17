package p6;

import java.util.Scanner;

public class tugas3perpus_17 {
    public static void main(String[] args) {
        Scanner jovita = new Scanner(System.in);

        boolean kartu17, registrasi17;
        System.out.print("Apakah membawa Kartu? (true/false) ");
        kartu17 = jovita.nextBoolean();
        System.out.print("Apakah sudah registrasi online? (true/false) ");
        registrasi17 = jovita.nextBoolean();

        if (kartu17 || registrasi17) {
            System.out.println("Boleh masuk");
        } else {
            System.out.println("tidak boleh masuk");
        }
    }
}
