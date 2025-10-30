package p10;

import java.util.Scanner;

public class Square17 {
    public static void main(String[] args) {
        Scanner jovita = new Scanner(System.in);
        
        System.out.print("Masukan nilai N = ");
        int n17 = jovita.nextInt();

        for (int iOuter17 = 0; iOuter17 <= n17; iOuter17++) {
            for (int i = 1; i <= n17; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
