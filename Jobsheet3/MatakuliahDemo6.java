public class MatakuliahDemo6 {
    public static void main(String[] args) {
        Matakuliah6[] arrayOfMatakuliah = new Matakuliah6[3];
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i] = new Matakuliah6("", "", 0, 0);
            arrayOfMatakuliah[i].tambahData();
        }
        
        for (int i = 0; i < 3; i++) {
            arrayOfMatakuliah[i].tampilkanData(i);
        }
    }
}
