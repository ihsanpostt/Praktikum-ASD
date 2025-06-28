package Jobsheet14;
public class BinaryTreeArray06 {
    Mahasiswa06[] dataMhs;
    int idxLast;

    public BinaryTreeArray06() {
        this.dataMhs = new Mahasiswa06[10];
    }

    void populateData (Mahasiswa06 dataMhs[], int idxLast) {
        this.dataMhs = dataMhs;
        this.idxLast = idxLast;
    }

    void addData (Mahasiswa06 mhs) {
        if (dataMhs[0] == null) {
            this.dataMhs[0] = mhs;
            idxLast++;
            return;
        }

        int idx = 0;
        while (idx < dataMhs.length && dataMhs[idx] != null) {
            if (mhs.ipk < dataMhs[idx].ipk) {
                idx = 2 * idx + 1;
            } else {
                idx = 2 * idx + 2;
            }
        }

        if (idx >= dataMhs.length) {
            System.out.println("Array penuh, tidak bisa menambahkan data.");
            return;
        }
        

        dataMhs[idx] = mhs;
        idxLast++;
    }


    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMhs[idxStart] != null) {
                traverseInOrder(2*idxStart+1);
                dataMhs[idxStart].tampilInformasi();
                traverseInOrder(2*idxStart+2);
            }
        }
    }

    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMhs[idxStart] != null) {
                dataMhs[idxStart].tampilInformasi();
                traversePreOrder(2*idxStart+1);
                traversePreOrder(2*idxStart+2);
            }
        }
    }
}