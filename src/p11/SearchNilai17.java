package p11;

public class SearchNilai17 {
    public static void main(String[] args) {
        int[] arrNilai17 = {80, 85, 78, 96, 90, 82, 86};
        int key17 = 90;
        int hasil17 = 0;

        for (int i = 0; i < arrNilai17.length; i++) {
            if (key17 == arrNilai17[i]) {
                hasil17 = i;
                break;
            }
        }

        System.out.println();
        System.out.println("Nilai " + key17 + " ketemu di indeks ke-" + hasil17);
        System.out.println();   
    }
}
