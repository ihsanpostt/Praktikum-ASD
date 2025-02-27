public class MahasiswaMain06 {
    public static void main(String[] args) {
        Mahasiswa06 mhsl = new Mahasiswa06 ();
        mhsl.nama = "Muhammad Ali Farhan";
        mhsl.nim = "244107020189";
        mhsl.kelas = "ST 2J";
        mhsl.ipk = 3.55;

        mhsl.tampilkanInformasi();
        mhsl.ubahKelas("SI 2K");
        mhsl.updateIPK(3.60);
        mhsl.tampilkanInformasi();
        
        Mahasiswa06 mhs2 = new Mahasiswa06("annisa nabila", "2141720160", 3.25, "TI 2L");
        mhs2.updateIPK(3.30);
        mhs2.tampilkanInformasi();

        Mahasiswa06 mhsihsan = new Mahasiswa06 ("Burhanuddin Ihsan", "244107020189", 3.88, "ST 2J");
        mhsihsan.tampilkanInformasi();
    }

}
