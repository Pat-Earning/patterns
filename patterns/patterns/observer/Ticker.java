package patterns.observer;

public class Ticker implements Observer {
    @Override
    public void update(String news) {
        System.out.println("Breaking News: " + news);
    }
}
