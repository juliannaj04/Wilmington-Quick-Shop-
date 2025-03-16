public class WQSAkinsJohnstonSlapshak {
    public static void main(String[] args) {
        //instances (At least 1 from each class at bottom of hierarchy)
        Fruit apple = new Fruit("Apple","Fruit",.50, 10, "03/23/25", "Brazil", "Pome");
        ShelfStable cereal = new ShelfStable("Frosted Flakes", "Shelf Stable", 2.50, 8, "05/15/27", "Canada", "Box");
        Vegetable carrot = new Vegetable("Carrot", "Vegetable", .75, 4, "03/24/25", "United States", "Root");

        CleaningSupply laundryDetergent = new CleaningSupply("Tide Pods", "Cleaning Supply", 6.00, 6, "Laundry Room", true);
        Furniture chair = new Furniture("Recliner", "Furniture", 149.99, 2, "Living Room", "Brown", "Leather");

        Laptop macbook = new Laptop("Macbook Pro", "Laptop", 600.00, 5, "Apple", 2023, 15);
        Phone iPhone = new Phone("iPhone 14", "Phone", 400.00, 7, "Apple", 2022, false, true);
        TV rokuTV = new TV("Roku TV", "TV", 150.00, 9, "Roku", 2025, 32);

        Outerwear rainJacket = new Outerwear("Rain Jacket", "Outerwear", 39.99, 12, "Blue", "polyester", "Medium", "Women's", "Columbia");
        Shirt tShirt = new Shirt("T-Shirt", "Shirt", 15.00, 18, "Green", "Cotton", "Large", "Men's", "Hanes", "Short Sleeve");
        Shoe boots = new Shoe("Cowboy Boots", "Shoes", 79.95, 4, "Brown", "Leather", "8.5", "Women's", "Frye");

        //nested arrays

        //*Foods
        FoodItem[] foods = {apple, cereal, carrot};

        //*Household
        HouseholdItem[] households = {laundryDetergent, chair};

        //*Electronics
        ElectronicsItem[] electronics = {macbook, iPhone, rokuTV};

        //*Clothing
        ClothingItem[] clothes = {rainJacket, tShirt, boots};


        //user input for add or subtract

        //add
        //display categories
        //display items
        //user input for chosen item + quantity
        //check for exiting loop
        //display updated inventory items + new quantity
        //display return policy (is returnable/is not returnable)

        //subtract
        //display categories
        //display items
        //user input for chosen item + quantity
        //check for exiting loop
        //display updated inventory items + new quantity
        //display return policy (is returnable/is not returnable)



    }
}
