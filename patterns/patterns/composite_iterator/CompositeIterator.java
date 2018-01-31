package patterns.composite_iterator;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator {
    Stack stackOfPlayerCompositeIterators = new Stack();

    public CompositeIterator(Iterator iterator, String name){
        stackOfPlayerCompositeIterators.push(iterator);
        System.out.println("Pushed in stack in constructor: " + name);
    }

    @Override
    public Object next() {
        if (hasNext()){
            Iterator iterator = (Iterator) stackOfPlayerCompositeIterators.peek();
            PlayerComponent component = (PlayerComponent) iterator.next();
            if (component instanceof PlayerComposite){
                stackOfPlayerCompositeIterators.push(component.createIterator());
                System.out.println("Pushed in stack: " + component.getName());
            }
            return component;
        } else {
            System.out.println("next = false");
            return null;
        }
    }

    @Override
    public boolean hasNext() {
        if (stackOfPlayerCompositeIterators.empty()) {
            System.out.println("stack empty");
            return false;
        } else {
            Iterator iterator = (Iterator) stackOfPlayerCompositeIterators.peek();
            if(!iterator.hasNext()){
                stackOfPlayerCompositeIterators.pop();
                System.out.println("iterator popped from stack");
                return hasNext();
            } else {
                return true;
            }
        }
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
