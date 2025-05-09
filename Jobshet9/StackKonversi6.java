public class StackKonversi6 {
    int[] tumpukanBiner;
    int size;
    int top;

    public StackKonversi6() {
        this.size = 32;
        tumpukanBiner = new int[size];
        top = -1;
    }

    boolean isFull() {
        return this.top == this.size - 1;
    }

    boolean isEmpty() {
        return this.top == -1;
    }

    void push(int biner) {
        if (!isFull()) {
            top++;
            tumpukanBiner[top] = biner;
        } else {
            System.out.println("stack penuh! tidak bisa menambahkan tugas lagi!");
        }
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("stack kosong!");
            return -1;
        } else {
            int biner = tumpukanBiner[top];
             top--;
             return biner; 
        }
    } 

    int peek() {
        if (!isEmpty()) {
            return tumpukanBiner[top];
        } else {
            return -1;
        }
    }
}