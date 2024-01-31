package de.neuefische;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Counter counter2 = new Counter();
        Counter counter3 = new Counter();
        System.out.println(Counter.getCount());
        System.out.println(Counter.PI);
    }

    public static int sum(int a, int b){
        return a+b;
    }
}