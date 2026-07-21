import java.util.ArrayList;
import java.util.List;

public class collection {
    public static void main(String[] args) {
        List<Integer> names = new ArrayList<>();

        names.add(93);
        names.add(45);
        names.add(69);

        System.out.println(names);
        
        for (Integer i : names) {
            System.out.println(i);
        }

        
    }
}