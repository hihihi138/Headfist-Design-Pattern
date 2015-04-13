package observerpattern.weather;

/**
 * Created by jqliu on 3/31/2015.
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
