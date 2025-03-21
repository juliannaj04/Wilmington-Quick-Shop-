/**
 * CSC 331 - 003
 * @author Cal Akins, Julianna Johnston, Zoe Slapshak
 * Due Date: 03/20/25
 * Purpose: Create an inventory system for "Wilmington Quick Shop" that incorporates inheritance and polymorphism
 */

/**
 * ElectronicsItem Class: Subclass of Store Item
 * 2 additional attributes: String brand, int year
 * Inherited attributes: String name, String category, double price, int quantity
 */
class ElectronicsItem extends StoreItem {
    private String brand;
    private int year;


    /**
     * Constructor method with 5 attributes as parameters
     * @param name String name
     * @param category String category
     * @param price double price
     * @param quantity int quantity
     * @param brand String brand (i.e. Samsung, Apple, Roku)
     * @param year int year - the year the item came out
     */
    public ElectronicsItem(String name, String category, double price, int quantity, String returnPolicy, String brand, int year) {
        super(name, category, price, quantity, returnPolicy);
        this.brand = brand;
        this.year = year;

    }

    /**
     * toString method for ElectronicsItem
     * Displays parameters for StoreItem plus brand and year
     * Example of polymorphism
     * @return String representation of ElectronicsItem
     */
    @Override
    public String toString() {
        return super.toString() + ", Brand: " + brand + ", Year: " + year;
    }

    /**
     * Method that overrides getCategory method
     * Labels instance of ElectronicsItem as "Electronics"
     * Example of polymorphism
     * @return String "Electronics"
     */
    @Override
    public String getCategory() {
        return "Electronics";
    }

    /**
     * Getter method for brand
     * @return String brand
     */
    public String getBrand() {
        return this.brand;
    }

    /**
     * Getter method for year
     * @return int year it came out
     */
    public int getYear() {
        return this.year;

    }

    /**
     * Setter method for brand
     * @param brand String
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Setter method for year
     * @param year int
     */
    public void setYear(int year) {
        this.year = year;
    }

}

/**
 * Class TV: Subclass of ElectronicsItem
 * 1 Additional attribute: int screenSize
 * Inherited attributes: String name, String category, double price, int quantity, String brand, int year
 */
class TV extends ElectronicsItem {
    private int screenSize;

    /**
     * Constructor method that takes 5 parameters
     * @param name String
     * @param category String
     * @param price double
     * @param quantity int quantity
     * @param brand String
     * @param year int
     * @param screenSize int - screen size in inches
     *
     */
    public TV(String name, String category, double price, int quantity, String returnPolicy, String brand, int year, int screenSize) {
        super(name, category, price, quantity,returnPolicy, brand, year);
        this.screenSize = screenSize;

    }

    /**
     * toString method for TV
     * displays all attributes in ElectronicsItem plus screenSize
     * Example of polymorphism
     * @return String representation of TV
     */
    @Override
    public String toString() {
        return super.toString() + ", Screen Size" + screenSize;

    }

    /**
     * Method that overrides getCategory method
     * Labels every instance of TV class as category "TV"
     * @return String "TV"
     */
    @Override
    public String getCategory() {
        return "TV";
    }

    /**
     * Getter method for screenSize
     * @return instance of int screenSize
     */
    public int getScreenSize() {
        return this.screenSize;
    }

    /**
     * Setter method for screenSize
     * @param screenSize int
     */
    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }
}

/**
 * Phone Class: Subclass of ElectronicsItem
 * 2 Additional attributes: boolean isLandline, boolean isCellphone
 * Inherited attributes: String name, String category, double price, int quantity, String brand, int year
 */
class Phone extends ElectronicsItem {
    private boolean isLandline;
    private boolean isCellphone;

    /**
     * Constructor method that takes 7 parameters
     * @param name String
     * @param category String
     * @param price double
     * @param brand String
     * @param year int
     * @param quantity int
     * @param isLandline boolean
     * @param isCellphone boolean
     */
    public Phone(String name, String category, double price, int quantity,String returnPolicy, String brand, int year, boolean isLandline, boolean isCellphone) {
        super(name, category, price, quantity,returnPolicy, brand, year);
        this.isLandline = isLandline;
        this.isCellphone = isCellphone;

    }

    /**
     * toString method for Phone
     * Displays all parameters of ElectronicsItem plus isLandline and isCellphone
     * Example of polymorphism
     * @return String representation of Phone
     */
    @Override
    public String toString() {
        return super.toString() + ", Is Landline: " + isLandline + ", Is Cellphone: " + isCellphone;
    }

    /**
     * Method that overrides getCategory method
     * Labels every instance of Phone class as "Phone" category
     * Example of polymorphism
     * @return String "Phone"
     */
    @Override
    public String getCategory() {
        return "Phone";
    }

    /**
     * Getter method for isLandline
     * @return boolean - True if phone is landline; False otherwise
     */
    public boolean getIsLandline() {
        return this.isLandline;
    }

    /**
     * Getter method for isCellphone
     * @return boolean - True if phone is cellphone; False otherwise
     */
    public boolean isCellphone() {
        return isCellphone;
    }

    /**
     * Setter method for isLandline
     * @param isLandline boolean
     */
    public void setIsLandline(boolean isLandline) {
        this.isLandline = isLandline;
    }

    /**
     * Setter method for isCellphone
     * @param isCellphone boolean
     */
    public void setIsCellphone(boolean isCellphone) {
        this.isCellphone = isCellphone;
    }
}

/**
 * Laptop Class: Subclass of ElectronicsItem
 * 1 additional attribute: String screenSize
 * Inherited attributes: String name, String category, double price, int quantity, String brand, int year
 */
class Laptop extends ElectronicsItem {
    private int screenSize;

    /**
     * Constructor that takes 6 parameters
     * @param name String
     * @param category String
     * @param price double
     * @param quantity int
     * @param brand String
     * @param year int
     * @param screenSize int - screen size in inches
     */
    public Laptop(String name, String category, double price, int quantity, String returnPolicy, String brand, int year, int screenSize) {
        super(name, category, price, quantity, returnPolicy, brand, year);
        this.screenSize = screenSize;

    }

    /**
     * toString method for Laptop
     * Displays all parameters of ElectronicsItem plus screenSize
     * Example of polymorphism
     * @return String representation of Laptop
     */
    @Override
    public String toString() {
        return super.toString() + ", Screen Size: " + screenSize;
    }

    /**
     * Method that overrides getCategory method
     * Labels every instance of Laptop class as "Laptop" category
     * Example of polymorphism
     * @return String "Laptop"
     */
    @Override
    public String getCategory() {
        return "Laptop";
    }

    /**
     * Getter method for screenSize
     * @return screenSize as an int (i.e. 15, 12)
     */
    public int getScreenSize() {
        return this.screenSize;
    }

    /**
     * Setter method for screenSize
     * @param screenSize String
     */
    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    
}


