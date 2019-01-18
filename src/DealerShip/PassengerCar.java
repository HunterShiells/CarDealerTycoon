package DealerShip;
public class PassengerCar extends Vehicle {
    String isgreen, tostring;
    public PassengerCar(int p, String m, String n, int y) {
        super(p, m, n, y);
    }
    public PassengerCar(int p, String m, String n, int y, String g){
        super(p, m, n, y);
        isgreen = g;
    }
    //green
    //only cars rentable
    public int Green(){
        return money - 1000;
    }

    @Override
    public String gettype() {
        return "PassengerCar";
    }

    public String getgreen() {
        return isgreen;
    }

    @Override
    public String toString() {
        tostring = super.toString();
        return tostring +  "Is this car Green?: " + isgreen + " If yes, a 1000 dollar rebate is applied";
    }

    @Override
    public int buy(int i) {
        if(isgreen == "yes"){
            i = i -1000;
        }
        return i;
    }
    
}
