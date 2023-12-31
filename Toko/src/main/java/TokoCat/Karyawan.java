package TokoCat;

public class Karyawan {
    private String nama;
    private String gaji;

    public Karyawan(String nama, String gaji) {
        this.nama = nama;
        this.gaji = gaji;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getGaji() {
        return gaji;
    }

    public void setJabatan(String gaji) {
        this.gaji = gaji;
    }

    @Override
    public String toString() {
        return "Nama Karyawan: " + nama + ", Jabatan: " + gaji;
    }
}
