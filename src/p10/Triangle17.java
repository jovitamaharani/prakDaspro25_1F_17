package p10;

import java.util.Scanner;

public class Triangle17 {
    public static void main(String[] args) {
        Scanner jovita = new Scanner(System.in);
        
        System.out.print("Masukan nilai n = ");
        int n17 = jovita.nextInt();
        int i17 = 0;
        int j17 = 0;

        while (i17 <= n17) {
            while (j17 < i17) {
                System.out.print("*");
                j17++;
            }
            System.out.println();
            i17++;
        }
    }
}
