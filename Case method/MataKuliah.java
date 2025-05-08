public class MataKuliah {
    String kode, nama;
    int sks;

    public MataKuliah(String kode, String nama, int sks) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
    }

    public void tampilkan() {
        System.out.println("Kode MK: " + kode + " | Nama: " + nama + " | SKS: " + sks);
    }
}
