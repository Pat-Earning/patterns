package patterns.observer;

public class Tweeter implements Observer {
    
    @Override
    public void update(String news) {
        System.out.println("FYI: " + news);
    }
}
