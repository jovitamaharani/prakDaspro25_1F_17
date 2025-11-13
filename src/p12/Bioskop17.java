package p12;

public class Bioskop17 {
    public static void main(String[] args) {
        String[][] penonton17 = new String[4][2];

        penonton17[0][0] = "Amin";
        penonton17[0][1] = "Bena";
        penonton17[1][0] = "Candra";
        penonton17[1][1] = "Dela";
        penonton17[2][0] = "Eka";
        penonton17[2][1] = "Farhan";
        penonton17[3][0] = "Gisel";
        penonton17[3][1] = "Hana";

        System.out.printf("%s \t %s\n", penonton17[0][0], penonton17[0][1]);
        System.out.printf("%s \t %s\n", penonton17[1][0], penonton17[1][1]);
        System.out.printf("%s \t %s\n", penonton17[2][0], penonton17[2][1]);
        System.out.printf("%s \t %s\n", penonton17[3][0], penonton17[3][1]);

        System.out.println("Penonton pada baris ke-3");
        for (int i = 0; i < penonton17[2].length; i++) {
            System.out.println(penonton17[2][i]);
        }
    }
}
