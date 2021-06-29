package com.android.fragment;

import java.util.ArrayList;
import java.util.List;

public class Publisher {

    private List<Observer> observers;  //All observes

    public Publisher() {
        observers = new ArrayList<>();
    }

    //subscribe
    public void subscribe(Observer observer) {
        observer.add(observer);
    }

    //unsubscribe
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    //send out stick
    public void  notify(String text) {
        for (Observer observer: observers) {
            observer.updateText(text);
        }
    }

}
