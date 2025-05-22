import java.util.Scanner;

public class QueueMahasiswaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas antrian: ");
        int kapasitas = sc.nextInt();

        QueueLinkedList queue = new QueueLinkedList(kapasitas);

        int pilihan;
        do {
            System.out.println("\n=== Menu Antrian Mahasiswa ===");
            System.out.println("1. Tambah antrian");
            System.out.println("2. Panggil antrian");
            System.out.println("3. Cek antrian kosong");
            System.out.println("4. Cek antrian penuh");
            System.out.println("5. Tampilkan antrian terdepan");
            System.out.println("6. Tampilkan antrian terakhir");
            System.out.println("7. Tampilkan semua antrian");
            System.out.println("8. Tampilkan jumlah mahasiswa dalam antrian");
            System.out.println("9. Kosongkan antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    if (!queue.isFull()) {
                        System.out.print("Nama  : ");
                        String nama = sc.nextLine();
                        System.out.print("NIM   : ");
                        String nim = sc.nextLine();
                        System.out.print("Kelas : ");
                        String kelas = sc.nextLine();
                        System.out.print("IPK   : ");
                        double ipk = sc.nextDouble();
                        sc.nextLine();

                        Mahasiswa06 mhs = new Mahasiswa06(nama, nim, kelas, ipk);
                        queue.addQueue(mhs);
                        System.out.println("Mahasiswa berhasil ditambahkan ke antrian.");
                    } else {
                        System.out.println("Antrian penuh!");
                    }
                    break;
                case 2:
                    Mahasiswa06 dipanggil = queue.getQueue();
                    if (dipanggil != null) {
                        System.out.println("Memanggil mahasiswa:");
                        dipanggil.tampilInformasi();
                    }
                    break;
                case 3:
                    System.out.println(queue.isEmpty() ? "Antrian kosong." : "Antrian tidak kosong.");
                    break;
                case 4:
                    System.out.println(queue.isFull() ? "Antrian penuh." : "Antrian belum penuh.");
                    break;
                case 5:
                    if (!queue.isEmpty()) {
                        System.out.println("Mahasiswa di antrian terdepan:");
                        queue.firstQueue().tampilInformasi();
                    } else {
                        System.out.println("Antrian kosong.");
                    }
                    break;
                case 6:
                    if (!queue.isEmpty()) {
                        System.out.println("Mahasiswa di antrian terakhir:");
                        queue.lastQueue().tampilInformasi();
                    } else {
                        System.out.println("Antrian kosong.");
                    }
                    break;
                case 7:
                    queue.print();
                    break;
                case 8:
                    System.out.println("Jumlah mahasiswa dalam antrian: " + queue.countMhs());
                    break;
                case 9:
                    queue.clearQueue();
                    System.out.println("Antrian telah dikosongkan.");
                    break;
                case 0:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
    }
}