/**
 * CSC 331 - 003
 * @author Cal Akins, Julianna Johnston, Zoe Slapshak
 * Due Date: 03/20/25
 * Purpose: Create an inventory system for "Wilmington Quick Shop" that incorporates inheritance and polymorphism
 */

/**
 * Food Item Class: Subclass of StoreItem
 * 2 additional attributes: String expirationDate, String countryOfOrigin
 * Inherited attributes: String name, String category, double price, int quantity, String returnPolicy
 */
class FoodItem extends StoreItem {
    private String expirationDate;
    private String countryOfOrigin;

    /**
     * Constructor with 5 attributes as parameters
     * @param name String name
     * @param category String category
     * @param price double price
     * @param expirationDate String expiration date
     * @param countryOfOrigin String country of origin (i.e. where it was grown/produced/made)
     */
    public FoodItem(String name, String category, double price, int quantity, String returnPolicy, String expirationDate, String countryOfOrigin) {
        super(name, category, price, quantity, returnPolicy);
        this.expirationDate = expirationDate;
        this.countryOfOrigin = countryOfOrigin;
    }

    /**
     * toString method for FoodItem
     * Displays parameters of StoreItem plus expiration date and country of origin
     * Example of polymorphism
     * @return String representation of FoodItem
     */
    @Override
    public String toString() {
        return super.toString() + ", Expiration Date: " + expirationDate + ", Country of Origin: " + countryOfOrigin;
    }

    /**
     * Method that overrides getCategory method
     * Labels any instance of FoodItem as category "Food"
     * Example of polymorphism
     * @return String "Food"
     */
    @Override
    public String getCategory() {
        return "Food";
    }

    /**
     * Method that overrides getReturnPolicy method
     * Example of polymorphism
     * @return String returnPolicy
     */
    @Override
    public String getReturnPolicy() {return "No returns"; }

    /**
     * Getter method for expiration date
     * @return instance of String expiration date
     */
    public String getExpirationDate() {
        return this.expirationDate;
    }

    /**
     * Getter method for country of origin
     * @return instance of String country of origin
     */
    public String getCountryOfOrigin() {
        return this.countryOfOrigin;
    }

    /**
     * Setter method for expiration date
     * @param expirationDate of FoodItem as a String
     */
    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    /**
     * Setter method for country of origin
     * @param countryOfOrigin of FoodItem as a String
     */
    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }
}

/**
 * Fruit Class: Subclass of FoodItem
 * 1 additional attribute: fruitGroup
 * Inherited Attributes: String name, String category, double price, int quantity, String expirationDate, String countryOfOrigin
 */
class Fruit extends FoodItem {
    private String fruitGroup;

    /**
     * Constructor with 6 attributes as parameters
     * @param name String name
     * @param category String category
     * @param price double price
     * @param quantity int quantity
     * @param expirationDate String expirationDate
     * @param countryOfOrigin String countryOfOrigin
     * @param fruitGroup - String fruitGroup (i.e. berry, melon, tropical, citrus)
     */
    public Fruit(String name, String category, double price, int quantity, String returnPolicy, String expirationDate, String countryOfOrigin, String fruitGroup) {
        super(name, category, price, quantity,returnPolicy, expirationDate, countryOfOrigin);
        this.fruitGroup = fruitGroup;
    }

    /**
     * toString method for Fruit
     * Displays all parameters of FoodItem plus fruitGroup
     * Example of polymorphism
     * @return String representation of Fruit
     */
    @Override
    public String toString() {
        return super.toString() + ", Fruit Group: " + fruitGroup;
    }

    /**
     * Method that overrides getCategory method
     * Labels every instance of Fruit class as in "Fruit" category
     * Example of polymorphism
     * @return String "Fruit"
     */
    @Override
    public String getCategory() {
        return "Fruit";
    }

    /**
     * Getter method for fruitGroup
     * @return String instance of fruitGroup
     */
    public String getFruitGroup() {
        return this.fruitGroup;
    }

    /**
     * Setter method for fruitGroup
     * @param fruitGroup String
     */
    public void setFruitGroup(String fruitGroup) {
        this.fruitGroup = fruitGroup;
    }
}

/**
 * Vegetable Class: Subclass of FoodItem
 * 1 Additional Attribute: vegetableGroup
 * Inherited attributes: String name, String category, double price, int quantity, String expirationDate, String countryOfOrigin
 */
class Vegetable extends FoodItem {
    private String vegetableGroup;

    /**
     * Constructor with 6 attributes as parameters
     * @param name String name
     * @param category String category
     * @param price double price
     * @param quantity int quantity
     * @param expirationDate String expirationDate
     * @param countryOfOrigin String countryOfOrigin
     * @param vegetableGroup String vegetableGroup (i.e. root, cruciferous, legumes, starchy)
     */
    public Vegetable(String name, String category, double price, int quantity, String returnPolicy, String expirationDate, String countryOfOrigin, String vegetableGroup) {
        super(name, category, price, quantity, returnPolicy, expirationDate, countryOfOrigin);
        this.vegetableGroup = vegetableGroup;

    }

    /**
     * toString method for Vegetable
     * Displays all parameters of FoodItem plus vegetableGroup
     * Example of polymorphism
     * @return String representation of Vegetable
     */
    @Override
    public String toString() {
        return super.toString() + ", Vegetable Group" + vegetableGroup;
    }

    /**
     * Method that overrides getCategory method
     * Labels every instance of Vegetable class as category "Vegetable"
     * Example of polymorphism
     * @return string "Vegetable"
     */
    @Override
    public String getCategory() {
        return "Vegetable";
    }

    /**
     * Getter method for vegetableGroup
     * @return String instance of vegetableGroup
     */
    public String getVegetableGroup() {
        return this.vegetableGroup;
    }

    /**
     * Setter method for vegetableGroup
     * @param vegetableGroup String
     */
    public void setVegetableGroup(String vegetableGroup) {
        this.vegetableGroup = vegetableGroup;
    }
}

/**
 * ShelfStable Class: Subclass of FoodItem
 * 1 additional attribute: packagingType
 * Inherited attributes: String name, String category, double price, int quantity, String expirationDate, String countryOfOrigin
 */
class ShelfStable extends FoodItem {
    private String packagingType;

    /**
     * Constructor method that takes 6 parameters
     * @param name String name
     * @param category String category
     * @param price double price
     * @param quantity int quantity
     * @param returnPolicy String returnPolicy
     * @param expirationDate String expiration date
     * @param countryOfOrigin String country of origin
     * @param packagingType String packaging type (i.e. can, box, tin)
     */
    public ShelfStable(String name, String category, double price, int quantity, String returnPolicy, String expirationDate, String countryOfOrigin, String packagingType) {
        super(name, category, price, quantity, returnPolicy, expirationDate, countryOfOrigin);
        this.packagingType = packagingType;
    }

    /**
     * toString method for ShelfStable
     * Displays all parameters of FoodItem plus packagingType
     * example of polymorphism
     * @return String representation of ShelfStable
     */
    @Override
    public String toString() {
        return super.toString() + ", Packaging Type: " + packagingType;
    }

    /**
     *  Method that overrides getCategory method
     *  Labels every instance of ShelfStable class as "Shelf Stable" category
     *  Example of polymorphism
     * @return String "Shelf Stable"
     */
    @Override
    public String getCategory() {
        return "Shelf Stable";
    }

    /**
     * Getter method for packagingType
     * @return String instance of packaging type
     */
    public String getPackagingType() {
        return this.packagingType;
    }

    /**
     * Setter method for packagingType
     * @param packagingType String
     */
    public void setPackagingType(String packagingType) {
        this.packagingType = packagingType;
    }


}

