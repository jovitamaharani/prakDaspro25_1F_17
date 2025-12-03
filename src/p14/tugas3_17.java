import java.util.Scanner;

public class tugas3_17 {

    public static void inputPenjualan17(int[][] penjualan17, String[] menu17, int hari17, Scanner jovita) {
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
        System.out.println("Menu dengan penjualan tertinggi: " + menuTop17 + " (Total: " + totalTertinggi17 + ")");
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
        int hari17 = 7;
        String[] menu17 = { "Kopi", "Teh", "Es Kelapa Muda", "Roti Bakar", "Gorengan" };
        int[][] penjualan17 = new int[menu17.length][hari17];

        inputPenjualan17(penjualan17, menu17, hari17, jovita);
        tampilTabel17(penjualan17, menu17, hari17);
        menuTertinggi17(penjualan17, menu17, hari17);
        rataMenu17(penjualan17, menu17, hari17);
    }
}