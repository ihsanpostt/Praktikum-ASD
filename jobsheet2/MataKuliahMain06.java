public class MataKuliahMain06 {
    public static void main(String[] args) {
        Matakuliah06 mk1 = new Matakuliah06();
        System.out.println("Informasi Mata Kuliah 1:");
        mk1.tampilInformasi();
        System.out.println();

        Matakuliah06 mk2 = new Matakuliah06("ASD", "Struktur data dan algoritma", 3, 4);
        System.out.println("Informasi Mata Kuliah 2:");
        mk2.tampilInformasi();
        System.out.println();

        mk2.ubahSKS(2);
        mk2.tambahJam(2);
        mk2.kurangiJam(3);

        Matakuliah06 mk3 = new Matakuliah06("AGM", "Agama", 2, 3);
        System.out.println("Informasi Mata Kuliah 3:");
        mk3.tampilInformasi();
        System.out.println();

        mk3.ubahSKS(5);
        mk3.tambahJam(4);
        mk3.kurangiJam(2);

    }
}
