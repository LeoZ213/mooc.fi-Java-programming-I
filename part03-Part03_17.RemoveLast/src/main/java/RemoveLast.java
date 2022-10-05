
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        // Try your method in here
        ArrayList<String> word = new ArrayList<>();
        word.add("This");
        word.add("is");
        word.add("my");
        word.add("world");
        removeLast(word);
        System.out.println(word);
                
        
    }
    public static void removeLast(ArrayList<String> strings) {
        if (strings.size() == 0) {
        return;
    }

    strings.remove(strings.size() - 1);
}

    

}
