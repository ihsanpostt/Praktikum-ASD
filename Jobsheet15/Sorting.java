import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
    public static void main(String[] args) {
        ArrayList<String> daftarSiswa = new ArrayList<>();
        daftarSiswa.add("zainab");
        daftarSiswa.add("andi");
        daftarSiswa.add("rara");
        Collections.sort(daftarSiswa);

        System.out.println(daftarSiswa);
    }
}