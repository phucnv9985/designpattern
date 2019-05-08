package com.learn;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
	/*
	WeatherData subject = new WeatherData();
	CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(subject);
	subject.setMeasurements(80, 65, 30.4f);
	subject.setMeasurements(82, 70, 29.2f);
	subject.setMeasurements(78, 90, 29.2f);
	*/
	com.learn.builtin.WeatherData subject = new com.learn.builtin.WeatherData();
	com.learn.builtin.CurrentConditionsDisplay observer = new com.learn.builtin.CurrentConditionsDisplay(subject);
	System.out.println(observer.toString());
	subject.setMeasurements(80, 65);
	subject.setMeasurements(82, 70);
	subject.setMeasurements(78, 90);
    }
}
