package DealerShip;
abstract public class Vehicle {
    //fuel type
    protected int price, rprice, year;
    protected int money=50000;
    protected String  make, model;
    protected static int insurance=100;
    
    public Vehicle(int p, String m, String n, int y){
        price = p;
        make = m;
        model = n;
        year = y;
        rprice = 100;
    }
    
    public Vehicle(int p,int rp, String m, String n, int y){
        price = p;
        make = m;
        model = n;
        year = y;
        rprice = rp;
    }

    final public int getPrice() {
        return price;
    }

    final public int getYear() {
        return year;
    }

    final public String getMake() {
        return make;
    }

    final public String getModel() {
        return model;
    }
    public static int getInsurance(){
        return insurance;
    }
    final public int getrent(){
        return rprice;
    }
    
    abstract public int buy(int i);
    
    public abstract String gettype();
    
    public String sum(){
        return "Make: " + make + " Model: " + model + " Year: " + year;
    }
    
    @Override
    public String toString() {
        return "Vehicle{" + "price: " + price + ", rentprice: " + rprice + ", year: " + year + ", make: " + make + ", model: " + model + '}';
    }
    
}
