package DealerShip;
abstract public class Vehicle {
    //fuel type
    protected int price, rprice, year;
    protected int money=50000, Startingprice;
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

    public void setPrice(int p) {
        price = p;
    }
    
    public void setStartingPrice(int p){
        Startingprice = p;
    }

    public int getStartingprice() {
        return Startingprice;
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
        return year +" "+ make+ " " + model;
    }
    
    @Override
    public String toString() {
        return "The price is: $" + price + ", also Rent price is: $" + rprice + " For the " + year + " " + make + " " + model;
    }
    
}
