import java.util.*;

public class WQSAkinsJohnstonSlapshak {
    static Scanner scanner = new Scanner(System.in);
    static Map<String, Integer> order = new HashMap<>();

    //Instances (At least 1 from each class at bottom of hierarchy)
    //Food Items
    static Fruit apple = new Fruit("Apple","Fruit",.50, 10, "No returns","03/23/25", "Brazil", "Pome");
    static ShelfStable cereal = new ShelfStable("Frosted Flakes", "Shelf Stable", 2.50, 8, "No returns","05/15/27", "Canada", "Box");
    static Vegetable carrot = new Vegetable("Carrot", "Vegetable", .75, 4, "No returns","03/24/25", "United States", "Root");

    //Household Items
    static CleaningSupply laundryDetergent = new CleaningSupply("Tide Pods", "Cleaning Supply", 6.00, 6, "Returnable with Receipt within 30 Days","Laundry Room", true);
    static Furniture chair = new Furniture("Recliner", "Furniture", 149.99, 2, "Returnable with Receipt within 30 Days","Living Room", "Brown", "Leather");

    //Electronic Items
    static Laptop macbook = new Laptop("Macbook Pro", "Laptop", 600.00, 5, "Returnable with Receipt within 30 Days","Apple", 2023, 15);
    static Phone iPhone = new Phone("iPhone 14", "Phone", 400.00, 7, "Returnable with Receipt within 30 Days", "Apple", 2022, false, true);
    static TV rokuTV = new TV("Roku TV", "TV", 150.00, 9, "Returnable with Receipt within 30 Days","Roku", 2025, 32);

    //Clothing Items
    static Outerwear rainJacket = new Outerwear("Rain Jacket", "Outerwear", 39.99, 12, "Returnable with Receipt within 30 Days","Blue", "polyester", "Medium", "Women's", "Columbia");
    static Shirt tShirt = new Shirt("T-Shirt", "Shirt", 15.00, 18, "Returnable with Receipt within 30 Days","Green", "Cotton", "Large", "Men's", "Hanes", "Short Sleeve");
    static Shoe boots = new Shoe("Cowboy Boots", "Shoes", 79.95, 4, "Returnable with Receipt within 30 Days","Brown", "Leather", "8.5", "Women's", "Frye");

    //Arrays to store items
    static FoodItem[] foods = {apple, cereal, carrot};
    static HouseholdItem[] households = {laundryDetergent, chair};
    static ElectronicsItem[] electronics = {macbook, iPhone, rokuTV};
    static ClothingItem[] clothes = {rainJacket, tShirt, boots};

    /**
     * Method that displays inventory based on specified category
     * @param category String
     */
    public static void displayInventory(String category) {
        switch (category) {
            case "food":
                System.out.println("Food Inventory: ");
                System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                for (FoodItem food : foods) {
                    System.out.println(food);
                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                }
                break;
            case "household":
                System.out.println("Household Inventory: ");
                System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                for (HouseholdItem household : households) {
                    System.out.println(household);
                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                }
                break;
            case "electronics":
                System.out.println("Electronics Inventory: ");
                System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                for (ElectronicsItem electronic : electronics) {
                    System.out.println(electronic);
                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                }
                break;
            case "clothing":
                System.out.println("Clothing Inventory: ");
                System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                for (ClothingItem cloth : clothes) {
                    System.out.println(cloth);
                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                }
                break;
            default:
                System.out.println("Invalid Category");
        }
    }

    /**
     * Method that adds an item to specific inventory based on category (subclass)
     * @param newItem object of StoreItem
     */
    public static void addInventory(StoreItem newItem) {
        if (newItem instanceof FoodItem) {
            FoodItem[] newFoods = Arrays.copyOf(foods, foods.length + 1); // Create new arrays with increased sizes
            newFoods[foods.length] = (FoodItem) newItem; // adding new foodItem at the end of array by indexing
            foods = newFoods;
            System.out.println(newItem.getName() + " added to food inventory");

        } else if (newItem instanceof HouseholdItem) {
            HouseholdItem[] newHouseholds = Arrays.copyOf(households, households.length + 1);
            newHouseholds[households.length] = (HouseholdItem) newItem;
            households = newHouseholds;
            System.out.println(newItem.getName() + " added to household inventory");

        } else if (newItem instanceof ElectronicsItem) {
            ElectronicsItem[] newElectronics = Arrays.copyOf(electronics, electronics.length + 1);
            newElectronics[electronics.length] = (ElectronicsItem) newItem;
            electronics = newElectronics;
            System.out.println(newItem.getName() + " added to electronics inventory");

        } else if (newItem instanceof ClothingItem) {
            ClothingItem[] newClothes = Arrays.copyOf(clothes, clothes.length + 1);
            newClothes[clothes.length] = (ClothingItem) newItem;
            clothes = newClothes;
            System.out.println(newItem.getName() + " added to clothing inventory");

        } else {
            System.out.println("Invalid item");
        }

    }

    /**
     * Helper method for addInventory
     * Adds new FoodItem to the inventory based on subclass - Fruit, Vegetable, ShelfStable
     */
    public static void addFoodItem() {
        System.out.print("Would you like to add a new item or more of an existing item? (new/existing): ");
        String choice = scanner.nextLine();

        if (choice.equals("existing")) {
            System.out.print("What is the name of the food item you would like to add more of? ");
            String item = scanner.nextLine();

            for (FoodItem food: foods) { // for each food in the foods array
                if (food.getName().equals(item)) {
                    System.out.println("How many " + item + " would you like to add? "); // FIX LATER
                    int amount = scanner.nextInt();
                    scanner.nextLine();
                    food.setQuantity(food.getQuantity() + amount);
                    System.out.println("Updated quantity of " + item + ": " + food.getQuantity()); // increase quantity

                }
            }

        } else if (choice.equals("new")) {
            System.out.print("Enter the name of the new food item you would like to add: ");
            String name = scanner.nextLine();
            System.out.print("Enter the price of " + name + ": ");
            double price = scanner.nextDouble();
            System.out.print("Enter the quantity of " + name + ": ");
            int quantity = scanner.nextInt();
            System.out.print("Enter the return policy of " + name + ": ");
            String returnPolicy = scanner.nextLine();
            scanner.nextLine();
            System.out.print("Enter the expiration date of " + name + ": ");
            String expirationDate = scanner.nextLine();
            System.out.print("Enter the country of origin of " + name + ": ");
            String countryOfOrigin = scanner.nextLine();

            System.out.print("What category of food item is this? (Fruit/Vegetable/Shelf Stable): ");
            String foodCategory = scanner.nextLine();

            switch (foodCategory) {
                case "Fruit":
                    System.out.print("Enter the fruit group (i.e. Pome, Citrus, Berry): ");
                    String fruitGroup = scanner.nextLine();
                    Fruit newFruit = new Fruit(name, "Fruit", price, quantity, returnPolicy, expirationDate, countryOfOrigin, fruitGroup); // create new Fruit object based on user input
                    addInventory(newFruit);
                    break;
                case "Vegetable":
                    System.out.print("Enter the vegetable group (i.e. Root, Starchy, Cruciferous): ");
                    String vegetableGroup = scanner.nextLine();
                    Vegetable newVegetable = new Vegetable(name, "Vegetable", price, quantity, returnPolicy, expirationDate, countryOfOrigin, vegetableGroup); // create new Vegetable object based on user input
                    addInventory(newVegetable);
                    break;
                case "Shelf Stable":
                    System.out.print("Enter the packaging type: ");
                    String packagingType = scanner.nextLine();
                    ShelfStable newShelfStable = new ShelfStable(name, "Shelf Stable", price, quantity, returnPolicy, expirationDate, countryOfOrigin, packagingType); // create new ShelfStable object based on user input
                    addInventory(newShelfStable);
                    break;
                default:
                    System.out.println("Invalid food category");
                    break;
            }

        }

    }

    /**
     * Helper method for addInventory
     * Adds new HouseHold item to the inventory based on subclass - Cleaning Supply, Furniture
     */
    public static void addHouseholdItem() {
        System.out.print("Would you like to add a new item or more of an existing item? (new/existing): ");
        String choice = scanner.nextLine();

        if (choice.equals("existing")) {
            System.out.print("What is the name of the item would you like to add more of? ");
            String item = scanner.nextLine();

            for (HouseholdItem householdItem: households) { // for each household item in the households array
                if (householdItem.getName().equals(item)) {
                    System.out.print("How many " + item + " would you like to add? ");
                    int amount = scanner.nextInt();
                    householdItem.setQuantity(householdItem.getQuantity() + amount);
                    System.out.println("Updated quantity of " + item + ": " + householdItem.getQuantity()); // increase quantity

                }
            }

        } else if (choice.equals("new")) {
            System.out.print("Enter the name of the new household item you would like to add: ");
            String name = scanner.nextLine();
            System.out.print("Enter the price of " + name + ": ");
            double price = scanner.nextDouble();
            System.out.print("Enter the quantity of " + name + ": ");
            int quantity = scanner.nextInt();
            System.out.print("Enter the return policy of " + name + ": ");
            String returnPolicy = scanner.nextLine();
            scanner.nextLine();
            System.out.print("Enter the room associated with " + name + ": ");
            String roomType = scanner.nextLine();
            System.out.print("What category of household item is this? (Cleaning Supply/ Furniture): ");
            String householdItemCategory = scanner.nextLine();

            switch (householdItemCategory) {
                case "Cleaning Supply":
                    System.out.print("Is it toxic? (true/false): ");
                    boolean isToxic = scanner.nextBoolean();
                    CleaningSupply newCleaningSupply = new CleaningSupply(name, "Cleaning Supply", price, quantity,returnPolicy, roomType, isToxic);
                    addInventory(newCleaningSupply);
                    break;
                case "Furniture":
                    System.out.print("Enter the material: ");
                    String material = scanner.nextLine();
                    System.out.print("Enter the color: ");
                    String color = scanner.nextLine();
                    Furniture newFurniture = new Furniture(name, "Furniture", price, quantity, returnPolicy, roomType, color, material);
                    addInventory(newFurniture);
                    break;
                default:
                    System.out.println("Invalid household item category");
            }
        }
    }

    /**
     * Helper method for addInventory
     * Adds new electronics item to the inventory based on subclass - TV, Phone, Laptop
     */
    public static void addElectronicsItem() {
        System.out.print("Would you like to add a new item or more of an existing item? (new/existing): ");
        String choice = scanner.nextLine();

        if (choice.equals("existing")) {
            System.out.print("What is the name of the electronics item would you like to add more of? ");
            String item = scanner.nextLine();

            for (ElectronicsItem electronicsItem: electronics) { // for each electronics item in the electronics array
                if (electronicsItem.getName().equals(item)) {
                    System.out.println("How many " + item + " would you like to add? ");
                    int amount = scanner.nextInt();
                    electronicsItem.setQuantity(electronicsItem.getQuantity() + amount);
                    System.out.println("Updated quantity of " + item + ": " + electronicsItem.getQuantity()); // increase quantity

                }
            }

        } else if (choice.equals("new")) {
            System.out.print("Enter the name of the new electronics item you would like to add: ");
            String name = scanner.nextLine();
            System.out.print("Enter the price of " + name + ": ");
            double price = scanner.nextDouble();
            System.out.print("Enter the quantity of " + name + ": ");
            int quantity = scanner.nextInt();
            System.out.print("Enter the return policy of " + name + ": ");
            String returnPolicy = scanner.nextLine();
            scanner.nextLine();
            System.out.print("Enter the brand of " + name + ": ");
            String brand = scanner.nextLine();
            System.out.print("Enter the year of " + name + ": ");
            int year = scanner.nextInt();

            System.out.print("What category of electronics item is this? (TV/Phone/Laptop): ");
            String electronicsCategory = scanner.nextLine();

            switch(electronicsCategory) {
                case "TV":
                    System.out.print("Enter the screen size: ");
                    int tvScreenSize = scanner.nextInt();
                    TV newTV = new TV(name, "TV", price, quantity, returnPolicy,brand, year, tvScreenSize);
                    addInventory(newTV);
                    break;
                case "Phone":
                    System.out.print("Is it a landline (true/false): ");
                    boolean isLandline = scanner.nextBoolean();
                    System.out.print("Is it a cellphone (true/false: )");
                    boolean isCellphone = scanner.nextBoolean();
                    Phone newPhone = new Phone(name, "Phone", price, quantity,returnPolicy, brand, year, isLandline,isCellphone);
                    addInventory(newPhone);
                    break;
                case "Laptop":
                    System.out.println("Enter the screen size: ");
                    int laptopScreenSize = scanner.nextInt();
                    Laptop newLaptop = new Laptop(name, "Laptop", price, quantity,returnPolicy, brand, year, laptopScreenSize);
                    addInventory(newLaptop);
                    break;
                default:
                    System.out.println("Invalid electronics item category");

            }
        }
    }

    /**
     * Helper method for addInventory
     * Adds new clothing item to the inventory based on subclass - Outerwear, Shirt, Shoe
     */
    public static void addClothingItem() {
        System.out.print("Would you like to add a new item or more of an existing item? (new/existing): ");
        String choice = scanner.nextLine();

        if (choice.equals("existing")) {
            System.out.print("What is the name of the clothing item would you like to add more of? ");
            String item = scanner.nextLine();

            for (ClothingItem clothingItem : clothes) { // for each clothingItem item in the clothes array
                if (clothingItem.getName().equals(item)) {
                    System.out.print("How many " + item + " would you like to add?");
                    int amount = scanner.nextInt();
                    clothingItem.setQuantity(clothingItem.getQuantity() + amount);
                    System.out.println("Updated quantity of " + item + ": " + clothingItem.getQuantity()); // increase quantity

                }
            }

        } else if (choice.equals("new")) {
            System.out.print("Enter the name of the new clothing item you would like to add: ");
            String name = scanner.nextLine();
            System.out.print("Enter the price of " + name + ": ");
            double price = scanner.nextDouble();
            System.out.print("Enter the quantity of " + name + ": ");
            int quantity = scanner.nextInt();
            System.out.print("Enter the return policy of " + name + ": ");
            String returnPolicy = scanner.nextLine();
            scanner.nextLine();
            System.out.print("Enter the color of " + name + ": ");
            String color = scanner.nextLine();
            System.out.print("Enter the material of " + name + ": ");
            String material = scanner.nextLine();
            System.out.print("Enter the size of " + name + ": ");
            String size = scanner.nextLine();
            System.out.print("Enter the section that " + name + " belongs to: ");
            String section = scanner.nextLine();
            System.out.print("Enter the brand of " + name + ": ");
            String brand = scanner.nextLine();

            System.out.print("What category of clothing item is this? (Outerwear/Shirt/Shoe): ");
            String clothingCategory = scanner.nextLine();

            switch (clothingCategory) {
                case "Outerwear":
                    Outerwear newOuterwear = new Outerwear(name, "Outerwear", price, quantity, returnPolicy, color, material, size, section, brand);
                    addInventory(newOuterwear);
                    break;
                case "Shirt":
                    System.out.print("Enter the sleeve length: ");
                    String sleeveLength = scanner.nextLine();
                    Shirt newShirt = new Shirt(name,"Shirt", price, quantity,returnPolicy, color, material, size, section, brand, sleeveLength);
                    addInventory(newShirt);
                    break;
                case "Shoe":
                    Shoe newShoe = new Shoe(name, "Outerwear", price, quantity, returnPolicy, color, material, size, section, brand);
                    addInventory(newShoe);
                    break;
                default:
                    System.out.print("Invalid clothing category");

            }
        }
    }

    
    /**
     * Allows users to add multiple items from different categories before checkout.
     */
    public static void sellItems() {
        Map<String, Map<String, Integer>> categorizedOrder = new HashMap<>();
        
        while (true) {
            System.out.print("Enter the category of the item (food/household/electronics/clothing) or 'checkout' to proceed: ");
            String category = scanner.nextLine();

            if (category.equalsIgnoreCase("checkout")) {
                checkout(categorizedOrder);
                break;
            }

            displayInventory(category);
            StoreItem selectedItem = selectItem(category);
            if (selectedItem == null) continue;

            System.out.print("Enter quantity: ");
            int quantity = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (quantity > selectedItem.getQuantity()) {
                System.out.println("Not enough stock available.");
                continue;
            }

            // Organize order by category
            categorizedOrder.putIfAbsent(category, new HashMap<>());
            Map<String, Integer> categoryItems = categorizedOrder.get(category);
            categoryItems.put(selectedItem.getName(), 
                categoryItems.getOrDefault(selectedItem.getName(), 0) + quantity);
            
            System.out.println(quantity + "x " + selectedItem.getName() + " added to order.");
        }
    }

    /**
     * Displays the order summary and confirms checkout.
     * @param categorizedOrder Order organized by category
     */
    public static void checkout(Map<String, Map<String, Integer>> categorizedOrder) {
        if (categorizedOrder.isEmpty()) {
            System.out.println("No items in the order. Checkout canceled.");
            return;
        }

        // Tax rates
        final double FOOD_TAX_RATE = 0.02; // 2% tax on food items
        final double NON_FOOD_TAX_RATE = 0.07; // 7% tax on non-food items

        System.out.println("\n--- Order Summary ---");
        double totalBeforeTax = 0;
        double totalTax = 0;
        double totalAfterTax = 0;
        
        // Display items organized by category
        for (String category : categorizedOrder.keySet()) {
            System.out.println("\n" + category.toUpperCase() + " ITEMS:");
            Map<String, Integer> categoryItems = categorizedOrder.get(category);
            double categorySubtotal = 0;
            double categoryTax = 0;
            
            for (Map.Entry<String, Integer> entry : categoryItems.entrySet()) {
                StoreItem item = findItem(entry.getKey());
                if (item != null) {
                    double itemTotal = item.getPrice() * entry.getValue();
                    double itemTax;
                    
                    // Determine tax rate based on category
                    if (category.equals("food")) {
                        itemTax = itemTotal * FOOD_TAX_RATE;
                    } else {
                        itemTax = itemTotal * NON_FOOD_TAX_RATE;
                    }
                    
                    System.out.printf("  %s x%d: $%.2f (Unit Price: $%.2f, Tax: $%.2f)\n", 
                        entry.getKey(), entry.getValue(), itemTotal, item.getPrice(), itemTax);
                    
                    categorySubtotal += itemTotal;
                    categoryTax += itemTax;
                }
            }
            
            // Display category subtotal and tax
            System.out.printf("  Category Subtotal: $%.2f\n", categorySubtotal);
            System.out.printf("  Category Tax: $%.2f\n", categoryTax);
            
            totalBeforeTax += categorySubtotal;
            totalTax += categoryTax;
        }

        // Calculate total after tax
        totalAfterTax = totalBeforeTax + totalTax;

        // Display totals
        System.out.println("\n--- Total Summary ---");
        System.out.printf("Subtotal: $%.2f\n", totalBeforeTax);
        System.out.printf("Total Tax: $%.2f\n", totalTax);
        System.out.printf("Total Order Value: $%.2f\n", totalAfterTax);

        // Confirm checkout
        System.out.print("Confirm checkout? (yes/no): ");
        String confirm = scanner.nextLine();

        if (confirm.equalsIgnoreCase("yes")) {
            // Process checkout and reduce inventory
            for (String category : categorizedOrder.keySet()) {
                Map<String, Integer> categoryItems = categorizedOrder.get(category);
                for (Map.Entry<String, Integer> entry : categoryItems.entrySet()) {
                    StoreItem item = findItem(entry.getKey());
                    if (item != null) {
                        item.setQuantity(item.getQuantity() - entry.getValue());
                    }
                }
            }
            System.out.println("Order completed! Thank you for your purchase.");
        } else {
            System.out.println("Checkout canceled.");
        }
        
        // Clear the order
        categorizedOrder.clear();
    }

    /**
     * Allows users to select an item from a given category.
     */
    public static StoreItem selectItem(String category) {
        StoreItem[] items = getCategoryArray(category);
        if (items == null) {
            System.out.println("Invalid category. Try again.");
            return null;
        }

        System.out.print("Enter the item name: ");
        String itemName = scanner.nextLine();
        return findItem(itemName);
    }

    /**
     * Finds an item across all categories.
     */
    public static StoreItem findItem(String name) {
        StoreItem[] allItems = mergeAllItems();
        for (StoreItem item : allItems) {
            if (item.getName().equalsIgnoreCase(name)) {
                return item;
            }
        }
        return null;
    }

    /**
     * Returns the corresponding inventory array based on category.
     */
    public static StoreItem[] getCategoryArray(String category) {
        switch (category.toLowerCase()) {
            case "food": return foods;
            case "household": return households;
            case "electronics": return electronics;
            case "clothing": return clothes;
            default: return null;
        }
    }

    /**
     * Merges all inventory items into a single array for searching.
     */
    public static StoreItem[] mergeAllItems() {
        List<StoreItem> allItems = new ArrayList<>();
        allItems.addAll(Arrays.asList(foods));
        allItems.addAll(Arrays.asList(households));
        allItems.addAll(Arrays.asList(electronics));
        allItems.addAll(Arrays.asList(clothes));
        return allItems.toArray(new StoreItem[0]);
    }

    public static void main(String[] args) {
        //User Input for Add, Sell, Quit
        while (true) {
            System.out.print("Would you like to sell an item, add an item to the inventory, or quit (sell/add/quit): ");
            String action = scanner.nextLine();

            // ADD
            if (action.equals("add")) {
                System.out.print("What type of item would you like to add? (food/household/electronics/clothing): ");
                String category = scanner.nextLine();

                displayInventory(category);

                // call appropriate method based on category
                if (category.equals("food")) {
                    addFoodItem();
                    displayInventory("food");
                } else if (category.equals("household")) {
                    addHouseholdItem();
                    displayInventory("household");
                } else if (category.equals("electronics")) {
                    addElectronicsItem();
                    displayInventory("electronics");
                } else if (category.equals("clothing")) {
                    addClothingItem();
                    displayInventory("clothing");
                } else {
                    System.out.println("Invalid category");
                }

            // SELL
            } else if (action.equals("sell")) {

                sellItems();
                // DISPLAYS RETURN POLICY HERE

            // QUIT
            } else if (action.equals("quit")) {
                System.out.print("Exiting the program...");
                break;
            }



        }
        
    }
}
