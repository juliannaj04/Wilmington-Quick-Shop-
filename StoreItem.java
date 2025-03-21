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
    private String returnPolicy;

    /**
     * Constructor method with all attributes besides quantity as parameters
     * @param name the name of the item (i.e. apple, chair, sweater)
     * @param category the category the item belongs in (i.e. fruit, furniture, clothing)
     * @param price the price of the item
     * @param quantity the quantity of the item
     * @param returnPolicy the return policy of an item
     */
    public StoreItem(String name, String category, double price, int quantity, String returnPolicy) {
       this.name = name;
       this.category = category;
       this.price = price;
       this.quantity = quantity;
       this.returnPolicy = returnPolicy;

   }

    /**
     * toString method for StoreItem that includes name, category, price, and quantity
     * @return String representation of StoreItem
     */
   @Override
   public String toString() {
        return "Name: " + name + " , Category: " + category + " , Price: " + price + " , Quantity: " + quantity + " , Return Policy: " + returnPolicy;
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
     * Getter method for return policy
     * @return instance of string return policy
     */
    public String getReturnPolicy() {
        return this.returnPolicy;
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
     * Setter method for quantity
     * @param quantity int quantity
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;

    }

    /**
     * Setter method for return policy
     * @param returnPolicy String return policy
     */
    public void setReturnPolicy(String returnPolicy) {
        this.returnPolicy = returnPolicy;

    }




}

