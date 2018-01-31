package patterns.composite_iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class PlayerComposite extends PlayerComponent {
    ArrayList playerComponents = new ArrayList();
    String name;
    String description;

    public PlayerComposite(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(PlayerComponent playerComponent) {
        playerComponents.add(playerComponent);
    }

    @Override
    public void remove(PlayerComponent playerComponent) {
        playerComponents.remove(playerComponent);
    }

    @Override
    public PlayerComponent getChild(int i) {
        return (PlayerComponent) playerComponents.get(i);
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
        System.out.println("\n" + getName() + " Players");
        System.out.println(getDescription());
        System.out.println("----------------");

        Iterator iterator = playerComponents.iterator();
        while (iterator.hasNext()){
            PlayerComponent playerComponent = (PlayerComponent) iterator.next();
            playerComponent.print();
        }
    }

    @Override
    public Iterator createIterator() {
        return new CompositeIterator(playerComponents.iterator(),name);
    }
}
