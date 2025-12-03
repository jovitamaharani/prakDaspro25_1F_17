public class PengunjungCafe17 {
    public static void daftarPengunjung(String... namaPengunjung17) {
        System.out.println("Daftar Nama Pengunjung:");
        for (int i = 0; i < namaPengunjung17.length; i++) {
            System.out.println("- " + namaPengunjung17[i]);
        }
    }

    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Citra");
        daftarPengunjung("Andi");
        daftarPengunjung("Doni", "Eti", "Fahmi", "Galih");
    }
}
