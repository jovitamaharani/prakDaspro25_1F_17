import java.util.Scanner;

public class HitungBalok17 {
    public static int hitungLuas(int pjg17, int lb17) {
        int Luas17 = pjg17 * lb17;
        return Luas17;
    }

    public static int hitungVolume(int tinggi17, int a17, int b17) {
        int volume17 = hitungLuas(a17, b17) * tinggi17;
        return volume17;
    }

    public static void main(String[] args) {
        Scanner jovita = new Scanner(System.in);
        int p17, l17, t17, L17, vol17;

        System.out.print("Masukkan panjang: ");
        p17 = jovita.nextInt();
        System.out.print("Masukkan lebar: ");
        l17 = jovita.nextInt();
        System.out.print("Masukkan tinggi: ");
        t17 = jovita.nextInt();

        L17 = hitungLuas(p17, l17);
        System.out.println("Luas Persegi Panjang adalah " + L17);
        vol17 = hitungVolume(t17, p17, l17);
        System.out.println("Volume Balok adalah " + vol17);
    }
}