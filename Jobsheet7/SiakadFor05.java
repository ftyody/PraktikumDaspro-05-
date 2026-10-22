import java.util.Scanner;
public class SiakadFor05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        double nilai, tertinggi = 0, terendah = 100;
        int totalLulus = 0, totalTidakLulus = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukan nilai mahasiswa ke-" + i + ": ");
            nilai = scanner.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            if (nilai >= 60) {
                totalLulus++;
            } else {
                totalTidakLulus++;
            }
        }
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Jumlah mahasiswa yang lulus: " + totalLulus);
        System.out.println("Jumlah mahasiswa yang tidak lulus: " + totalTidakLulus);
        scanner.close();
    }
}