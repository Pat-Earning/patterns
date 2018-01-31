package patterns.factory.specificproducts.bmw;

import patterns.factory.*;

public class Fullsize extends Carproduct {
    
    public Fullsize() {        
        make = "BMW";
        model = "7 Series";
        description = "BMW 740, the choice of CEOs";
    }
}