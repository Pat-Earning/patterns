package patterns.composite_iterator;

import java.util.Iterator;

public abstract class PlayerComponent {

    //start with methods related to composites
    public void add(PlayerComponent playerComponent){
        throw new UnsupportedOperationException();
    }

    public void remove(PlayerComponent playerComponent){
        throw new UnsupportedOperationException();
    }

    public PlayerComponent getChild(int i){
        throw new UnsupportedOperationException();
    }

    //follow with methods related to leafs
    public String getName(){
        throw new UnsupportedOperationException();
    }

    public String getDescription(){
        throw new UnsupportedOperationException();
    }

    public void print(){
        throw new UnsupportedOperationException();
    }

    public Iterator createIterator(){
        throw new UnsupportedOperationException();
    }

}
