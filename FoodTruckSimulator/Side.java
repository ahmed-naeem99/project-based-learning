// This class is a side item, a "kind of" FoodItem
public class Side extends FoodItem {
    private boolean isVegan;
    private String portionSize;

    // Actual Constructor
    public Side(String name, double price, int prepTime, int calories, 
                boolean isVegan, String portionSize) {
        super(name, price, prepTime, calories);
        this.isVegan = isVegan;
        this.portionSize = portionSize;
    }

    // toString Override
    @Override
    public String toString() {
        return super.toString() + " | " + (isVegan ? "Vegan" : "Non-Vegan") +
               " | " + portionSize;
    }
}
