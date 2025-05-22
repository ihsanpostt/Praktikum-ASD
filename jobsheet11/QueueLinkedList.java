    public class QueueLinkedList {
        NodeMahasiswa06 head;
        int capacity;
        int slot;

        QueueLinkedList(int capacity) {
        this.capacity = capacity;
        slot = capacity;
        }

        boolean isEmpty () {
            return head == null;
        }

        void print() {
            if (!isEmpty()) {
            NodeMahasiswa06 tmp = head;
            System.out.println("Isi linked list");
            while (tmp != null) {
                tmp.data.tampilInformasi();
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked list kosong");
        }

        }

        void addQueue(Mahasiswa06 input) {
            if (isEmpty()) {
                NodeMahasiswa06 newQueue = new NodeMahasiswa06(input, null);
                head = newQueue; 
            } else {
                NodeMahasiswa06 newQueue = new NodeMahasiswa06(input, null);
                NodeMahasiswa06 tmp = head;
                while (tmp.next != null) {
                    tmp = tmp.next;
                }
                tmp.next = newQueue;
            }
            slot--;
        }

        Mahasiswa06 getQueue() {
            if (isEmpty()) {
                System.out.println("Antrian kosong");
                return null;
            } else {
                NodeMahasiswa06 mhs = head;
                head = head.next;
                slot++;
                return mhs.data;
            }
        }

        boolean isFull () {
            return slot == 0;
        } 

        void clearQueue() {
            head = null;
        }

        int countMhs() {
            return capacity - slot;
        }

        Mahasiswa06 firstQueue() {
            return head.data;
        }

        Mahasiswa06 lastQueue() {
            NodeMahasiswa06 tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }

            return tmp.data;
        }

    }