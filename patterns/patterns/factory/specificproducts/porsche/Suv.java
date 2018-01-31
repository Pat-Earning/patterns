package patterns.factory.specificproducts.porsche;

import patterns.factory.*;

public class Suv extends Carproduct {

    public Suv() {
        make = "Porsche";
        model = "Cayenne";
        description = "Porsche Cayenne, the moneymaker";
    }
}
