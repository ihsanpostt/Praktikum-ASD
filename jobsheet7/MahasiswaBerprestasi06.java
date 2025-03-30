public class MahasiswaBerprestasi06 {
    int jumlahMhs = 5;
    Mahasiswa06[] listMhs = new Mahasiswa06[jumlahMhs];
    MahasiswaBerprestasi06(){}
    MahasiswaBerprestasi06(int jumlahMhs){
        this.jumlahMhs = jumlahMhs;
        listMhs = new Mahasiswa06[jumlahMhs];
    }
    int idx;

    void tambah(Mahasiswa06 mhs){
        if (idx<listMhs.length) {
            listMhs[idx] = mhs;
            idx++;
        }else System.out.println("Data sudah penuh");
    }

    void tampil(){
        for (Mahasiswa06 m : listMhs) {
            m.tampilkanInformasi();
            System.out.println("--------------------------------");
        }
    }
    
    void bubbleSort(){
        for (int i = 0; i < listMhs.length-1; i++) {
            for (int j = 1; j < listMhs.length-i; j++) {
                if (listMhs[j].ipk>listMhs[j-1].ipk) {
                    Mahasiswa06 tmp = listMhs[j];
                    listMhs[j] = listMhs[j-1];
                    listMhs[j-1] = tmp;
                }
            }
        }
    }

    void selectionSort(){
        for (int i = 0; i < listMhs.length-1; i++) {
            int idxMin = i;
            for (int j = i+1; j < listMhs.length; j++) {
                if (listMhs[j].ipk<listMhs[idxMin].ipk) {
                    idxMin = j;
                }
            }
            Mahasiswa06 tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }

    void insertionSort(){
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa06 temp = listMhs[i];
            int j = i;
            while (j>0 && temp.ipk>listMhs[j-1].ipk) {
                listMhs[j] = listMhs[j-1];
                j--;
            }
            listMhs[j] = temp;
        }
    }
    int sequentialSearch(double cari){
        int posisi = -1;
        for (int j = 0; j < listMhs.length; j++) {
            if (listMhs[j].ipk == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    void tampilPosisi(double x, int pos){
        if (pos != -1) {
            System.out.println("Data mahasiswa dengan IPK : " + x + " ditemukan pada indeks " + pos);
        }else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }
    void tampilDataSearch(double x, int pos){
        if (pos != -1) {
            System.out.println("NIM\t : " + listMhs[pos].nim);
            System.out.println("Nama\t : " + listMhs[pos].nama);
            System.out.println("Kelas\t : " + listMhs[pos].kelas);
            System.out.println("IPK\t : " + x);
        }else {
            System.out.println("Data mahasiswa dengan IPK " + x + " tidak ditemukan");
        }
    }
    int findBinarySearch(double cari, int left, int right){
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari == listMhs[mid].ipk) {
                return (mid);
            }else if (cari > listMhs[mid].ipk) {
                return findBinarySearch(cari, left, mid - 1);
            }else {
                return findBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }
}