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
     * @param brand String brand (i.e. Samsung, Apple, Roku)
     * @param year int year - the year the item came out
     */
    public ElectronicsItem(String name, String category, double price, String brand, int year) {
        super(name, category, price);
        this.brand = brand;
        this.year = year;

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
 * No additional attributes
 * Inherited attributes: String name, String category, double price, int quantity, String brand, int year
 */
class TV extends ElectronicsItem {

    /**
     * Constructor method that takes 5 parameters
     * @param name String
     * @param category String
     * @param price double
     * @param brand String
     * @param year int
     */
    public TV(String name, String category, double price, String brand, int year) {
        super(name, category, price, brand, year);

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
     * @param isLandline boolean
     * @param isCellphone boolean
     */
    public Phone(String name, String category, double price, String brand, int year, boolean isLandline, boolean isCellphone) {
        super(name, category, price, brand, year);
        this.isLandline = isLandline;
        this.isCellphone = isCellphone;

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
     * @param brand String
     * @param year int
     * @param screenSize int
     */
    public Laptop(String name, String category, double price, String brand, int year, int screenSize) {
        super(name, category, price, brand, year);
        this.screenSize = screenSize;

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


