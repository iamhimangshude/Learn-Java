package DataStructures;

import java.util.ArrayList;
import java.util.List;

public class GuestList {
    static void main() {
        ArrayList<String> guestList = new ArrayList<>(List.of("Ann", "John", "Steve", "Sova", "Reyna", "James", "Helios"));
//        guestList.removeIf(name -> name.startsWith("j") || name.startsWith("J")); // more leaner approach!
        System.out.println("GuestList (before filter)=" + guestList);
        var iterator = guestList.listIterator();
        while(iterator.hasNext()){
            String name = iterator.next();
            if (name.startsWith("J")||name.startsWith("j")){
                iterator.remove();
            }
        }
        System.out.println("GuestList (after filter)=" + guestList);
    }
}
