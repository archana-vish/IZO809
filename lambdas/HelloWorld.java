package com.av8242n.lambdas;

public class HelloWorld {

    @FunctionalInterface
    interface HelloWorldFunction {
        public void greet();
    }

    public static void main(String[] args) {
        HelloWorldFunction helloWorldFunction =
                () ->  System.out.println("Hello World") ;
        helloWorldFunction.greet();
    }
}
