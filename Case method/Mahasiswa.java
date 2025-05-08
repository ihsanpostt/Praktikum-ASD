public class Mahasiswa {
    String nim, nama, prodi;
    MataKuliah[] mataKuliah;
    double[][] nilai;

    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    public void inisialisasiMataKuliah(int jumlahMK) {
        nilai = new double[jumlahMK][4];
    }

    public void setNilai(int indexMK, double tugas, double kuis, double uts) {
        nilai[indexMK][0] = tugas;
        nilai[indexMK][1] = kuis;
        nilai[indexMK][2] = uts;
        nilai[indexMK][3] = (tugas * 0.3) + (kuis * 0.3) + (uts * 0.4);
    }

    public void tampilkan() {
        System.out.println("NIM: " + nim + " | Nama: " + nama + " | Prodi: " + prodi);
    }
}
