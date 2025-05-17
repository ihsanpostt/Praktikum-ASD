    public class AntrianLayanan {
        Mahasiswa[] data;
        int front, rear, size, max;

        AntrianLayanan (int max) {
            this.max = max;
            this.data = new Mahasiswa[max];
            front = 0;
            size = 0;
            rear = -1;
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
                System.out.println("Queue berhasil dikosongkan");
            } else {
                System.out.println("Queue masih kosong");
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

        Mahasiswa layaniMahasiswa() {
            if (isEmpty()) {
                System.out.println("antrian kosong");
                return null;
            } 

            Mahasiswa mhs = data[front];
            front = (front+1) % max;
            size--;
            return mhs;
        }

        void lihatTerdepan() {
            if (isEmpty()) {
                System.out.println("antrian kosong");
            } else {
                System.out.println("Mahasiswa terdepan : ");
                System.out.println("NIM - NAMA - PRODI - KELAS");
                data[front].tampilkanData();
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

        int getJumlahAntrian() {
            return size;
        }
    }