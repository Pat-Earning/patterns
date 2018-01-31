package patterns.composite_iterator;

import java.util.Iterator;

public class PlayerLeaf extends PlayerComponent {
    String name;
    String description;

    public PlayerLeaf(String name, String description){
        this.name = name;
        this.description = description;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void print() {
        System.out.println("The " + getName() + " - " + getDescription());
    }

    @Override
    public Iterator createIterator() {
        return new NullIterator();
    }
}
