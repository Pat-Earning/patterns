package patterns.abstract_factory;

import patterns.abstract_factory.abstractparts.Chassis;
import patterns.abstract_factory.abstractparts.Engine;
import patterns.abstract_factory.abstractparts.Ragtop;
import patterns.abstract_factory.abstractparts.Wheel;

public interface RoadsterFactory {
    public Wheel createWheel();
    public Chassis createChassis();
    public Engine createEngine();
    public Ragtop createRagtop();
    
}
