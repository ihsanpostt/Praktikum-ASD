public class SllMain06 {
    public static void main(String[] args) {
        SingleLinkedList sll = new SingleLinkedList();
        Mahasiswa06 mhs1 = new Mahasiswa06("Alya", "123456", "TI-1A", 3.75);
        Mahasiswa06 mhs2 = new Mahasiswa06("Bagas", "123457", "TI-1B", 3.40);
        Mahasiswa06 mhs3 = new Mahasiswa06("Citra", "123458", "TI-1A", 3.90);
        Mahasiswa06 mhs4 = new Mahasiswa06("Dimas", "123459", "TI-1C", 3.20);

        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Dimas", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();

        System.out.println("data index 1 : ");
        sll.getData(1);

        System.out.println("data mahasiswa an Dimas berada pada index : " + sll.indexOf("Dimas"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();

    }
}