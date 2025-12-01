import java.util.Scanner;

public class kuis17 {
    public static void main(String[] args) {
        Scanner jovita = new Scanner(System.in);
                
        String[] nama17 = {"Sito", "Semi", "Risma", "Vero", "Barri"};
        String[] bulan17 = {" ","Jan", "Feb", "Maret", "april", "total"};
        int[][] daftar17 = {{29,30,29,28}, {30,30,30,25}, {30,0,28,27},{30,30,30,0},{0,29,28,27}};
        double gaji17 = 0, jmlpotongan17;
        String status17="";

        for (int j = 0; j < bulan17.length; j++) {
            System.out.print(bulan17[j] + "\t");
        }
        System.out.println(); 

        for (int j = 0; j < 5; j++) {
            System.out.print(nama17[j] + "\t");

            for (int i = 0; i < 5; i++) {
                if (daftar17[i][j] < 30) {
                    jmlpotongan17 = 30 - daftar17[i][j];
                    gaji17 = jmlpotongan17 * 2500;
                    status17 = Double.toString(gaji17);
                } else if (daftar17[i][j] == 0) {
                    status17 = "cuti";
                }
                System.out.print(status17 + "\t");
            }
            System.out.println();
        }


    }
}