package generics;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
//        list.add("Ok");
//        list.add(5);
//        list.add(new StringBuilder("efnakhiu"));
//        list.add(new Car());

        list.add("HI");
        list.add("BYE");
        list.add("MY");
        list.add("YOUR");

        for(Object o : list) {
            System.out.println(o + "length" + ((String)o).length());
        }
    }
}
class Car{}
