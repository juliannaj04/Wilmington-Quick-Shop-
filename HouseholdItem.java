/**
 * CSC 331 - 003
 * @author Cal Akins, Julianna Johnston, Zoe Slapshak
 * Due Date: 03/20/25
 * Purpose: Create an inventory system for "Wilmington Quick Shop" that incorporates inheritance and polymorphism
 */

/**
 * HouseholdItem Class: Subclass of StoreItem
 * 1 additional attribute: String roomType
 * Inherited attributes: String name, String category, double price, int quantity
 */
class HouseholdItem extends StoreItem {
    private String roomType;

    /**
     * Constructor method with 4 attributes as parameters
     * @param name String name
     * @param category String category
     * @param price double price
     * @param quantity int quantity
     * @param roomType - what room(s) the item is associated with (i.e. kitchen, bathroom, living room)
     */
    public HouseholdItem(String name, String category, double price, int quantity,String returnPolicy, String roomType) {
        super(name, category, price, quantity, returnPolicy);
        this.roomType = roomType;
    }

    /**
     * toString method for HouseholdItem
     * Displays all parameters of StoreItem plus roomType
     * Example of polymorphism
     * @return String representation of HouseholdItem
     */
    @Override
    public String toString() {
        return super.toString() + ", Room Type: " + roomType;
    }

    /**
     * Method that overrides getCategory method
     * Labels an instance of HouseHold Item as household item
     * Example of polymorphism
     * @return String "Household item"
     */
    @Override
    public String getCategory() {
        return "Household Item";
    }

    /**
     * Getter method for roomType
     * @return instance of String room type
     */
    public String getRoomType() {
        return this.roomType;
    }

    /**
     * Setter method for room type
     * @param roomType String
     */
    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

}

/**
 * CleaningSupply Class: Subclass of HouseholdItem
 * 1 Additional attribute: boolean isToxic
 * Inherited attributes: String name, String category, double price, int quantity, String roomType
 */
class CleaningSupply extends HouseholdItem {
    private boolean isToxic;

    /**
     * Constructor method that takes 5 parameters
     * @param name String name
     * @param category String category
     * @param price double price
     * @param quantity int quantity
     * @param roomType String roomType
     * @param isToxic boolean isToxic
     */
    public CleaningSupply(String name, String category, double price, int quantity, String returnPolicy, String roomType, boolean isToxic) {
        super(name, category, price, quantity, returnPolicy, roomType);
        this.isToxic = isToxic;

    }

    /**
     * toString method for CleaningSupply
     * Displays all parameters of HouseholdItem plus isToxic
     * Example of polymorphism
     * @return String representation of CleaningSupply
     */
    @Override
    public String toString() {
        return super.toString() + ", Is Toxic: " + isToxic;
    }

    /**
     * Method that overrides getCategory method
     * Labels every instance of cleaningSupply class as "Cleaning Supply"
     * @return String "Cleaning Supply"
     */
    @Override
    public String getCategory() {
        return "Cleaning Supply";
    }

    /**
     * Getter method for isToxic
     * @return boolean instance of isToxic
     */
    public boolean getIsToxic() {
        return this.isToxic;
    }

    /**
     * Setter method for isToxic
     * @param isToxic boolean
     */
    public void setIsToxic(boolean isToxic) {
        this.isToxic = isToxic;
    }


}

/**
 * Furniture Class: Subclass of HouseholdItem
 * 2 additional attributes: String color, String material
 * Inherited attributes: String name, String category, double price, int quantity, String roomType
 */
class Furniture extends HouseholdItem {
    private String color;
    private String material;

    /**
     * Constructor that takes 6 parameters
     * @param name String name
     * @param category String category
     * @param price double price
     * @param quantity int quantity
     * @param roomType String roomType
     * @param color String color
     * @param material String material (i.e. wood, plastic, cloth, metal)
     */
    public Furniture(String name, String category, double price, int quantity, String returnPolicy, String roomType, String color, String material) {
        super(name, category, price, quantity, returnPolicy, roomType);
        this.color = color;
        this.material = material;

    }

    /**
     * toString method for Furniture
     * Displays all parameters of HouseholdItem plus color and material
     * Example of polymorphism
     * @return String representation of Furniture
     */
    @Override
    public String toString() {
        return super.toString() + ", Color: " + color + ", Material: " + material;
    }

    /**
     * Method that overrides getCategory method
     * Labels every instance of Furniture class as "Furniture" category
     * @return String "Furniture"
     */
    @Override
    public String getCategory() {
        return "Furniture";
    }

    /**
     * Method that overrides getReturnPolicy
     * Example of polymorphism
     * @return String returnPolicy
     */
    @Override
    public String getReturnPolicy() {return "Returnable within 30 Days with Receipt"; }

    /**
     * Getter method for color
     * @return String color
     */
    public String getColor() {
        return this.color;
    }

    /**
     * Getter method for material
     * @return String material
     */
    public String getMaterial() {
        return material;
    }

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
}

