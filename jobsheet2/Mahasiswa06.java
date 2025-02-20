public class Mahasiswa06 {

    String nama;
    String nim;
    double ipk;
    String kelas;


    void tampilkanInformasi(){
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("IPK : " + ipk);
        System.out.println("Kelas : " + kelas);
    }
    
        public Mahasiswa06(){
            
        }
        
    public Mahasiswa06(String nm, String nim, double ipk, String kls) {
        nama = nm;
        this.nim = nim;
        this.ipk = ipk;
        kelas = kls;
    }
    
    void ubahKelas(String kelasBaru){
        kelas = kelasBaru;
    }
    void updateIPK(double ipkBaru){
        if (ipk >= 0 && ipk <=4) {
            ipk = ipkBaru;
        }else{
            System.out.print("ipk tidak valid. Harus antara 0.0 dan 4.0 ");
        }
    }
    
    String nilaiKinerja(){
        if (ipk >= 3.5) {
            return "kinerja sangat baik";
        } else if (ipk >= 3.0) {
            return "kinerja baik";
        } else if (ipk >= 2.0) {
            return "kinerja cukup";
        } else {
            return "kinerja kurang";
             
       }
    }
}
