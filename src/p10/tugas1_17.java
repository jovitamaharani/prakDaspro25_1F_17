package p10;

import java.util.Scanner;

public class tugas1_17 {
    public static void main(String[] args) {
        
        Scanner sultan = new Scanner(System.in);
        System.out.print("Masukan nilai: ");
        int nilaiAkhir = sultan.nextInt();
        int kuadrat17 = 0;

        // perulangan untuk jumlah kuadrat ke bawah
        for (int i = 1; i <= nilaiAkhir; i++) {
            // nilai awal total 
            int total17 = 0;
            // deklarasi untuk tampilan kuadrat
            String tampil17 = "";

            for (int j = 1; j <= i; j++) {
                // rumus kuadrat
                 kuadrat17 = j * j;
                // total = total awal ditambah dengan total kuadrat
                total17 = total17 + kuadrat17;
                
                // agar tidak menampilan tampilan kuadrat bila nilai 1
                if (j == 1) {
                    tampil17 = "" + kuadrat17;
                } else {
                    tampil17 = tampil17 +  " + " + kuadrat17;
                }
                
            }  
            // System.out.println("n = " + i + " -> jumlah kuadrat = " + tampil17 + " = " + total17);
            System.out.println(tampil17 + " = " + total17);
        }
    }
}