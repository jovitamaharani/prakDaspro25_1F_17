package p10;

import java.util.Scanner;

public class Square17 {
    public static void main(String[] args) {
        Scanner jovita = new Scanner(System.in);
        
        System.out.print("Masukan nilai N = ");
        int n17 = jovita.nextInt();

        for (int iOuter17 = 1; iOuter17 <= n17; iOuter17++) {
            for (int i = 0; i <= n17; i++) {
                System.out.print("*");
            }
        }
    }
}
