/**
 * CSC 331 - 003
 * @author Cal Akins, Julianna Johnston, Zoe Slapshak
 * Due Date: 03/20/25
 * Purpose: Create an inventory system for "Wilmington Quick Shop" that incorporates inheritance and polymorphism
 */

/**
 * ClothingItem Class: Subclass of Store Item
 * 5 additional attribute: String color, String material, String size, String section, String brand
 * Inherited attributes: String name, String category, double price, int quantity
 */
class ClothingItem extends StoreItem {
    private String color;
    private String material;
    private String size;
    private String section;
    private String brand;

    /**
     * Constructor method with 7 attributes as parameters
     * @param name String name
     * @param category String category
     * @param price double price
     * @param quantity int
     * @param color String color of the item
     * @param material String material (i.e. cotton, polyester)
     * @param size String size (i.e. small, medium, large)
     * @param section String section (i.e. children's, men's, women's)
     * @param brand String
     */
    public ClothingItem(String name, String category, double price, int quantity, String color, String material, String size, String section, String brand) {
        super(name, category, price, quantity);
        this.color = color;
        this.material = material;
        this.size = size;
        this.section = section;
        this.brand = brand;
    }

    /**
     * toString method for ClothingItem
     * Displays all parameters of StoreItem plus color, material, size, section, and brand
     * Example of polymorphism
     * @return String representation of ClothingItem
     */
    @Override
    public String toString() {
        return super.toString() + ", Color: " + color + ", Material: " + material + ", Size: " + size + ". Section: " + section + ", Brand:" + brand;
    }

    /**
     * Method that overrides getCategory method
     * Labels every instance of ClothingItem as Clothing
     * @return String "Clothing"
     */
    @Override
    public String getCategory() {
        return "Clothing";
    }

    /**
     * Getter method for color
     * @return String instance of color
     */
    public String getColor() {
        return this.color;
    }

    /**
     * Getter method for material
     * @return String instance material
     */
    public String getMaterial() {
        return this.material;
    }

    /**
     * getter method for size
     * @return String instance of size
     */
    public String getSize() {
        return this.size;
    }

    /**
     * Getter method for section
     * @return String instance of clothing section
     */
    public String getSection() {
        return this.section;
    }

    /**
     * Getter method for brand
     * @return String instance of brand
     */
    public String getBrand() { return this.brand;}

    /**
     * Setter method for color
     * @param color String
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Setter method for material
     * @param material String
     */
    public void setMaterial(String material) {
        this.material = material;
    }

    /**
     * Setter method for size
     * @param size String
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * Setter method for section
     * @param section String
     */
    public void setSection(String section) {
        this.section = section;
    }

    /**
     * Setter method for brand
     * @param brand String
     */
    public void setBrand(String brand) {this.brand = brand; }
}

/**
 * Shirt Class: Subclass of ClothingItem
 * 1 additional attribute: String sleeveLength
 * Inherited attributes: String name, String category, double price, int quantity, String color, String material, String size, String section, String brand
 */
class Shirt extends ClothingItem {
    private String sleeveLength;

    /**
     * Constructor that takes 8 parameters
     * @param name String
     * @param category String
     * @param price double
     * @param quantity int
     * @param color String
     * @param material String
     * @param size String
     * @param section String
     * @param brand String
     * @param sleeveLength String (i.e.t-shirt, long sleeve, tank top)
     */
    public Shirt(String name, String category, double price, int quantity, String color, String material, String size, String section, String brand, String sleeveLength) {
        super(name, category, price, quantity, color, material, size, section, brand);
        this.sleeveLength = sleeveLength;

    }

    /**
     * toString method for Shirt
     * Displays all parameters of ClothingItem plus sleeveLength
     * Example of polymorphism
     * @return String representation of Shirt
     */
    @Override
    public String toString() {
        return super.toString() + ", Sleeve Length: " + sleeveLength;
    }

    /**
     * Method that overrides getCategory method
     * Labels every instance of Shirt class as "Shirt" category
     * @return String "Shirt"
     */
    @Override
    public String getCategory() {
        return "Shirt";
    }

    /**
     * Getter method for sleeveLength
     * @return String instance of sleeveLength
     */
    public String getSleeveLength() {
        return this.sleeveLength;
    }

    /**
     * Setter method for sleeveLength
     * @param sleeveLength String
     */
    public void setSleeveLength(String sleeveLength) {
        this.sleeveLength = sleeveLength;
    }

}

/**
 * Shoe Class: Subclass of ClothingItem
 * No additional attributes
 * Inherited attributes: String name, String category, double price, int quantity, String color, String material, String size, String section, String brand
 */
class Shoe extends ClothingItem {

    /**
     * Constructor that takes 7 parameters
     * @param name String
     * @param category String
     * @param price double
     * @param quantity int
     * @param color String
     * @param material String
     * @param size String
     * @param section String
     * @param brand String
     */
    public Shoe(String name, String category, double price, int quantity, String color, String material, String size, String section, String brand) {
        super(name, category, price, quantity, color, material, size, section, brand);

    }

    /**
     * toString method for Shoe
     * Displays all parameters in ClothingItem
     * Example of polymorphism
     * @return String representation of Shoe
     */
    @Override
    public String toString() {
        return super.toString();
    }

    /**
     * Method that overrides getCategory method
     * Labels every instance of Shoe class as "Shoe" category
     * Example of polymorphism
     * @return String "Shoe"
     */
    @Override
    public String getCategory() {
        return "Shoe";
    }

}

/**
 * Outerwear Class: Subclass of ClothingItem
 * No additional attributes
 * Inherited attributes: String name, String category, double price, int quantity, String color, String material, String size, String section, String brand
 */
class Outerwear extends ClothingItem {

    /**
     * Constructor that takes 7 parameters
     * @param name String
     * @param category String
     * @param price double
     * @param quantity int
     * @param color String
     * @param material String
     * @param size String
     * @param section String
     * @param brand String
     */
    public Outerwear(String name, String category, double price, int quantity, String color, String material, String size, String section, String brand) {
        super(name, category, price, quantity, color, material, size, section, brand);

    }

    /**
     * toString method for Outerwear
     * Displays all parameters in ClothingItem
     * Example of polymorphism
     * @return String representation of Outerwear
     */
    @Override
    public String toString() {
        return super.toString();
    }

    /**
     * Method that overrides getCategory method
     * Labels every instance of outerwear class as "Outerwear" category
     * Example of polymorphism
     * @return String "Outerwear"
     */
    @Override
    public String getCategory() {
        return "Outerwear";
    }

}