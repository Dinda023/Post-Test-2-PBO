package TokoCat;

public class Transaksi {
    private Karyawan karyawan;
    private ProdukCat produk;

    public Transaksi(Karyawan karyawan, ProdukCat produk) {
        this.karyawan = karyawan;
        this.produk = produk;
    }
//getter
    public Karyawan getKaryawan() {
        return karyawan;
    }
//setter
    public void setKaryawan(Karyawan karyawan) {
        this.karyawan = karyawan;
    }

    public ProdukCat getProduk() {
        return produk;
    }

    public void setProduk(ProdukCat produk) {
        this.produk = produk;
    }

    @Override
    public String toString() {
        return "Karyawan: " + karyawan.getNama() + ", Produk: " + produk.getNama();
    }
}
