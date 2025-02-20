public class MataKuliahMain06 {
    public static void main(String[] args) {
        MataKuliah06 mk1 = new MataKuliah06();
        System.out.println("Informasi Mata Kuliah 1:");
        mk1.tampilInformasi();
        System.out.println();

        MataKuliah06 mk2 = new MataKuliah06("ASD", "Struktur data dan algoritma", 3, 4);
        System.out.println("Informasi Mata Kuliah 2:");
        mk2.tampilInformasi();
        System.out.println();

        mk2.ubahSKS(2);
        mk2.tambahJam(2);
        mk2.kurangiJam(3);

        MataKuliah06 mk3 = new MataKuliah06("AGM", "Agama", 2, 3);
        System.out.println("Informasi Mata Kuliah 3:");
        mk3.tampilInformasi();
        System.out.println();

        mk3.ubahSKS(5);
        mk3.tambahJam(4);
        mk3.kurangiJam(2);

    }
}
