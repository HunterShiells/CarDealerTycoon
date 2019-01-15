package DealerShip;
public class PassengerCar extends Vehicle {
    public PassengerCar(int p, String m, String n, int y) {
        super(p, m, n, y);
    }
    //green
    //only cars rentable
    public int Green(){
        return price - 1000;
    }

    @Override
    public String gettype() {
        return "PassengerCar";
    }
    
}
