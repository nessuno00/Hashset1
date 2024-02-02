
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> A1 = new HashSet<>();

        A1.add("Pika");
        A1.add("Penka");
        A1.add("Penna");
        System.out.println(A1);

        if(A1.contains("Penna")) {

            System.out.println("La stringa è presente all'interno del hashset");

        }else {

            System.out.println("La stringa non è presente");

        }
HashSet<Integer> A2 = new HashSet<>();

        A2.add(12);
        A2.add(34);
        A2.add(55);
        System.out.println(A2);
    }
}