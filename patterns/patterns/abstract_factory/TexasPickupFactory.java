package patterns.abstract_factory;

import patterns.abstract_factory.abstractparts.Chassis;
import patterns.abstract_factory.abstractparts.Engine;
import patterns.abstract_factory.abstractparts.Bedliner;
import patterns.abstract_factory.abstractparts.Wheel;
import patterns.abstract_factory.specificparts.chassis.*;
import patterns.abstract_factory.specificparts.engines.*;
import patterns.abstract_factory.specificparts.bedliners.*;
import patterns.abstract_factory.specificparts.wheels.*;

public class TexasPickupFactory implements PickupFactory {
    @Override
    public Chassis createChassis() {
        return new Pickup();
    }
    
    @Override
    public Engine createEngine() {
        return new Diesel();
    }
    
    @Override
    public Wheel createWheel() {
        return new Offroad();
    }
    
    @Override
    public Bedliner createBedliner() {
        return new Hardwood();
    }
}
