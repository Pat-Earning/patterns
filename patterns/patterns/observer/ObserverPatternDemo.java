package patterns.observer;

public class ObserverPatternDemo {    
    public static void main() {
        Tweeter tweeter = new Tweeter();
        Ticker ticker = new Ticker();
        NewsProvider newsprovider = new NewsProvider();
        
        newsprovider.registerObserver(tweeter);
        newsprovider.registerObserver(ticker);
        
        newsprovider.notifyObservers("Mariners win!");
        
        try        
        {
            Thread.sleep(2000);
        }    
        catch(InterruptedException ex) 
        {
            Thread.currentThread().interrupt();
        }
        
        newsprovider.removeObserver(ticker);
        newsprovider.notifyObservers("Patriots win!");
        
        
    }
}
