package p10;

public class tugas1_17 {
    public static void main(String[] args) {
        int total17 = 0;
        String tampil17 = "";

        for (int i = 1; i <= 5; i++) {
            
            int kuadrat17 = i * i;
            total17 += kuadrat17;
            
            if (i == 1) {
                tampil17 = "" + kuadrat17;
            } else {
                tampil17 += " + " + kuadrat17;
            }

            System.out.println("n = " + i + " -> jumlah kuadrat = " + tampil17 + " = " + total17);
        }
    }
}