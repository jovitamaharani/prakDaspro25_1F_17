package p12;

import java.util.Arrays;

public class Numbers17 {
    public static void main(String[] args) {
        int[][] myNumbers17 = new int[3][];
        myNumbers17[0] = new int[5];
        myNumbers17[1] = new int[3];
        myNumbers17[2] = new int[1];

        for (int i17 = 0; i17 < myNumbers17.length; i17++) {
            System.out.println("Panjang baris ke-" + (i17 + 1) + ": " + myNumbers17[i17].length);
        }
    }
}
