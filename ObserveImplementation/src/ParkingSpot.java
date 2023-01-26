import java.util.HashSet;
import java.util.Set;

public class ParkingSpot implements Subject{
    private Set<Observer> observers = new HashSet<>();
    @Override
    public void addObserver(Observer observer) {
    observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);

    }

    @Override
    public void notifyObservers(String message) {
for (Observer observer: observers){
    observer.update(message);
}
    }
}
