package Arrays;
import java.util.ArrayList;
public class ArrayLists {
    public static ArrayList<String> createList() {
        
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Donkey");
        animals.add("pangolin");
        animals.add("blobfish");
        
        return animals;
    }
    public static void showIndex(ArrayList<String> animals)  {
        System.out.println("First element: " + animals.get(0));
        System.out.println("Second element: " + animals.get(1));
        System.out.println("Last element: " + animals.get(animals.size() - 1));
    }
    public static int findINdex(ArrayList<String> list, String target) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(target)) {
                return i;
            }
        }

        return -1;
    }
    
    
    
    
}


