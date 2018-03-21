package com.av8242n.classdesign.singletons;

public class MySingleton {
    private MySingleton() {
        System.out.println("Singleton created");
    }

    public static class MyInnerClass {

        public static MySingleton mySingleton = new MySingleton();

        public static MySingleton getSingleton() {
             return mySingleton;
        }
    }

}


class TestClass {

    public static void main(String... args) {
        MySingleton singleton1 = new MySingleton.MyInnerClass().getSingleton();
        MySingleton singleton2 = new MySingleton.MyInnerClass().getSingleton();

    }
}
