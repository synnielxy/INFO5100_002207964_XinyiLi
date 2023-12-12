import java.util.ArrayList;
import java.util.List;
class DatabaseConnection {
    private static DatabaseConnection instance = new DatabaseConnection();

    private DatabaseConnection() {
        // private constructor to prevent instantiation
    }

    public static DatabaseConnection getInstance() {
        return instance;
    }

    public void connect() {
        System.out.println("Database Connected");
    }
}

abstract class SupermarketProduct {
    abstract void prepare();
}

class FoodProduct extends SupermarketProduct {
    void prepare() {
        System.out.println("Preparing Food SupermarketProduct");
    }
}

class NonFoodProduct extends SupermarketProduct {
    void prepare() {
        System.out.println("Preparing Non-Food SupermarketProduct");
    }
}

class SupermarketProductFactory {
    public SupermarketProduct createProduct(String type) {
        if (type.equalsIgnoreCase("Food")) {
            return new FoodProduct();
        } else if (type.equalsIgnoreCase("NonFood")) {
            return new NonFoodProduct();
        }
        return null;
    }
}

interface Observer {
    void update(String itemName, String availability);
}

class Customer implements Observer {
    private String name;

    Customer(String name) {
        this.name = name;
    }

    public void update(String itemName, String availability) {
//        System.out.println("Hello " + name + ", InventoryItem is now " + availability);
        System.out.println("Hello " + name + ", " + itemName + " is now " + availability);
    }
}

interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}

class InventoryItem implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String itemName;
    private String itemType;
    private String itemAvailability;

    InventoryItem(String itemName, String itemType) {
        this.itemName = itemName;
        this.itemType = itemType;
    }

    public void setAvailability(String availability) {
        this.itemAvailability = availability;
        notifyObservers();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers() {
        for (Observer ob : observers) {
            ob.update(itemName, itemAvailability);
        }
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
}

public class Main {
    public static void main(String[] args) {
        // Singleton usage
        DatabaseConnection dbManager = DatabaseConnection.getInstance();
        dbManager.connect();

        // Observer usage
        InventoryItem service = new InventoryItem("apple","food");
        service.registerObserver(new Customer("Alice"));
        service.registerObserver(new Customer("Bob"));
        service.setAvailability("available");

        // Factory Method usage
        SupermarketProductFactory factory = new SupermarketProductFactory();
        SupermarketProduct food = factory.createProduct("Food");
        SupermarketProduct nonFood = factory.createProduct("NonFood");
        food.prepare();
        nonFood.prepare();
    }
}