/**
 * Problem Description:
 * ---------------------
 * This program simulates a food truck management system where the owner can:
 *  - Add menu items (burgers, drinks, sides) with unique attributes like size, meat type, etc.
 *  - Display the menu sorted by price (using Comparable interface).
 *  - Manage customer orders by adding items and calculating total cost.
 * 
 * Key Features Implemented:
 * -------------------------
 * 1. Inheritance: Burger, Drink, and Side inherit from FoodItem.
 * 2. Accessors & Mutators: Each class has proper getters and setters for private variables.
 * 3. Constructors: All classes use constructors for object creation, and constructor overloading is demonstrated.
 * 4. Methods: Meaningful methods like displayMenu(), calculateTotal(), and viewOrders() are implemented.
 * 5. toString() and equals(): Used to provide meaningful string outputs and ensure item equality.
 * 6. Interface Implementation: FoodItem implements Comparable to allow sorting by price.
 * 7. Collections Usage: An ArrayList stores menu items and customer orders.
 * 
 * How to Run:
 * ------------
 * 1. Compile all Java files: FoodItem.java, Burger.java, Drink.java, Side.java, Order.java, FoodTruck.java, ProjectOneTester.java
 * 2. Run ProjectOneTester: The program will display the menu, create sample orders, and showcase sorting and equality checks.
 */
public class ProjectOneTester {
    public static void main(String[] args) {
        // Create a FoodTruck object to manage menu and orders
        FoodTruck truck = new FoodTruck();

        // Menu creation and display
        System.out.println("==== Welcome to the Food Truck! ====\n");

        // Add items to menu
        truck.addMenuItem(new Burger("Classic Burger", 8.50, 10, 600, "Beef", true, false));
        truck.addMenuItem(new Burger("Veggie Burger", 7.00, 5, 500, "Plant-based", false, true));
        truck.addMenuItem(new Drink("Cola", 2.00, 1, 150, "Cola", "Medium"));
        truck.addMenuItem(new Drink("Iced Tea", 2.50, 2, 120, "Lemon", "Large"));
        truck.addMenuItem(new Side("Fries", 3.50, 5, 400, true, "Large"));
        truck.addMenuItem(new Side("Onion Rings", 4.00, 3, 350, false, "Medium"));

        // Display the menu sorted by price (using compareTo)
        truck.displayMenu();

        // Order creation and display
        System.out.println("\n==== Creating Orders... ====\n");

        // Create and add the first order
        Order order1 = new Order();
        order1.addItem(new Burger("Classic Burger", 8.50, 10, 600, "Beef", true, false));
        order1.addItem(new Drink("Cola", 2.00, 1, 150, "Cola", "Medium"));

        // Create and add the second order with a duplicate item
        Order order2 = new Order();
        order2.addItem(new Side("Fries", 3.50, 5, 400, true, "Large"));
        order2.addItem(new Burger("Veggie Burger", 7.00, 5, 500, "Plant-based", false, true));

        // Display both orders
        truck.takeOrder(order1);
        truck.takeOrder(order2);

        // Display all current orders
        System.out.println("\n==== Current Orders ====");
        truck.viewOrders();

        // Testing `equals()` functionality
        System.out.println("\n==== Testing Item Comparison ====");
        FoodItem burger1 = new Burger("Classic Burger", 8.50, 10, 600, "Beef", true, false);
        FoodItem burger2 = new Burger("Classic Burger", 8.50, 10, 600, "Beef", true, false);

        if (burger1.equals(burger2)) {
            System.out.println("✅ `equals()` Test Passed: The two burgers are identical.");
        } else {
            System.out.println("❌ `equals()` Test Failed: The two burgers are different.");
        }

        // Testing `compareTo()` functionality
        System.out.println("\n==== Testing Item Sorting ====");
        if (burger1.compareTo(new Side("Fries", 3.50, 5, 400, true, "Large")) > 0) {
            System.out.println("✅ `compareTo()` Test Passed: Burger is more expensive than Fries.");
        } else {
            System.out.println("❌ `compareTo()` Test Failed: Sorting logic needs fixing.");
        }

        // Calculating Order Details
        System.out.println("\n==== Order Totals ====");
        System.out.println("Order 1 Total: $" + order1.calculateTotal());
        System.out.println("Order 2 Total: $" + order2.calculateTotal());

        System.out.println("\n==== End of Simulation ====");
    }
}
