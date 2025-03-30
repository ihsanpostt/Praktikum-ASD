import java.util.Scanner;

public class MahasiswaDemo06 {
    public static void main(String[] args) {
        MahasiswaBerprestasi06 list = new MahasiswaBerprestasi06();
        Scanner sc = new Scanner(System.in);
        int jumlahMhs = 5;

        for (int i = 0; i < jumlahMhs; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            
            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine(); // Membersihkan buffer
            
            System.out.println("------------------------------------");
            
            Mahasiswa06 mhs = new Mahasiswa06(nim, nama, kelas, ipk);
            list.tambah(mhs);
        }

        System.out.println("Data mahasiswa sebelum sorting:");
        list.tampil();

        // Melakukan Pencarian Data Sequential
        System.out.println("------------------------------------");
        System.out.println("Pencarian Data");
        System.out.println("------------------------------------");
        
        System.out.print("Masukkan IPK mahasiswa yang dicari: ");
        double cari = sc.nextDouble();
        
        System.out.println("Menggunakan sequential searching");
        double posisi = list.sequentialSearching(cari);
        int pss = (int) posisi;
        
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);
    }
}