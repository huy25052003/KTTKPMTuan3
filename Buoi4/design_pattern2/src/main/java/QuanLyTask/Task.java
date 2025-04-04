package QuanLyTask;

import java.util.ArrayList;
import java.util.List;

public class Task implements Subject {
    private String name;
    private String status;
    private List<Observer> observers = new ArrayList<>();

    public Task(String name, String status) {
        this.name = name;
        this.status = status;
    }

    public void setStatus(String status) {
        this.status = status;
        notifyObservers();
    }

    public String getName() {
        return name;
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(name, status);
        }
    }
}

