import java.util.Scanner;

public class MahasiswaDemo6 {
    public static void main(String[] args) {
        StackTugasMahasiswa6 stack = new StackTugasMahasiswa6(5);
        Scanner scan = new Scanner(System.in);
        int pilih;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.println("5. Melihat Tugas Terbawah");
             System.out.println("6. Jumlah tugas yang dikumpulkan");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = scan.nextLine();
                    System.out.print("NIM: ");
                    String nim = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    Mahasiswa6 mhs = new Mahasiswa6(nama,nim,kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n",mhs.nama);
                    break;
                case 2:
                    Mahasiswa6 dinilai = stack.pop();
                        if (dinilai !=null) {
                        System.out.println("Menilai tugas dari " + dinilai.nama);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = scan.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai tugas %s adalah%d\n",dinilai.nama,nilai);
                        String biner = stack.konversiDesimalKeBiner(nilai);
                        System.out.println("Nilai Biner Tugas: " + biner);
                    }
                    break;
                case 3:
                    Mahasiswa6 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.nama);
                    }
                    break;
                case 4:
                    System.out.println("Daftar semua tugas");
                    System.out.println("Nama \t NIM \t Kelas");
                    stack.print();
                    break;
                case 5:
                    Mahasiswa6 lihatTerbawah = stack.peekBottom();
                    if (lihatTerbawah != null) {
                        System.out.println("Tugas pertama dikumpulkan oleh " + lihatTerbawah.nama);
                    }
                    break;
                case 6:
                    int jumlahTugas = stack.jumlahTugas();
                    System.out.println("jumlah tugas yang telah dikumpulkan : " + jumlahTugas);
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        } while (pilih > 0 && pilih < 7);
    }
}