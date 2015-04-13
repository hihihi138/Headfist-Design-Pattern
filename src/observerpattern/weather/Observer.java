package observerpattern.weather;

/**
 * Created by jqliu on 3/31/2015.
 */
public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
