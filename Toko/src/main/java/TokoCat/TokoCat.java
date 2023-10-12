package TokoCat;

import java.util.ArrayList;

import java.util.Scanner;
//Arraylist
//Best practice final property
public class TokoCat {
    private final ArrayList<ProdukCat> produkCats = new ArrayList<>();
    private final ArrayList<Karyawan> karyawanList = new ArrayList<>();
    private final ArrayList<Transaksi> transaksiList = new ArrayList<>();
//READ
    public void lihatProduk() {
        System.out.println("Daftar Produk Cat:");
        for (ProdukCat produk : produkCats) {
            System.out.println(produk.toString());
        }
    }
//CREATE
    public void tambahProduk() {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama Produk: ");
        String nama = input.nextLine();
        System.out.print("Harga: ");
        double harga = input.nextDouble();
        input.nextLine();

        ProdukCat produk = new ProdukCat(nama, harga);
        produkCats.add(produk);

        System.out.println("Produk berhasil ditambahkan.");
    }
//UPDATE
    public void editProduk() {
        Scanner input = new Scanner(System.in);

        System.out.println("");
        for (int i = 0; i < produkCats.size(); i++) {
            System.out.println((i + 1) + ". " + produkCats.get(i).toString());
        }

        System.out.print("Masukkan nomor Produk yang akan diedit: ");
        int id = input.nextInt();

        if (id >= 1 && id <= produkCats.size()) {
            ProdukCat produk = produkCats.get(id - 1);

            System.out.print("Nama Produk: ");
            String nama = input.next();
            System.out.print("Harga: ");
            double harga = input.nextDouble();

            produk.setNama(nama);
            produk.setHarga(harga);

            System.out.println("Produk berhasil diedit.");
        } else {
            System.out.println("Nomor Produk tidak valid.");
        }
    }
//DELETE
    public void hapusProduk() {
        Scanner input = new Scanner(System.in);

        System.out.println("");
        for (int i = 0; i < produkCats.size(); i++) {
            System.out.println((i + 1) + ". " + produkCats.get(i).toString());
        }

        System.out.print("Masukkan nomor Produk yang akan dihapus: ");
        int id = input.nextInt();

        if (id >= 1 && id <= produkCats.size()) {
            ProdukCat produk = produkCats.remove(id - 1);
            System.out.println("Produk " + produk.getNama() + " berhasil dihapus.");
        } else {
            System.out.println("nomor Produk tidak valid.");
        }
    }

    public void lihatKaryawan() {
        System.out.println("Daftar Karyawan:");
        for (Karyawan karyawan : karyawanList) {
            System.out.println(karyawan.toString());
        }
    }

    public void tambahKaryawan() {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama Karyawan: ");
        String nama = input.nextLine();
        System.out.print("Gaji: ");
        String gaji = input.nextLine();

        Karyawan karyawan = new Karyawan(nama, gaji);
        karyawanList.add(karyawan);

        System.out.println("Karyawan berhasil ditambahkan.");
    }

    public void hapusKaryawan() {
        Scanner input = new Scanner(System.in);

        System.out.println("Daftar Karyawan:");
        for (int i = 0; i < karyawanList.size(); i++) {
            System.out.println((i + 1) + ". " + karyawanList.get(i).toString());
        }

        System.out.print("Masukkan nomor Karyawan yang akan dihapus: ");
        int id = input.nextInt();

        if (id >= 1 && id <= karyawanList.size()) {
            Karyawan karyawan = karyawanList.remove(id - 1);
            System.out.println("Karyawan " + karyawan.getNama() + " berhasil dihapus.");
        } else {
            System.out.println("Nomor Karyawan tidak valid.");
        }
    }

    public void beliProduk() {
        Scanner input = new Scanner(System.in);

        System.out.println("Pilih Produk yang akan dibeli:");
        for (int i = 0; i < produkCats.size(); i++) {
            System.out.println((i + 1) + ". " + produkCats.get(i).getNama());
        }

        System.out.print("Masukkan nomor Produk yang akan dibeli: ");
        int produkId = input.nextInt();

        if (produkId >= 1 && produkId <= produkCats.size()) {
            ProdukCat produk = produkCats.get(produkId - 1);

            System.out.println("Pilih Kasir yang melayani pembelian:");
            for (int i = 0; i < karyawanList.size(); i++) {
                System.out.println((i + 1) + ". " + karyawanList.get(i).getNama());
            }

            System.out.print("Masukkan nomor Kasir yang melayani pembelian: ");
            int karyawanId = input.nextInt();

            if (karyawanId >= 1 && karyawanId <= karyawanList.size()) {
                Karyawan karyawan = karyawanList.get(karyawanId - 1);
                Transaksi transaksi = new Transaksi(karyawan, produk);
                transaksiList.add(transaksi);
                System.out.println("Transaksi berhasil ditambahkan.");
            } else {
                System.out.println("Nomor Karyawan tidak valid.");
            }
        } else {
            System.out.println("Nomor Produk tidak valid.");
        }
    }

   
    public void lihatRiwayatTransaksi() {
        System.out.println("Riwayat Transaksi:");
        for (Transaksi transaksi : transaksiList) {
            System.out.println(transaksi.toString());
        }
    }
}
