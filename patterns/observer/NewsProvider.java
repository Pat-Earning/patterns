package patterns.observer;

import java.util.ArrayList;

public class NewsProvider implements Subject {
   // private int state;
    //private ArrayList observers;
    ArrayList<Observer> observers = new ArrayList<Observer>();
    
//    public NewsProvider() {
  //      observers = new ArrayList<Observer>;
    //}
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }
    
    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i>=0) {
            observers.remove(i);
        }       
    }
    
    @Override
    public void notifyObservers(String news) {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(news);
        }
    }
    
}
