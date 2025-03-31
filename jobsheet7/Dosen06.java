class Dosen06 {
    String kode, nama;
    boolean jenisKelamin;
    int usia;

    public Dosen06(String kode, String nama, boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    public void tampil() {
        System.out.println("Kode: " + kode + ", Nama: " + nama + ", JK: " + (jenisKelamin ? "Perempuan" : "Laki-laki") + ", Usia: " + usia);
    }
}