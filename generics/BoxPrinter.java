package com.av8242n.generics;

public class BoxPrinter<T> {

    T arg;

    public void print(T value) {
        arg = value;
        System.out.println("["+arg+"]");
    }

    public static void main(String[] args) {
        BoxPrinter<Integer> value1 = new BoxPrinter<>();
        value1.print(new Integer(10));

        BoxPrinter<String> value2 = new BoxPrinter<>();
        value2.print("Hello World");
    }


}
