import java.util.Scanner;

public class PenilaianMain {
    static Scanner input = new Scanner(System.in);

    static Mahasiswa[] mahasiswa = {
        new Mahasiswa("22001", "Ali Rahman", "Informatika"),
        new Mahasiswa("22002", "Budi Santoso", "Informatika"),
        new Mahasiswa("22003", "Citra Dewi", "Sistem Informasi Bisnis")
    };

    static MataKuliah[] mataKuliah = {
        new MataKuliah("MK001", "Struktur Data", 3),
        new MataKuliah("MK002", "Basis Data", 3),
        new MataKuliah("MK003", "Desain Web", 3)
    };
    public static void main(String[] args) {
        for (int i = 0; i < mahasiswa.length; i++) {
            mahasiswa[i].inisialisasiMataKuliah(mataKuliah.length);
            mahasiswa[i].mataKuliah = mataKuliah;

            if (mahasiswa[i].nim.equals("22001")) {
                mahasiswa[i].setNilai(0, 80, 85, 90);
                mahasiswa[i].setNilai(1, 60, 75, 70);
            } else if (mahasiswa[i].nim.equals("22002")) {
                mahasiswa[i].setNilai(0, 75, 70, 80);
            } else if (mahasiswa[i].nim.equals("22003")) {
                mahasiswa[i].setNilai(1, 85, 90, 95);
                mahasiswa[i].setNilai(2, 80, 90, 65);
            }
        }

        int pilihan = -1;
        while (pilihan != 0) {
            System.out.println("=== MENU SISTEM AKADEMIK ===");
            System.out.println("1. Tampilkan Daftar Mahasiswa");
            System.out.println("2. Tampilkan Daftar Mata Kuliah");
            System.out.println("3. Tampilkan Data Nilai Mahasiswa");
            System.out.println("4. Urutkan Mahasiswa Berdasarkan Nilai Akhir");
            System.out.println("5. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("6. Update Nilai UTS Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    tampilkanMahasiswa();
                    break;
                case 2:
                    tampilkanMataKuliah();
                    break;
                case 3:
                    tampilkanDataPenilaian();
                    break;
                case 4:
                    urutkanMahasiswa();
                    break;
                case 5:
                    cariMahasiswa();
                    break;
                case 6:
                    updateNilaiUTS();
                    break;
                case 0:
                    System.out.println("Terimakasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
            System.out.println();
        }
    }

    static void tampilkanMahasiswa() {
        for (Mahasiswa m : mahasiswa) {
            m.tampilkan();
        }
    }

    static void tampilkanMataKuliah() {
        for (MataKuliah mk : mataKuliah) {
            mk.tampilkan();
        }
    }

    static void tampilkanDataPenilaian() {
        System.out.println("Daftar Nilai Mahasiswa:");
        for (Mahasiswa m : mahasiswa) {
            for (int j = 0; j < m.mataKuliah.length; j++) {
                if (m.nilai[j][3] > 0) {
                    System.out.println(m.nama + " | " + m.mataKuliah[j].nama + " | Nilai Akhir: " + m.nilai[j][3]);
                }
            }
        }
    }

    static void urutkanMahasiswa() {
        NilaiMahasiswa[] data = new NilaiMahasiswa[100];
        int count = 0;

        for (Mahasiswa m : mahasiswa) {
            for (int j = 0; j < m.mataKuliah.length; j++) {
                double nilaiAkhir = m.nilai[j][3];
                if (nilaiAkhir > 0) {
                    data[count++] = new NilaiMahasiswa(m.nama, m.mataKuliah[j].nama, nilaiAkhir);
                }
            }
        }

        Penilaian.bubbleSortByNilaiAkhir(data, count);

        for (int i = 0; i < count; i++) {
            System.out.println(data[i].nama + " | " + data[i].mataKuliah + " | Nilai Akhir: " + data[i].nilaiAkhir);
        }
    }

    static void cariMahasiswa() {
        System.out.print("Masukkan NIM: ");
        String cari = input.next();
        int index = Penilaian.sequentialSearchByNIM(mahasiswa, cari);
        if (index != -1) {
            mahasiswa[index].tampilkan();
        } else {
            System.out.println("Mahasiswa tidak ditemukan.");
        }
    }

    static void updateNilaiUTS() {
        System.out.print("Masukkan NIM Mahasiswa: ");
        String nim = input.next();
        System.out.print("Masukkan Kode Mata Kuliah: ");
        String kodeMK = input.next();
        System.out.print("Masukkan Nilai UTS Baru: ");
        double nilaiBaru = input.nextDouble();

        int idxMhs = Penilaian.sequentialSearchByNIM(mahasiswa, nim);
        if (idxMhs != -1) {
            Mahasiswa mhs = mahasiswa[idxMhs];
            for (int i = 0; i < mhs.mataKuliah.length; i++) {
                if (mhs.mataKuliah[i].kode.equals(kodeMK)) {
                    double tugas = mhs.nilai[i][0];
                    double kuis = mhs.nilai[i][1];
                    mhs.setNilai(i, tugas, kuis, nilaiBaru);
                    System.out.println("Nilai UTS berhasil diperbarui.");
                    return;
                }
            }
            System.out.println("Kode mata kuliah tidak ditemukan.");
        } else {
            System.out.println("Mahasiswa tidak ditemukan.");
        }
    }
}
