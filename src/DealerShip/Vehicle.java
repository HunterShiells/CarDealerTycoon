package DealerShip;
abstract public class Vehicle implements Comparable {
    //fuel type
    protected int price, rprice, year;
    protected int money=50000, Startingprice;
    protected String  make, model;
    protected static int insurance=100;
    //set vehicle properties
    public Vehicle(int p, String m, String n, int y){
        price = p;
        make = m;
        model = n;
        year = y;
        rprice = 100;
    }
    //set vehicle properties with rent
    public Vehicle(int p,int rp, String m, String n, int y){
        price = p;
        make = m;
        model = n;
        year = y;
        rprice = rp;
    }
    //get price
    final public int getPrice() {
        return price;
    }
    //get year
    final public int getYear() {
        return year;
    }
    //set price
    public void setPrice(int p) {
        price = p;
    }
    //set vehicle starting price used fro rent
    public void setStartingPrice(int p){
        Startingprice = p;
    }
    //getting starting price for restore
    public int getStartingprice() {
        return Startingprice;
    }
    //get the make
    final public String getMake() {
        return make;
    }
    //get model 
    final public String getModel() {
        return model;
    }
    //get the insurance
    public static int getInsurance(){
        return insurance;
    }
    //get the rent
    final public int getrent(){
        return rprice;
    }
    //buy command
    abstract public int buy(int i);
    //get vehicle type
    public abstract String gettype();
    //text summary
    public String sum(){
        return year +" "+ make+ " " + model;
    }
    //to string
    @Override
    public String toString() {
        return "The price is: $" + price + ", also Rent price is: $" + rprice + " For the " + year + " " + make + " " + model;
    }
    //compareTo used to compare the car makes and order them into a proper order
    @Override
    public int compareTo(Object o) {
        String othmak = ((Vehicle)o).getMake();
        return this.make.compareTo(othmak);
    }
    
}
