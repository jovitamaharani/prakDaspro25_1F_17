import java.util.Scanner;

public class tugas2_17 {
    public static void isianArray(int[] nilai17, Scanner jovita) {
        for (int i = 0; i < nilai17.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai17[i] = jovita.nextInt();
        }
    }

    public static void tampilArray(int[] nilai17) {
        System.out.print("Daftar Nilai: ");
        for (int i = 0; i < nilai17.length; i++) {
            System.out.println((i + 1) + ". " + nilai17[i]);
        }
        System.out.println();
    }

    public static int hitTot(int[] array17) {
        int total17 = 0;
        for (int i = 0; i < array17.length; i++) {
            total17 += array17[i];
        }
        return total17;
    }

    public static void main(String[] args) {
        Scanner jovita = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int n17 = jovita.nextInt();
        int[] dataNilai17 = new int[n17];

        isianArray(dataNilai17, jovita);
        tampilArray(dataNilai17);
        int total17 = hitTot(dataNilai17);
        System.out.println("Nilai tertinggi adalah: " + total17);
    }
}