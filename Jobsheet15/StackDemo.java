import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {
        Book book1 = new Book("123", "Dasar Pemrograman");
        Book book2 = new Book("345", "Pemrograman Berbasis Objek");
        Book book3 = new Book("567", "Pemrograman Web");

        Stack<Book> books = new Stack<>();
        books.push(book1);
        books.push(book2);
        books.push(book3);

        Book temp = books.peek();
        if (temp != null) {
            System.out.println(temp.toString());
        }
        Book temp2 = books.pop();
        if (temp2 != null) {
            System.out.println(temp2.toString());
        }

        for (Book book : books) {
            System.out.println(book.toString());
        }
        System.out.println("Lakukan pencarian buku: " + books.search(book1));

    
    }
}