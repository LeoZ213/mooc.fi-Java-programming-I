
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;
    private int count = 0;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
        this.count = 0;
    }

    public void add(String element) {
        this.elements.add(element);
        this.count = this.count + 1;
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    @Override
    public String toString() {
        if (this.elements.isEmpty()) {
            return ("The collection " + this.name + " is empty.");
        }
        if (this.elements.size() == 1) {
            return ("The collection " + this.name + " has 1 element:") + "\n" + this.elements.get(0);
        }
        String printOutput = "The collection " + this.name + " has " + this.count + " elements:" + "\n";
        String elementsOnList = "";
        for (String i : this.elements) {
            elementsOnList = elementsOnList + i + "\n";
        }
        return printOutput + elementsOnList;
    }
}
