import java.util.Scanner;

public class DllMain {
    static Scanner scan = new Scanner(System.in);
    
    public static Mahasiswa06 inputMahasiswa() {
        System.out.print("Nim : ");
        String nim = scan.nextLine();
        System.out.print("Nama : ");
        String nama = scan.nextLine();
        System.out.print("Kelas : ");
        String kelas = scan.nextLine();
        System.out.print("IPK : ");
        double ipk = scan.nextDouble();
        scan.nextLine();
        Mahasiswa06 mhs = new Mahasiswa06(nim, nama, kelas, ipk);
        return mhs;

    }
    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();
        int pilihan;
        do {
            System.out.println("\nMenu Double Linked List Mahasiswa");
            System.out.println("1. Tambah di awal");
            System.out.println("2. Tambah di akhir");
            System.out.println("3. Tambah pada index tertentu");
            System.out.println("4. Tambahkan setelah mahasiswa:");
            System.out.println("5. Hapus di awal");
            System.out.println("6. Hapus di akhir");
            System.out.println("7. Hapus setelah mahasiswa:");
            System.out.println("8. Hapus pada index tertentu");
            System.out.println("9. Tampilkan data");
            System.out.println("10. Melihat data pertama:");
            System.out.println("11. Melihat data terakhir:");
            System.out.println("12. Melihat data pada index tertentu:");
            System.out.println("13. Melihat ukuran list:");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scan.nextInt();
            scan.nextLine();

            switch (pilihan) {
                case 1:
                {
                    Mahasiswa06 mhs = inputMahasiswa();
                    list.addFirst(mhs);
                    break;
                }
                case 2:
                {
                    Mahasiswa06 mhs = inputMahasiswa();
                    list.addLast(mhs);
                    break;
                }
                case 3:
                {
                    Mahasiswa06 mhs = inputMahasiswa();
                    System.out.print("Masukkan index : ");
                    int index = scan.nextInt();

                    list.add(mhs,index);
                    break;
                }
                case 4: 
                {
                Mahasiswa06 mhs = inputMahasiswa();
                System.out.print("Masukkan nama mahasiswa : ");
                String namaMhs = scan.next(); 
                list.insertAfter(namaMhs, mhs);
                }
                case 5:
                {
                   Mahasiswa06 data = list.removeFirst();
                   if (data != null) {
                    System.out.println("data mhs yang dihapus adalah : ");
                    data.tampilInformasi();
                   } else {
                    System.out.println("list kosong");
                   }
                    break;
                }
                case 6:
                {
                    Mahasiswa06 data = list.removeLast();
                    if (data != null) {
                    System.out.println("data mhs yang dihapus adalah : ");
                    data.tampilInformasi();
                   } else {
                    System.out.println("list kosong");
                   }
                    break;
                }
                case 7:
                {
                System.out.print("Masukkan nama mahasiswa : ");
                String namaMhs = scan.next(); 

                list.removeAfter(namaMhs);
                break;
                }
                case 8:
                {
                    System.out.print("Masukkan index : ");
                    int index = scan.nextInt();
                    list.remove(index);
                    break;
                }
                case 9:
                    list.print();
                    break;
                case 10:
                {
                   Mahasiswa06 mhs = list.getFirst();
                   if (mhs != null) {
                       mhs.tampilInformasi();
                    }
                    break;
                }
                case 11:
                {
                   Mahasiswa06 mhs = list.getLast();
                   if (mhs != null) {
                       mhs.tampilInformasi();
                    }
                   break;
                }
                case 12:
                {
                    System.out.print("Masukkan index : ");
                    int index = scan.nextInt();

                   Mahasiswa06 mhs = list.getIndex(index);
                   if (mhs != null) {
                       mhs.tampilInformasi();
                    }
                   break;
                }
                case 13:
                {
                   int size = list.getSize();
                   System.out.println("size list : " + size);
                   break;
                }
                case 0:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        } while (pilihan != 0);

    }

}