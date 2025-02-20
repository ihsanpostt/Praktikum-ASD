public class DosenMain06 {

    public static void main(String[] args) {
        Dosen06 dosen1 = new Dosen06();
        dosen1.tampilInformasi();

        Dosen06 dosen2 = new Dosen06("12839123", "VIT ZURAIDA", true, 2010, "Basis data");
        dosen2.tampilInformasi();

        dosen2.setStatusAktif(false);
        dosen2.ubahKeahlian("Data Science");
        dosen2.tampilInformasi();

        System.out.println("Masa kerja dosen kedua: " + dosen2.hitungMasaKerja(2024) + " tahun");

        Dosen06 dosen3 = new Dosen06("192932", "wilda imama", true, 2005, "Rekayasa perangkat lunak");
        dosen3.tampilInformasi();
        
        dosen3.setStatusAktif(false);
        dosen3.ubahKeahlian("Agama");
        dosen3.tampilInformasi();

        System.out.println("Masa kerja dosen kedua: " + dosen3.hitungMasaKerja(2024) + " tahun");

         Dosen06 dosen4 = new Dosen06("823745", "Yan watequlis", true, 2008, "critical thingking");
        dosen4.tampilInformasi();
        
        dosen4.setStatusAktif(false);
        dosen4.ubahKeahlian("Dasar pemrograman");
        dosen4.tampilInformasi();

        System.out.println("Masa kerja dosen kedua: " + dosen4.hitungMasaKerja(2024) + " tahun");
    }
}

