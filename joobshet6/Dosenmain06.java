import java.util.Scanner;

public class Dosenmain06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen06 listDosen = new DataDosen06();

        while (true) {
            System.out.println("======== Menu ========");
            System.out.println("1. Tambahkan Data Dosen");
            System.out.println("2. Tampilkan Data Dosen");
            System.out.println("3. Urutkan Data Bubble Sort (ASC)");
            System.out.println("4. Urutkan Data Selection Sort (DSC)");
            System.out.println("5. Urutkan Data Insertion Sort (DSC)");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println();
                    for (int i = 0; i < 10; i++) {
                        System.out.print("Kode : ");
                        String kode = sc.nextLine();
                        System.out.print("Nama : ");
                        String nama = sc.nextLine();
                        System.out.print("Jenis Kelamin (true = Laki-laki, false = Perempuan) : ");
                        boolean jk = sc.nextBoolean();
                        System.out.print("Usia : ");
                        int usia = sc.nextInt();
                        sc.nextLine();
                        System.out.println();
                        Dosen06 dsn = new Dosen06(kode, nama, jk, usia);
                        listDosen.tambah(dsn);
                    }
                    break;
                case 2:
                    System.out.println();
                    System.out.println("=== Data Keseluruhan ===");
                    listDosen.tampil();
                    break;
                case 3:
                    System.out.println();
                    System.out.println("Data telah diurutkan (ASC - Bubble Sort).");
                    listDosen.sortingASC();
                    listDosen.tampil();
                    break;
                case 4:
                    System.out.println();
                    System.out.println("Data telah diurutkan (DSC - Selection Sort).");
                    listDosen.sortingDSC();
                    listDosen.tampil();
                    break;
                case 5:
                    System.out.println();
                    System.out.println("Data telah diurutkan (DSC - Insertion Sort).");
                    listDosen.insertionSort();
                    listDosen.tampil();
                    break;
                case 0:
                    System.out.println("Keluar dari program.");
                    sc.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
