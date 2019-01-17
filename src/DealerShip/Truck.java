package DealerShip;
public class Truck extends Vehicle{
    //4w drive
    //features
    String fwd,tostring;
    public Truck(int p, String m, String n, int y) {
        super(p, m, n, y);
    }
    public Truck(int p, String m, String n, int y, String s){
        super(p, m, n, y);
        fwd = s;
    }
    public int fwd(){
        return money - 1500;
    }

    @Override
    public String gettype() {
        return "Truck{" + "fwd=" + fwd + '}';
    }

    @Override
    public String toString() {
        tostring = super.toString();
        return tostring + " 4WD? " + fwd + " Meaning an extra 1500 cost";
    }

    public String getFwd() {
        return fwd;
    }

    @Override
    public int buy(int i) {
        if(fwd == "yes"){
            i = i +1500;
        }
        return i;
    }
}
