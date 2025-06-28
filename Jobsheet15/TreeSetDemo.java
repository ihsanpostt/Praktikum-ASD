import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> fruits = new TreeSet<>();

        fruits.add("mangga");
        fruits.add("apel");
        fruits.add("jeruk");
        fruits.add("jambu");
        fruits.add("durian");

        for (String temp : fruits) {
            System.out.println(temp);
        }

        System.out.println("First: " + fruits.first());
        System.out.println("Last: " + fruits.last());

        fruits.remove("Jeruk");
        System.out.println("setelah remove " + fruits);

        fruits.pollFirst(); 
        System.out.println("setelah poll first " + fruits);
        fruits.pollLast(); 
        System.out.println("setelah poll last" + fruits);
    }
}