package patterns.abstract_factory;

import patterns.abstract_factory.abstractparts.Chassis;
import patterns.abstract_factory.abstractparts.Engine;
import patterns.abstract_factory.abstractparts.Ragtop;
import patterns.abstract_factory.abstractparts.Wheel;
import patterns.abstract_factory.specificparts.chassis.*;
import patterns.abstract_factory.specificparts.engines.*;
import patterns.abstract_factory.specificparts.ragtops.*;
import patterns.abstract_factory.specificparts.wheels.*;

public class CaliforniaRoadsterFactory implements RoadsterFactory {
    @Override
    public Chassis createChassis() {
        return new Roadster();
    }
    
    @Override
    public Engine createEngine() {
        return new V8();
    }
    
    @Override
    public Wheel createWheel() {
        return new Wire();
    }
    
    @Override
    public Ragtop createRagtop() {
        return new Singlelayer();
    }
}
