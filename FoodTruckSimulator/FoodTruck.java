import java.util.ArrayList;

public class FoodTruck {
    private ArrayList<FoodItem> menu;
    private ArrayList<Order> orders;

    // Constructor
    public FoodTruck() {
        menu = new ArrayList<>();
        orders = new ArrayList<>();
    }

    // Add item to menu
    public void addMenuItem(FoodItem item) {
        menu.add(item);
    }

    // Create new order
    public void takeOrder(Order order) {
        orders.add(order);
    }

    // Display menu
    public void displayMenu() {
        System.out.println("Food Truck Menu:");
        for (FoodItem item : menu) {
            System.out.println("- " + item);
        }
    }

    // Display all orders
    public void viewOrders() {
        for (Order order : orders) {
            order.displayOrderDetails();
        }
    }
}
