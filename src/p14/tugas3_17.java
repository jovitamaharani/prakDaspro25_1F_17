import java.util.Scanner;

public class tugas3_17 {

    public static void inputPenjualan17(int[][] penjualan17, String[] menu17, int hari17, Scanner jovita) {
        System.out.println("\n--- Isi Data Penjualan ---");
        for (int i = 0; i < menu17.length; i++) {
            System.out.println("Input data untuk " + menu17[i] + ":");
            for (int j = 0; j < hari17; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                penjualan17[i][j] = jovita.nextInt();
            }
        }
    }

    public static void tampilTabel17(int[][] penjualan17, String[] menu17, int hari17) {
        System.out.println("\n--- Rekap Data Penjualan ---");
        System.out.print("Menu\t\t");
        for (int j = 0; j < hari17; j++) {
            System.out.print("H" + (j + 1) + "\t");
        }
        System.out.println();

        for (int i = 0; i < menu17.length; i++) {
            System.out.print(menu17[i] + (menu17[i].length() < 8 ? "\t\t" : "\t"));
            for (int j = 0; j < hari17; j++) {
                System.out.print(penjualan17[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void menuTertinggi17(int[][] penjualan17, String[] menu17, int hari17) {
        int totalTertinggi17 = 0;
        String menuTop17 = "";

        for (int i = 0; i < menu17.length; i++) {
            int totalPerMenu17 = 0;
            for (int j = 0; j < hari17; j++) {
                totalPerMenu17 += penjualan17[i][j];
            }
            if (totalPerMenu17 > totalTertinggi17) {
                totalTertinggi17 = totalPerMenu17;
                menuTop17 = menu17[i];
            }
        }
        System.out.println("\nMenu dengan penjualan tertinggi: " + menuTop17 + " (Total: " + totalTertinggi17 + ")");
    }

    public static void rataMenu17(int[][] penjualan17, String[] menu17, int hari17) {
        System.out.println("\nRata-rata penjualan per menu:");
        for (int i = 0; i < menu17.length; i++) {
            int totalPerMenu17 = 0;
            for (int j = 0; j < hari17; j++) {
                totalPerMenu17 += penjualan17[i][j];
            }
            double rata17 = (double) totalPerMenu17 / hari17;
            System.out.println(menu17[i] + ": " + rata17);
        }
    }

    public static void main(String[] args) {
        Scanner jovita = new Scanner(System.in);

        System.out.print("Masukkan jumlah menu: ");
        int jumlahMenu17 = jovita.nextInt();
        System.out.print("Masukkan jumlah hari: ");
        int hari17 = jovita.nextInt();

        String[] menu17 = new String[jumlahMenu17];
        int[][] penjualan17 = new int[jumlahMenu17][hari17];

        jovita.nextLine(); 
        System.out.println("\n--- Input Nama Menu ---");
        for (int i = 0; i < jumlahMenu17; i++) {
            System.out.print("Nama menu ke-" + (i + 1) + ": ");
            menu17[i] = jovita.nextLine();
        }

        inputPenjualan17(penjualan17, menu17, hari17, jovita);
        tampilTabel17(penjualan17, menu17, hari17);
        menuTertinggi17(penjualan17, menu17, hari17);
        rataMenu17(penjualan17, menu17, hari17);
    }
}