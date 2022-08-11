package lab9;

import java.util.ArrayList;
import java.util.List;

/**
 * Persists sensor data. Observable, its observers are notified when data is added it to.
 */

public class DataRepository implements Observable {
    // TODO make this an Observable
    private List<Observer> observers = new ArrayList<>();
    public static List<SensorData> sensorDataList = new ArrayList<>();
    public static int stepsChange;
    public static long timeChange;

    public void addData(SensorData dataRecord){
        sensorDataList.add(dataRecord);
        stepsChange = dataRecord.getStepsCount();
        timeChange = dataRecord.getTimestamp();
        notifyObservers();
    }

    @Override
    public void register(Observer observer) {
        if(!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update();
        }
    }

    public static List<SensorData> getStoredData() {
        return  sensorDataList;
    }
}
