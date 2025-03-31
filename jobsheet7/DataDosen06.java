class DataDosen06 {
    Dosen06[] dataDosen;
    int index;

    public DataDosen06() {
        dataDosen = new Dosen06[5]; // Menentukan ukuran array
        index = 0;
    }

    public void tambah(Dosen06 d) {
        if (index < dataDosen.length) {
            dataDosen[index] = d;
            index++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    public void tampil() {
        for (int i = 0; i < index; i++) {
            dataDosen[i].tampil();
        }
    }

    public int PencarianDataSequential11(int usia) {
        for (int i = 0; i < index; i++) {
            if (dataDosen[i].usia == usia) {
                return i;
            }
        }
        return -1;
    }

    public void SortingASC() {
        for (int i = 0; i < index - 1; i++) {
            for (int j = 0; j < index - i - 1; j++) {
                if (dataDosen[j].usia > dataDosen[j + 1].usia) {
                    Dosen06 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
    }

    public int PencarianDataBinary11(int usia, int left, int right) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (dataDosen[mid].usia == usia) {
                return mid;
            }
            if (dataDosen[mid].usia < usia) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public void tampilDataSearch(int usia, int posisi) {
        if (posisi != -1) {
            System.out.println("Data ditemukan pada indeks: " + posisi);
            dataDosen[posisi].tampil();
        } else {
            System.out.println("Data dengan usia " + usia + " tidak ditemukan.");
        }
    }
}