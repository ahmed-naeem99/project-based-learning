// Represents a generic food item in the truck's menu
public abstract class FoodItem implements Comparable<FoodItem> {
    // Instance variables
    private String name;
    private double price;
    private int prepTime;
    private int calories;

    // Constructor
    public FoodItem(String name, double price, int prepTime, int calories) {
        this.name = name;
        this.price = price;
        this.prepTime = prepTime;
        this.calories = calories;
    }

    // Accessors (Getters)
    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getPrepTime() { return prepTime; }
    public int getCalories() { return calories; }

    // Mutators (Setters)
    public void setPrice(double price) { this.price = price; }
    public void setPrepTime(int prepTime) { this.prepTime = prepTime; }

    // toString Override
    @Override
    public String toString() {
        return name + " - $" + price + " | " + calories + " cal";
    }

    /**
     * Compares this FoodItem to another FoodItem based on their prices.
     * Used for sorting items in ascending order by price.
     * This method is required for implementing the Comparable interface.
     * Unlike equals(), this method is strictly for sorting logic.
     */
    @Override
    public int compareTo(FoodItem other) {
        return Double.compare(this.price, other.price);
    }
    
    /**
     * Checks if this FoodItem is equal to another object.
     * Two FoodItem objects are considered equal if they have the same name and the same price.
     * Unlike compareTo(), this method is used to determine if two objects are functionally identical — NOT for sorting.
     */    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;  
        if (obj == null || getClass() != obj.getClass()) return false;

        FoodItem other = (FoodItem) obj;
        return this.getName().equals(other.getName()) && this.getPrice() == other.getPrice();
    }

}
