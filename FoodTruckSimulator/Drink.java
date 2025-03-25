// This class is a drink item, a "kind of" FoodItem
public class Drink extends FoodItem {
    private String flavour;
    private String size;

    // Actual Constructor
    public Drink(String name, double price, int prepTime, int calories, String flavour, String size) {
        super(name, price, prepTime, calories);
        this.flavour = flavour;
        this.size = size;
    }

    // toString Override
    @Override
    public String toString() {
        return super.toString() + " | " + flavour + " | " + size;
    }
}
