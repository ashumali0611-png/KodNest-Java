
import java.util.*;

public class ArrayDemo {

    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        name.add("Anu");
        name.add("Banu");
        System.out.println(name);
        name.add(1, "Ravi");
        System.out.println(name);
        name.set(1, "Ravi B S");
        System.out.println(name);
        name.remove(0);
        System.out.println(name);
    }
}
