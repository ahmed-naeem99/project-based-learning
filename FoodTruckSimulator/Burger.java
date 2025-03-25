// This class is a burger item, a "kind of" FoodItem
public class Burger extends FoodItem {
    private String pattyType;
    private boolean hasCheese;
    private boolean isSpicy;

    // Actual Constructor
    public Burger(String name, double price, int prepTime, int calories, String pattyType, boolean hasCheese, boolean isSpicy) {
        super(name, price, prepTime, calories);
        this.pattyType = pattyType;
        this.hasCheese = hasCheese;
        this.isSpicy = isSpicy;
    }

    // toString Override
    @Override
    public String toString() {
        return super.toString() + " | " + pattyType + (hasCheese ? " | Cheese" : "") + (isSpicy ? " | Spicy" : "");
    }
}