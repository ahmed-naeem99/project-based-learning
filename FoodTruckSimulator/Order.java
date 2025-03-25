import java.util.ArrayList;

public class Order {
    private ArrayList<FoodItem> items;
    private static int orderCounter = 1000;
    private int orderNumber;

    // Constructor
    public Order() {
        items = new ArrayList<>();
        this.orderNumber = orderCounter++;
    }

    // Add item to order
    public void addItem(FoodItem item){
        items.add(item);
    }

    // Calculate total for all items in order
    public double calculateTotal() {
        double total = 0;
        for (FoodItem item : items) {
            total += item.getPrice();
        }
        return total;
    }

    // Display order number, items, and total
    public void displayOrderDetails() {
        System.out.println("Order #" + orderNumber);
        for (FoodItem item : items) {
            System.out.println(" - " + item);
        }
        System.out.println("Total: $" + calculateTotal());
    }
}