package de.neuefische;

public class Counter {
    private static int count = 0;
    public static final double PI = 3.14;
    private static final String API_URL = "https://www.gidf.de";

    public Counter(){
        count++;
    }

    public static int getCount(){
        return count;
    }
}
