public class Dosen06 {
    String kode, nama;
    Boolean jenisKelamin;
    int usia;
    Dosen06(String kd,String name, Boolean jk,int age){
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }

    void tampil(){
        System.out.println("Kode Dosen    :"+kode);
        System.out.println("Nama          :"+nama);
        System.out.println("Jenis Kelamin :"+(jenisKelamin?"Perempuan":"Laki-laki"));
        System.out.println("Usia          :"+usia);
    }
}