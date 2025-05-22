public class Mahasiswa06 {

        String nim, nama, kelas;
        double ipk;
    
        Mahasiswa06() {
    
        }
    
        Mahasiswa06(String nama, String nim, String kelas, double ipk) {
            this.nama = nama;
            this.nim = nim;
            this.kelas = kelas;
            this.ipk = ipk;
        }
      
        public void tampilInformasi() {
        System.out.printf("%-10s %-10s %-4s %.1f\n", nama, nim, kelas,ipk);
        }
}