class AntrianKrs {

       Mahasiswa[] data;
        int front, rear, size, max, slot, mhsDilayani;

        AntrianKrs () {
            max = 10;
            this.data = new Mahasiswa[max];
            front = 0;
            rear = -1;
            size = 0;
            slot = 2;
            mhsDilayani = 0;
        }

        boolean isEmpty() {
            return size == 0;
        }

        boolean isFull() {
            return size == max;
        }

        void clear() {
            if (!isEmpty()) {
                front = -1;
                rear = -1;
                size = 0;
                System.out.println("Antrian berhasil dikosongkan");
            } else {
                System.out.println("Antrian masih kosong");
            }
        }

        void tambahAntrian (Mahasiswa mhs) {
            if (isFull()) {
                System.out.println("Antrian penuh, tidak dapat menambah mahasiswa");
                return;
            } 
                rear = (rear + 1) % max;
                data[rear] = mhs;
                size++;
                System.out.println(mhs.nama + " berhasil masuk ke antrian");

        }
    
        Mahasiswa[] memanggilAntrian() {
            if (isEmpty()) {
                System.out.println("antrian kosong");
                return null;
            } 

            Mahasiswa mhs[] = new Mahasiswa[2];
            slot = (this.size == 1) ? 1 : 2;

            for (int i = 0; i < slot; i++) {
                mhs[i] = data[front];
                front = (front+1) % max;
                size--;
                mhsDilayani++;
            }
            return mhs;
        }

        void tampilkanSemua() {
            if (isEmpty()) {
                System.out.println("Antrian Kosong");
                return;        
            } 
            System.out.println("Daftar Mahasiswa dalam Antrian");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            for (int i = 0; i < size; i++) {
                int index = (front + i) % max;
                System.out.print((i+1) + ". ");
                data[index].tampilkanData();
            }
        }

        void lihatDuaTerdepan() {
            if (isEmpty()) {
                System.out.println("antrian kosong");
            } else {
            for (int i = 0; i < slot; i++) {
                int index = (front + i) % max;
                System.out.println("Mahasiswa terdepan " + (i+1) + " : " );
                System.out.println("NIM - NAMA - PRODI - KELAS");
                data[index].tampilkanData();
            }
            }
        }

            void lihatAkhir() {
            if (isEmpty()) {
                System.out.println("antrian kosong");
            } else {
                System.out.println("Mahasiswa terakhir : ");
                System.out.println("NIM - NAMA - PRODI - KELAS");
                data[rear].tampilkanData();
            }
        }

        int getJumlahAntrian() {
            return size;
        }

        int getTotalProsesKRS() {
            return mhsDilayani + size;
        }

        int getTotalMhsBelumDilayani() {
            return 30 - getTotalProsesKRS();
        }
}