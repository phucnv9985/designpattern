package com.learn;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
	WeatherData subject = new WeatherData();
	CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(subject);
	subject.setMeasurements(80, 65, 30.4f);
	subject.setMeasurements(82, 70, 29.2f);
	subject.setMeasurements(78, 90, 29.2f);
    }
}
