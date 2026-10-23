package Tugas;
import java.util.Scanner;

public class TiketBioskop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hargaTiket = 50000;
		int jumlahTiket;
		int totalTiket = 0;
		int totalHarga = 0;
		int jumlahPelanggan;

		System.out.print("Masukan Total Pelanggan Hari Ini: ");
		jumlahPelanggan = sc.nextInt();

		
		for (int i = 1; i <= jumlahPelanggan; i++) {
			System.out.print("Jumlah tiket yang dibeli pelanggan ke-" + i + ": ");
			jumlahTiket = sc.nextInt();

			if (jumlahTiket < 0) {
				System.out.println("Gak boleh minus ya!");
				i--; 
			} else if (jumlahTiket > 0) {
				totalTiket += jumlahTiket;

				int sakDurungeDiskon = jumlahTiket * hargaTiket;
				int diskon = 0;

				if (jumlahTiket > 10) {
					diskon = 15;
				} else if (jumlahTiket > 4) {
					diskon = 10;
				}

				int marineDiskon = sakDurungeDiskon - (sakDurungeDiskon * diskon / 100);
				totalHarga += marineDiskon;
			}
		}

		System.out.println("Total tiket terjual hari ini: " + totalTiket);
		System.out.println("Total harga penjualan : " + totalHarga);
		sc.close();
	}
}