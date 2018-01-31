package patterns.factory;

public abstract class Carproduct {
    
    protected String make;
    protected String model;
    protected String description;
    
    public String getDescription() {
        return  description;
    }
    
    public void testCar() {
        System.out.println("Tests passed");
    }
    
    public void wrapCar() {
        System.out.println("Car wrapped");
    }

    
    public void shipCar() {
        System.out.println("Car shipped");
    }
    
}

    