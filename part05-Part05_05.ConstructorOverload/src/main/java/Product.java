
public class Product {

    private String name;
    private String location;
    private int weight;

    public Product(String name, String location, int weight) {
        this.name = name;
        this.location = location;
        this.weight = weight;
    }

    public Product(String names) {
        name = names;
        weight = 1;
        location = ("shelf");
    }

    public Product(String names, String locations) {
        name = names;
        location = locations;
        weight = 1;
    }

    public Product(String names, int weights) {
        name = names;
        weight = weights;
        location = ("shelf");
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.weight + " kg) can be found from the " + this.location;
    }
}
