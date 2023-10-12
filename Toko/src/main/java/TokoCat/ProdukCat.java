package TokoCat;

public class ProdukCat {
    private String nama;
    private double harga;

    public ProdukCat(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    @Override
    public String toString() {
        return "Nama Produk: " + nama + ", Harga: " + harga;
    }
}
