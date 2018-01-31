package patterns.abstract_factory;

import patterns.abstract_factory.abstractparts.Bedliner;
import patterns.abstract_factory.abstractparts.Chassis;
import patterns.abstract_factory.abstractparts.Engine;
import patterns.abstract_factory.abstractparts.Ragtop;
import patterns.abstract_factory.abstractparts.Roofrack;
import patterns.abstract_factory.abstractparts.Wheel;

public abstract class CarProduct {
    String purpose;
    Wheel wheel;
    Chassis chassis;
    Engine engine;
    Roofrack roofrack;
    Ragtop ragtop;
    Bedliner bedliner;
    
    abstract void create();
    
    void setPurpose(String purpose) {
        this.purpose = purpose;
    }
    
    String getPurpose() {
        return purpose;
    }
    
    void describe() {
        System.out.println(chassis.getDescription());
    }
    
    void lookAtWheels() {
        System.out.println(wheel.getDescription());
    }
    
    void revUp () {
        System.out.println(engine.getDescription());
    }
}
