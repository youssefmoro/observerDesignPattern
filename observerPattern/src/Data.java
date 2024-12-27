import java.util.ArrayList;
import java.util.List;

public class Data {
    private int value;
    private List<Observer> observerList=new ArrayList<>();

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        notifyObservers();
    }

    public void addObserver (Observer observer)
    {
        observerList.add(observer);
    }
    public void removeObserver (Observer observer)
    {
        observerList.remove(observer);
    }
   private void notifyObservers ()
    {
        for(Observer observer:observerList)
        {
            observer.updateValue(value);
        }
    }
}
