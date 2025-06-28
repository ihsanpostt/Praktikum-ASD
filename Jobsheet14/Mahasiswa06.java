package Jobsheet14;
public class Mahasiswa06 {

        String nim, nama, kelas;
        double ipk;
    
        Mahasiswa06() {
        }

        Mahasiswa06(String nim, String nama, String kelas, double ipk) {
            this.nim = nim;
            this.nama = nama;
            this.kelas = kelas;
            this.ipk = ipk;
        }
    
        void tampilInformasi() {
            System.out.println("Nama: " + this.nama + " | NIM: " + this.nim + " | Kelas: " + this.kelas + " | IPK: " + this.ipk);
        }

}