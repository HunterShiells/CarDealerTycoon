package DealerShip;
public class Truck extends Vehicle{
    //4w drive
    //features
    String fwd,tostring;
    //getting vehicle propeties
    public Truck(int p, String m, String n, int y) {
        super(p, m, n, y);
    }
    //finding if it is four wheel drive or not
    public Truck(int p, String m, String n, int y, String s){
        super(p, m, n, y);
        fwd = s;
    }
    //if it is fwd deduct 1500
    public int fwd(){
        return money - 1500;
    }
    //get if it is fwd or not
    @Override
    public String gettype() {
        return "Truck{" + "fwd=" + fwd + '}';
    }
    //truck toString
    @Override
    public String toString() {
        tostring = super.toString();
        return tostring + " Is it 4WD? " + fwd + " If yes, an extra 1500 cost";
    }
    //get if it is fwd
    public String getFwd() {
        return fwd;
    }
    //buy command
    @Override
    public int buy(int i) {
        if(fwd == "yes"){
            i = i +1500;
        }
        return i;
    }
}
