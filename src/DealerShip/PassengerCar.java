package DealerShip;
public class PassengerCar extends Vehicle {
    String isgreen, tostring;
    //get the vehicle properties
    public PassengerCar(int p, String m, String n, int y) {
        super(p, m, n, y);
    }
    //get vehicles properties and if it is green or not
    public PassengerCar(int p, String m, String n, int y, String g){
        super(p, m, n, y);
        isgreen = g;
    }
    //green
    //if it is green deduct by 1000
    public int Green(){
        return money - 1000;
    }
    //get the type
    @Override
    public String gettype() {
        return "PassengerCar";
    }
    //get if it is green or not
    public String getgreen() {
        return isgreen;
    }
    //edit the to string
    @Override
    public String toString() {
        tostring = super.toString();
        return tostring +  " Is this car Green?: " + isgreen + " If yes, a 1000 dollar rebate is applied";
    }
    //buy command
    @Override
    public int buy(int i) {
        if(isgreen == "yes"){
            i = i -1000;
        }
        return i;
    }
    
}
