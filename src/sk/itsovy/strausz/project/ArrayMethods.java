package sk.itsovy.strausz.project;

import jdk.jshell.spi.ExecutionControl;

public interface ArrayMethods {

    public double getAverageValue();

    public int min();

    public int max();

    public int min2() throws ExecutionControl.NotImplementedException; //volatile

    public int max2(); //volatile

    public void generateValues(int a,int b);

    public boolean contains(int value);

    public int countOfValues(int value); //kolkokrat tam je

    public int countOfEvenValues();

    public void incrementValues(); // zvysi cisla o 1

    public void sort (boolean asc); // true = vzostupne

    public void addItem(int newValue);

    public void addItem(int newValue, int position); // volatile

    public int[] copy();

    public int getItem(int position);



}
