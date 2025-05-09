public class StackSurat6 {
    Surat6[] stack;
    int size;
    int top;

    StackSurat6(int size) {
        this.size = size;
        stack = new Surat6[size];
        top = -1;
    }

    boolean isFull() {
        return this.top == this.size - 1;
    }

    boolean isEmpty() {
        return this.top == -1;
    }

    void push(Surat6 s) {
        if (!isFull()) {
            top++;
            stack[top] = s;
        } else {
            System.out.println("stack penuh!");
        }
    }

    Surat6 pop() {
        if(!isEmpty()) {
           Surat6 s = stack[top];
            top--;
            return s; 
        } else {
            System.out.println("stack kosong!");
            return null;
        }
    } 

    Surat6 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    int cariSurat(String target) {
        for(int i = 0; i <= top; i++) {
            if (stack[i].namaMhs.equalsIgnoreCase(target)) {
                return i;
            }
        }
        return -1;
    }

    void tampilkanSurat(int i) {
        System.out.println("Surat milik " + stack[i].namaMhs + " ditemukan pada tumpukan ke " + (top+1-i));
    }
}