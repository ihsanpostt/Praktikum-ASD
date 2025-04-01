public class DataDosen06 {
    Dosen06 [] dataDosen = new Dosen06[10];
    int idx;

    void tambah(Dosen06 dsn){
        if (idx<dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        }else System.out.println("Data sudah penuh");
    }
    void tampil(){
        for (Dosen06 dosen : dataDosen) {
            dosen.tampil();
            System.out.println("--------------------------------");
        }
    }

    void SortingASC(){
        for (int i = 0; i < dataDosen.length-1; i++) {
            for (int j = 1; j < dataDosen.length-i; j++) {
                if (dataDosen[j].usia<dataDosen[j-1].usia) {
                    Dosen06 tmp = dataDosen[j];
                    dataDosen[j] = dataDosen[j-1];
                    dataDosen[j-1] = tmp;
                }
            }
        }
    }

    void sortingDSC(){
        for (int i = 1; i < dataDosen.length; i++) {
            Dosen06 temp = dataDosen[i];
            int j = i;
            while (j>0 && temp.usia>dataDosen[j-1].usia) {
                dataDosen[j] = dataDosen[j-1];
                j--;
            }
            dataDosen[j] = temp;
        }
    }

    int PencarianDataSequential06(double cari){
        int count = 0;
        int posisi = -1;
        for (int i = 0; i < dataDosen.length; i++) {
            if (dataDosen[i].usia == cari) {
                posisi = i;
                count++;
            }
        }
        if (count > 1) posisi = -2;
        return posisi;
    }
    int PencarianDataBinary06(int cari,int left,int right){
        int mid;
        if (left > right) return -1;
        mid = (left + right) / 2;
        int leftConquer = PencarianDataBinary06(cari, left, mid-1);
        int rightConquer = PencarianDataBinary06(cari, mid+1, right);
        if (cari == dataDosen[mid].usia){
            if (cari == dataDosen[mid+1].usia|| cari == dataDosen[mid-1].usia) {
                return -2;
            }
            return mid;
        }
        if (cari < dataDosen[mid].usia) return leftConquer;
        else return rightConquer;
    }
    void tampilDataSearch(int x, int pos){
        if (pos == -1)
            System.out.println("Data dosen dengan usia " + x + " tidak ditemukan");
        else if (pos == -2)
            System.out.println("Data Dosen Muncul lebih dari 1 kali");
        else {
            System.out.println("Data Dosen dengan Usia : " + x + " ditemukan pada indeks " + pos);
            dataDosen[pos].tampil();
        }
    }
}