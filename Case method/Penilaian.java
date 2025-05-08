public class Penilaian {

    public static void bubbleSortByNilaiAkhir(NilaiMahasiswa[] data, int jumlah) {
        for (int i = 0; i < jumlah - 1; i++) {
            for (int j = 0; j < jumlah - i - 1; j++) {
                if (data[j].nilaiAkhir < data[j + 1].nilaiAkhir) {
                    NilaiMahasiswa temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }

    public static int sequentialSearchByNIM(Mahasiswa[] data, String nimCari) {
        for (int i = 0; i < data.length; i++) {
            if (data[i].nim.equals(nimCari)) {
                return i;
            }
        }
        return -1;
    }
}
