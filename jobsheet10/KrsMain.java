import java.util.Scanner;

public class KrsMain {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKrs antrian = new AntrianKrs();
        int pilihan;
 do {
            System.out.println("\n=== Menu Antrian Layanan Akademik ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Layani Mahasiswa");
            System.out.println("3. Lihat Mahasiswa Terdepan");
            System.out.println("4. Lihat Semua Antrian");
            System.out.println("5. Jumlah Mahasiswa dalam Antrian");
            System.out.println("6. Jumlah Mahasiswa yang Sudah Diproses");
            System.out.println("7. Jumlah Mahasiswa yang Belum Diproses");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt(); sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();

                    Mahasiswa mhs = new Mahasiswa(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;

                case 2:
                    Mahasiswa dilayani[] = antrian.memanggilAntrian();
                    if (dilayani != null) {
                    System.out.println("Melayani mahasiswa: ");
                    dilayani[0].tampilkanData();

                    if (dilayani[1] != null) {
                        dilayani[1].tampilkanData();
                    }
                    }
                    break;
                case 3:
                    antrian.lihatDuaTerdepan();
                    break;
                case 4:
                    antrian.tampilkanSemua();
                    break;
                case 5:
                    System.out.println("Jumlah dalam antrian: " + antrian.getJumlahAntrian());
                    break;
                case 6:
                    System.out.println("Mahasiswa yang sudah dalam proses : " + antrian.getTotalProsesKRS());
                    break;
                case 7:
                    System.out.println("Mahasiswa yang belum diproses : " + antrian.getTotalMhsBelumDilayani());
                case 0:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
        sc.close();
    }
}