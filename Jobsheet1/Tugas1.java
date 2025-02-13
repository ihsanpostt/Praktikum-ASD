import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        // Array kode plat nomor
        char[] KODE = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};

        // Array nama kota
        String[] KOTA = {
            "BANTEN", "JAKARTA", "BANDUNG", "CIREBON", "BOGOR",
            "PEKALONGAN", "SEMARANG", "SURABAYA", "MALANG", "TEGAL"
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kode plat nomor: ");
        char inputKode = scanner.next().toUpperCase().charAt(0); // Ambil huruf pertama dan ubah jadi uppercase

        boolean ditemukan = false;
        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i] == inputKode) {
                System.out.println("Kota: " + KOTA[i]);
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Kode plat tidak ditemukan.");
        }

        scanner.close();
    }
}
