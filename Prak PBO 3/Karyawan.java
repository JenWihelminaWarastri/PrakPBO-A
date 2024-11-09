public class Karyawan {
    protected String kodeKaryawan;
    protected String nama;

    Karyawan(String kodeKaryawan, String nama) {
        this.kodeKaryawan = kodeKaryawan;
        this.nama = nama;
    }
    public void getinfo() {
        System.out.println("Kode Karyawan : "+this.kodeKaryawan);
        System.out.println("Nama : "+this.nama);
    }
    public void absenPagi() {
        System.out.println(this.nama + " : Absen Pagi");
    }
    public void kerja() {
        System.out.println(this.nama + " : Sedang bekerja");
    }
    public void pulang() {
        System.out.println(this.nama + " : Absen Pulang");
    }
}

