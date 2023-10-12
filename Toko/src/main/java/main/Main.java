package main;

import java.util.Scanner;
import TokoCat.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            TokoCat toko = new TokoCat();
            
            int choice;
            do {
                System.out.println("Menu:");
                System.out.println("1. Lihat Produk");
                System.out.println("2. Tambah Produk");
                System.out.println("3. Edit Produk");
                System.out.println("4. Hapus Produk");
                System.out.println("5. Lihat Karyawan");
                System.out.println("6. Tambah Karyawan");
                System.out.println("7. Hapus Karyawan");
                System.out.println("8. Beli Produk");
                System.out.println("9. Lihat Riwayat Transaksi");
                System.out.println("10. Keluar");
                System.out.print("Pilih menu (1-10): ");
                choice = input.nextInt();
                input.nextLine();
                
                switch (choice) {
                    case 1:
                        toko.lihatProduk();
                        break;
                    case 2:
                        toko.tambahProduk();
                        break;
                    case 3:
                        toko.editProduk();
                        break;
                    case 4:
                        toko.hapusProduk();
                        break;
                    case 5:
                        toko.lihatKaryawan();
                        break;
                    case 6:
                        toko.tambahKaryawan();
                        break;
                    case 7:
                        toko.hapusKaryawan();
                        break;
                    case 8:
                        toko.beliProduk();
                        break;
                    case 9:
                        toko.lihatRiwayatTransaksi();
                        break;
                    case 10:
                        System.out.println("Keluar dari program.");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                        break;
                }
            } while (choice != 10);
        }
    }
}
