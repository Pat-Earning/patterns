package patterns.abstract_factory;

import patterns.abstract_factory.abstractparts.Chassis;
import patterns.abstract_factory.abstractparts.Engine;
import patterns.abstract_factory.abstractparts.Bedliner;
import patterns.abstract_factory.abstractparts.Wheel;

public interface PickupFactory {
    public Wheel createWheel();
    public Chassis createChassis();
    public Engine createEngine();
    public Bedliner createBedliner();
    
}
