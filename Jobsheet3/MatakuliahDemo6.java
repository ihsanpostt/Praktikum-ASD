import java.util.Scanner;

public class MatakuliahDemo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Mahasiswa: ");
        int jmlMhs = Integer.parseInt(sc.nextLine());
        Matakuliah6[] arrayOfMatakuliah = new Matakuliah6[jmlMhs];
        for (int i = 0; i < jmlMhs; i++) {
            System.out.println("Masukkan Data Matakuliah ke-"+(i+1));
            arrayOfMatakuliah[i] = new Matakuliah6(null, null, 0, 0);
            arrayOfMatakuliah[i].tambahData();
        }
        for (int i = 0; i < jmlMhs; i++) {
            arrayOfMatakuliah[i].tampilkanData(i);
        }
    }    
}