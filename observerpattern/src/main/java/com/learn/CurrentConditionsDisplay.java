package com.learn;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject subject;

    public CurrentConditionsDisplay(Subject subject) {
	this.subject = subject;
	subject.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
    	this.temperature = temperature;
	this.humidity = humidity;
	display();
    }

    public void display() {
    	System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }
}
