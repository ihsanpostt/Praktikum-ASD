public class DoubleLinkedList {
    Node06 head;
    Node06 tail;

    public DoubleLinkedList() {
        head = null;
        tail = null;
    }

    boolean isEmpty () {
        return head == null;
    }

    void addFirst(Mahasiswa06 data) {
        Node06 newNode = new Node06(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }

    }

    void addLast(Mahasiswa06 data) {
        Node06 newNode = new Node06(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    void add(Mahasiswa06 data, int index) {
        if (index == 0) {
            addFirst(data);
            return;
        } 
        
        Node06 temp = head;
        for (int i = 0; i < index - 1; i++) {
        if (temp == null) {
        System.out.println("Index melebihi panjang list");
        return;
        }
        temp = temp.next;
        }
        
        if (temp.next == null) {
            addLast(data);
            return;
        }
        
        Node06 newNode = new Node06(data);
        temp.next.prev = newNode;
        newNode.next = temp.next;
        temp.next = newNode;
        newNode.prev = temp;
    }


    void insertAfter(String key, Mahasiswa06 data) {
        Node06 newNode = new Node06(data);
        Node06 temp = head;
        while (temp != null && !temp.data.nim.equals(key)) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Node dengan NIM " + key + " tidak ditemukan");
        }

        if (temp == tail) {
            addLast(data);
        } else {
            newNode.next = temp.next;
            newNode.prev = temp;
            temp.next.prev = newNode;
            temp.next = newNode;
        }
    } 

    Mahasiswa06 removeFirst() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus");
            return null;
        }
        if (head == tail) {
            Mahasiswa06 data = head.data;
            head = tail = null;
            return data;
        } else {
            Mahasiswa06 data = head.data;
            head = head.next;
            head.prev = null;
            return data;
            
        }
    }

    Mahasiswa06 removeLast() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus");
            return null;
        } 
        if (head == tail) {
            Mahasiswa06 data = tail.data;
            head = tail = null;
            return data;
        } else {
            Mahasiswa06 data = tail.data;
            tail = tail.prev;
            tail.next = null;
            return data;
        }
    }

    void removeAfter(String key) {
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus");
            return;
        } 
        Node06 temp = head;

        while (temp != null && !temp.data.nama.equalsIgnoreCase(key)) {
        temp = temp.next;
        }

        if (temp == null || temp.next == null) {
        System.out.println("Node setelah \"" + key + "\" tidak ditemukan atau tidak ada");
        return;
        }

        temp.next.prev = temp;
        temp.next = temp.next.next;
    
    }

    void remove(int index) {
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus");
            return;
        } 

        if (index < 0) {
        System.out.println("Index tidak valid");
        return;
    }

        if (index == 0) {
            removeFirst();
            return;
        } 

        Node06 temp = head;

        for(int i = 0; i < index; i++) {
        if (temp == null) {
            System.out.println("Index melebihi panjang list");
            return;
        }
            temp = temp.next;
        }

        if (temp.next == null) {
            removeLast();
            return;
        }

        temp.next.prev = temp.prev;
        temp.prev.next = temp.next;
    }

    Mahasiswa06 getFirst() {
        if (isEmpty()) {
            return null;
        }
        return head.data;
    }

    Mahasiswa06 getLast() {
        if (isEmpty()) {
            return null;
        }

        return tail.data;
    }

    Mahasiswa06 getIndex(int index) {
        if (isEmpty()) {
            return null;
        }

        Node06 temp = head;

        for(int i = 0; i < index; i++) {
        if (temp == null) {
            System.out.println("Index melebihi panjang list");
            return null;
        }
            temp = temp.next;
        }
        return temp.data;
    }

    int getSize() {
        int counter = 0;

        Node06 temp = head;
        while (temp != null) {
            temp = temp.next;
            counter++;
        }

        return counter;
    }
    

    void print() {
        Node06 temp = head;
        if (isEmpty()) {
            System.out.println("Data kosong!");
            return;
        }
        while (temp != null) {
            temp.data.tampilInformasi();
            temp = temp.next;
        }
    }
}