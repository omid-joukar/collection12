import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by KPS on 8/5/2020.
 */
public class Main {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Blue");
        strings.add("Green");
        strings.add("Red");
        List<String> stringList = new ArrayList<>();
        stringList = strings.subList(0,2);
        for (String s : stringList){
            System.out.println(s);
        }
    }
}

