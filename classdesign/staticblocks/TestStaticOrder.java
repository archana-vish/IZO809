package com.av8242n.classdesign.staticblocks;


class Parent {


    static {
        System.out.println("A");
    }

    {
        System.out.println("E");
    }
    static
    {
        System.out.println("B");
    }

    Parent() {
        System.out.println("F Parent Constructor");
    }
}


class Child extends  Parent {
    static {
        System.out.println("C");
    }
    {
        System.out.println("G");
    }
    static
    {
        System.out.println("D");
    }
    Child() {
        System.out.println("H Child Constructor");
    }
}

public class TestStaticOrder {

    public static void main(String... args) {
        Parent obj = new Child();

    }
}
