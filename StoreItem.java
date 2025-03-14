/**
 * CSC 331 - 003
 * @author Cal Akins, Julianna Johnston, Zoe Slapshak
 * Due Date: 03/20/25
 * Purpose: Create an inventory system for "Wilmington Quick Shop" that incorporates inheritance and polymorphism
 */

/**
 * Store Item superclass
 * 4 attributes: String name, String category, double price, int quantity
 * All subclasses inherit these attributes
 */
public class StoreItem {
    private String name;
    private String category;
    private double price;
    private int quantity;

    /**
     * Constructor method with all attributes besides quantity as parameters
     * @param name the name of the item (i.e. apple, chair, sweater)
     * @param category the category the item belongs in (i.e. fruit, furniture, clothing)
     * @param price the price of the item
     */
    public StoreItem(String name, String category, double price) {
       this.name = name;
       this.category = category;
       this.price = price;
       this.quantity = calculateQuantity();

   }

    /**
     * Getter method for quantity
     * @return instance of int quantity
     */
   public int getQuantity() {
       return this.quantity;
   }

    /**
     * Getter method for name
     * @return instance of String name
     */
    public String getName() {
        return this.name;

    }

    /**
     * Getter method for category
     * @return instance of String category
     */
    public String getCategory() {
       return this.category;
    }

    /**
     * Getter method for price
     * @return instance of double price
     */
    public double getPrice() {
       return this.price;
    }

    /**
     * Setter method for name
     * @param name String name
     */
    public void setName(String name) {
       this.name = name;
    }

    /**
     * Setter method for category
     * @param category String category
     */
    public void setCategory(String category) {
       this.category = category;
    }

    /**
     * Setter method for price
     * @param price double price
     */
    public void setPrice(double price) {
       this.price = price;
    }

    /**
     * Calculates the number of items in a category (i.e 10 fruits, 15 cleaning supplies, 4 TVS)
     * @param
     * @return the quantity of items as an integer
     */
    private static int calculateQuantity() {
// write code here for calculating the number of items in a category
    }
}

