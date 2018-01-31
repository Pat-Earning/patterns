package patterns.factory.specificproducts.porsche;

import patterns.factory.*;

public class Fullsize extends Carproduct {
    
    public Fullsize() {        
        make = "Porsche";
        model = "Panamera";
        description = "Porsche Panamera, the family Porsche";
    }
}