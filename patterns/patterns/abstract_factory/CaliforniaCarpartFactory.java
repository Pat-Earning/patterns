package patterns.abstract_factory;

import patterns.abstract_factory.abstractparts.Bedliner;
import patterns.abstract_factory.abstractparts.Chassis;
import patterns.abstract_factory.abstractparts.Engine;
import patterns.abstract_factory.abstractparts.Ragtop;
import patterns.abstract_factory.abstractparts.Roofrack;
import patterns.abstract_factory.abstractparts.Wheel;
import patterns.abstract_factory.specificparts.bedliners.*;
import patterns.abstract_factory.specificparts.chassis.*;
import patterns.abstract_factory.specificparts.engines.*;
import patterns.abstract_factory.specificparts.ragtops.*;
import patterns.abstract_factory.specificparts.roofrack.*;
import patterns.abstract_factory.specificparts.wheels.*;

public class CaliforniaCarpartFactory implements CarParts {
    @Override
    public Bedliner createBedliner() {
        return new Hardwood();
    }
    
    @Override
    public Chassis createChassis(String type) {
        //if (type.equals("roadster"))
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public Engine createEngine() {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public Ragtop createRagtop() {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public Roofrack createRoofrack() {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public Wheel createWheel() {
        // TODO Auto-generated method stub
        return null;
    }
}
