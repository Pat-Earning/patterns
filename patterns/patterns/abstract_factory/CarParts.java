package patterns.abstract_factory;

import patterns.abstract_factory.abstractparts.Bedliner;
import patterns.abstract_factory.abstractparts.Chassis;
import patterns.abstract_factory.abstractparts.Engine;
import patterns.abstract_factory.abstractparts.Ragtop;
import patterns.abstract_factory.abstractparts.Roofrack;
import patterns.abstract_factory.abstractparts.Wheel;

public interface CarParts {
    
    public Wheel createWheel();
    public Chassis createChassis(String type);
    public Engine createEngine();
    public Roofrack createRoofrack();
    public Ragtop createRagtop();
    public Bedliner createBedliner();
}
