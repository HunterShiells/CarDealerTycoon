package DealerShip;
public class CarDealerShip {
    protected String name;
    protected String dealername;
    protected int Startm; 
    public CarDealerShip(String n, String dn){
        name = n;
        dealername = dn;
        Startm = 50000;
    }
    public CarDealerShip(String n, String dn, int sm){
        name = n;
        dealername = dn; 
        Startm = sm;
    }
}
