package p7;

import java.util.Scanner;

public class CM_Siakad_17 {
    public static void main(String[] args) {
        Scanner jovita = new Scanner(System.in);

        int skspancasila17 = 2;
        int sksdaspro17 = 3;
        int sksbing17 = 2;
        double setarapancasila17 = 0;
        double setaradaspro17 = 0;
        double setarabing17 = 0;
        String hurufPancasila17 = "";
        String hurufDaspro17 = "";
        String hurufBing17 = "";
        String status = "";

        System.out.println("==== INPUT DATA MAHASISWA ====");
        System.out.print("Nama\t: ");
        String nama17 = jovita.nextLine();
        System.out.print("NIM\t: ");
        String nim17 = jovita.nextLine();

        System.out.println("Masukan nilai angka (0 - 100)");
        System.out.print("Masukan nilai Pancasila: ");
        double pancasila17 = jovita.nextDouble();
        System.out.print("Masukan nilai Dasar Pemrograman: ");
        double daspro17 = jovita.nextDouble();
        System.out.print("Masukan nilai Bahasa inggris: ");
        double bing17 = jovita.nextDouble();

        if ((pancasila17 >= 0 && pancasila17 <= 100 && daspro17 >= 0 && daspro17 <= 100)
                && (bing17 >= 0 && bing17 <= 100)) {


            if (pancasila17 > 80 && pancasila17 <= 100) {
                setarapancasila17 = 4;
                hurufPancasila17 = "A";
            } else if (pancasila17 > 73 && pancasila17 <= 80) {
                setarapancasila17 = 3.5;
                hurufPancasila17 = "B+";
            } else if (pancasila17 > 65 && pancasila17 <= 73) {
                setarapancasila17 = 3;
                hurufPancasila17 = "B";
            } else if (pancasila17 > 60 && pancasila17 <= 65) {
                setarapancasila17 = 2.5;
                hurufPancasila17 = "C+";
            } else if (pancasila17 > 50 && pancasila17 <= 60) {
                setarapancasila17 = 2;
                hurufPancasila17 = "C";
            } else if (pancasila17 > 39 && pancasila17 <= 50) {
                setarapancasila17 = 1;
                hurufPancasila17 = "D";
            } else if (pancasila17 >= 0 && pancasila17 <= 39) {
                setarapancasila17 = 0;
                hurufPancasila17 = "E";
            } else {
                System.out.println("Nilai tidak valid harus (0-100)!!");
            }

            if (daspro17 > 80 && daspro17 <= 100) {
                setaradaspro17 = 4;
                hurufDaspro17 = "A";
            } else if (daspro17 > 73 && daspro17 <= 80) {
                setaradaspro17 = 3.5;
                hurufDaspro17 = "B+";
            } else if (daspro17 > 65 && daspro17 <= 73) {
                setaradaspro17 = 3;
                hurufDaspro17 = "B";
            } else if (daspro17 > 60 && daspro17 <= 65) {
                setaradaspro17 = 2.5;
                hurufDaspro17 = "C+";
            } else if (daspro17 > 50 && daspro17 <= 60) {
                setaradaspro17 = 2;
                hurufDaspro17 = "C";
            } else if (daspro17 > 39 && daspro17 <= 50) {
                setaradaspro17 = 1;
                hurufDaspro17 = "D";
            } else if (daspro17 >= 0 && daspro17 <= 39) {
                setaradaspro17 = 0;
                hurufDaspro17 = "E";
            } else {
                System.out.println("Nilai tidak valid harus (0-100)!!");
            }

            if (bing17 > 80 && bing17 <= 100) {
                setarabing17 = 4;
                hurufBing17 = "A";
            } else if (bing17 > 73 && bing17 <= 80) {
                setarabing17 = 3.5;
                hurufBing17 = "B+";
            } else if (bing17 > 65 && bing17 <= 73) {
                setarabing17 = 3;
                hurufBing17 = "B";
            } else if (bing17 > 60 && bing17 <= 65) {
                setarabing17 = 2.5;
                hurufBing17 = "C+";
            } else if (bing17 > 50 && bing17 <= 60) {
                setarabing17 = 2;
                hurufBing17 = "C";
            } else if (bing17 > 39 && bing17 <= 50) {
                setarabing17 = 1;
                hurufBing17 = "D";
            } else if (bing17 >= 0 && bing17 <= 39) {
                setarabing17 = 0;
                hurufBing17 = "E";
            } else {
                System.out.println("Nilai tidak valid harus (0-100)!!");
            }

            int totalSks17 = skspancasila17 + sksdaspro17 + sksbing17;
            double bobot17 = ((skspancasila17 * setarapancasila17) + (sksdaspro17 * setaradaspro17)
                    + (sksbing17 * setarabing17));
            double ip17 = bobot17 / totalSks17;

            double nilai = (pancasila17 + daspro17 + bing17) / 3;
            if (ip17 > 2
                    && (hurufPancasila17.equalsIgnoreCase("a") || hurufPancasila17.equalsIgnoreCase("b")
                            || hurufPancasila17.equalsIgnoreCase("c+") || hurufPancasila17.equalsIgnoreCase("c"))
                    && ((hurufPancasila17 != "E") || (hurufDaspro17 != "E")  ||(hurufBing17 != "E"))) {
                if (ip17 >= 2 && ip17 <= 2.75) {
                    status = "Mahasiswa LULUS dengan percobaan";
                } else if (ip17 < 2.75) {
                    status = "Mahasiswa dinyatakan LULUS";
                }else {
                    status = "Mahasiswa dinyatakan LULUS";
                }
                
            } else if (hurufPancasila17.equalsIgnoreCase("e") || hurufPancasila17.equalsIgnoreCase("d")) {
                status = "TIDAK LULUS (NILAI PANCASILA D ATAU E)";
            } else if (hurufPancasila17.equalsIgnoreCase("e") || hurufDaspro17.equalsIgnoreCase("e")
                    || hurufBing17.equalsIgnoreCase("e")) {
                System.out.println("TIDAK LULUS TERDAPAT NILAI E");
            } else if (ip17 < 2) {
                status = "TIDAK LULUS (nilai kurang dari 60)";
            } else {
                System.out.println("TIDAK LULUS");
            }

            System.out.println("===============================================");
            System.out.println("\tHASIL KONVERSI NILAI MAHASISWA");
            System.out.println("===============================================");
            System.out.println("Nama\t: " + nama17);
            System.out.println("NIM\t: " + nim17);
            System.out.println("------------------------------------------------");
            System.out.println("Mata Kuliah \t SKS \t Nilai \t Huruf \t Setara");
            System.out.println("------------------------------------------------");
            System.out
                    .println("Pancasila \t " + skspancasila17 + " \t " + pancasila17 + " \t " + hurufPancasila17 + "\t"
                            + setarapancasila17);
            System.out.println(
                    "Daspro \t\t " + sksdaspro17 + " \t " + daspro17 + " \t " + hurufDaspro17 + "\t" + setaradaspro17);
            System.out.println("Bing \t\t " + sksbing17 + " \t " + bing17 + " \t " + hurufBing17 + "\t" + setarabing17);
            System.out.println("------------------------------------------------");
            System.out.println("Total SKS\t: " + totalSks17);
            System.out.println("Total Bobot\t: " + bobot17);
            System.out.print("Indeks Prestasi (IP): " + String.format("%.2f", ip17));
            
            System.out.println("\nStatus semester: " + status);

        } else {
            System.out.println("Nilai tidak valid harus (0-100)!!");

        }

    }
}
