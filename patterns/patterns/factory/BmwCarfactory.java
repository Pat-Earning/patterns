package patterns.factory;

import patterns.factory.specificproducts.bmw.*;

public class BmwCarfactory extends Carfactory{
    @Override
    protected Carproduct createCar(String type) {

        if (type.equals("fullsize")) {
            return new Fullsize();            
        } else if  (type.equals("sport")) {
            return new Sport();
        } else if  (type.equals("suv")) {
            return new Suv();
        } else return null;

    }
}
