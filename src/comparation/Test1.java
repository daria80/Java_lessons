package comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Smirnova");
        list.add("Darya");
        list.add("Mikhailovna");
        System.out.println("Before sorting");
        System.out.println(list);
        System.out.println("After sorting");
        Collections.sort(list);
        System.out.println(list);
    }
}
