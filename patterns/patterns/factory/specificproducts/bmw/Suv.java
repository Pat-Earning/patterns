package patterns.factory.specificproducts.bmw;

import patterns.factory.*;

public class Suv extends Carproduct {

    public Suv() {
        make = "BMW";
        model = "X5";
        description = "BMW X5, the MobMobile";
    }
}
