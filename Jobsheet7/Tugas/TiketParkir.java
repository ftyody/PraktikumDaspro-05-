package Tugas;
import java.util.Scanner;

public class TiketParkir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis;
        int durasi;
        int total = 0;

        do {
            System.out.println("PARKIRAN GEDUNG AX");
            System.out.println("1. Mobil");
            System.out.println("2. Motor");
            System.out.println("0. Selesai");
            System.out.print("Jenis kendaraan yang diparkir: ");
            jenis = sc.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.print("Parkir berapa lama? (jam): ");
                durasi = sc.nextInt();

                if (jenis == 1) {
                    total += durasi * 3000;
                } else {
                    total += durasi * 2000;
                }
            } else if (jenis != 0) {
                System.out.println("Jenis tidak valid");
            }
        } while (jenis != 0);

        System.out.println("Total biaya parkir: Rp" + total);
        sc.close();
    }
}

