package p10;

import java.util.Scanner;

public class Star17 {
    public static void main(String[] args) {
        Scanner jovita = new Scanner(System.in);

        System.out.print("Masukkan nilai n = ");
        int n17 = jovita.nextInt();

        for (int i = 0; i <= n17; i += 2) {
            System.out.print("*");
        }
        
    }
}
