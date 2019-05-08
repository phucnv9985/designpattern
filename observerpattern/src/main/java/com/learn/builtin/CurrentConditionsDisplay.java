package com.learn.builtin;

import com.learn.DisplayElement;
import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Observable observable;

    public CurrentConditionsDisplay(Observable o) {
	this.observable = o;
	o.addObserver(this);
    }

    public void update(Observable o, Object arg) {
	if (o instanceof WeatherData) {
    	    this.temperature = ((WeatherData) o).getTemperature();
	    this.humidity = ((WeatherData) o).getHumidity();
	    display();
	}
    }

    public void display() {
    	System.out.println("Current Conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }
}
