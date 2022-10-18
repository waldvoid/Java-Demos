public class Product {

    // How to use constructor 2 - Another way to build constructor function with necessary variables
    // LET'S OVERLOAD! SO WE CAN USE 2 DIFFERENT WAY AT THE SAME TIME
    public Product (int id, String name, String description, double price, int stock, String color) {
        System.out.println("Constructor function is working successfully");
        this._id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.color = color;
        this.stock = stock;
    }

    public Product() {
    }
    // attribute or field section
    private int _id;
    private String name;
    private String description;
    private double price;
    private int stock;
    private String color;
    private String specialCode;

    // original has _ and the copy has not, so we don't deal with this. method - this is one way
    public int getId() {
        // read-only access granted
        return _id;
    }

    // If you use this. method you can access class field - this is another way


    public void setId(int id) {
        _id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSpecialCode() {
        return this.name.substring(0,1) + this._id;
    }

    // if you don't want anyone to change special code just remove set
    /*public void setSpecialCode(String specialCode) {
        this.specialCode = specialCode;
    } */
}
