public class StackTugasMahasiswa6 {
    Mahasiswa6[] stack;
    int size,top;

    StackTugasMahasiswa6(int size){
        this.size = size;
        stack = new Mahasiswa6[size];
        top = -1;
    }

    boolean isFull(){
        return top == size -1;
    }

    boolean isEmpty(){
        return top == -1;
    }

    void push (Mahasiswa6 mhs){
        if (!isFull()) stack[++top] = mhs;
        else System.out.println("Stack Penuh! Tidak bisa menambahkan tugas lagi.");
    }

    Mahasiswa6 pop(){
        if(top != -1){
            Mahasiswa6 m = stack[top];
            top--;
            return m;
        }else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    Mahasiswa6 peek(){
        if (!isEmpty()) return stack[top];
        else{
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    }
    void print(){
        for (int i = top; i >=0 ; i--) {
            System.out.printf("%s \t %s \t %s",stack[i].nama,stack[i].nim,stack[i].kelas);
            System.out.println();
        }
        System.out.println();
    }    
}
