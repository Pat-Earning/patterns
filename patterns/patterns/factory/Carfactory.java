// This is the abstract creator class.
// The factory method createCar is abstract that the subclasses implement to produce products.
// Concreate creators are BmwCarfactory and PorscheCarfactory.

package patterns.factory;

public abstract class Carfactory {
    
    public Carproduct produceCar(String type) {
        Carproduct car;
        
        car = createCar(type);
        car.testCar();
        car.wrapCar();
        car.shipCar();
        car.getDescription();
        return car;
        
    }
    
    protected abstract Carproduct createCar(String type);
}
