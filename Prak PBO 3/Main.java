public class Main {
    public static void main(String[] args) {
    Dosen dos = new Dosen("23455", "Andiani", "332211");
        dos.getNIDN();
        dos.getinfo();
        dos.absenPagi();
        dos.ngajar();
        dos.pulang();
    Dosen dosion = new Dosen("23456", "Ionia", "332212");
        dosion.getNIDN();
        dosion.getinfo();
        dosion.absenPagi();
        dosion.ngajar();
        dosion.pulang();
    Karyawan kar = new Karyawan("12345", "Ridho");
        kar.getinfo();
        kar.absenPagi();
        kar.kerja();
        kar.pulang();
    Karyawan kar2 = new Karyawan("12346", "Melan");
        kar2.getinfo();
        kar2.absenPagi();
        kar2.kerja();
        kar2.pulang();
        
    }
}
