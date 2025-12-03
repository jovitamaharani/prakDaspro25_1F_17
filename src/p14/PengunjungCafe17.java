public class PengunjungCafe17 {
    public static void daftarPengunjung(String... namaPengunjung17) {
        System.out.println("Daftar Nama Pengunjung:");
        for (String nama : namaPengunjung17) {
            System.out.println("- " + nama);
        }
    }

    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Citra");
        daftarPengunjung("Andi");
        daftarPengunjung("Doni", "Eti", "Fahmi", "Galih");
    }
}
