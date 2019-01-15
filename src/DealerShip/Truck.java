package DealerShip;
public class Truck extends Vehicle{
    //4w drive
    //features
    public Truck(int p, String m, String n, int y) {
        super(p, m, n, y);
    }
    public int fwd(){
        return price + 1500;
    }

    @Override
    public String gettype() {
        return "Truck";
    }
}
