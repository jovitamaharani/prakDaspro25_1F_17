import java.util.Scanner;

public class tugas1_17 {
    public static int hitungVolume(int sisi17) {
        return sisi17 * sisi17 * sisi17;
    }

    public static int hitungLuasPermukaan(int sisi17) {
        return 6 * (sisi17 * sisi17);
    }

    public static void main(String[] args) {
        Scanner jovita = new Scanner(System.in);
        System.out.print("Masukkan panjang sisi kubus: ");
        int sisi17 = jovita.nextInt();

        System.out.println("Volume Kubus: " + hitungVolume(sisi17));
        System.out.println("Luas Permukaan Kubus: " + hitungLuasPermukaan(sisi17));
    }
}
