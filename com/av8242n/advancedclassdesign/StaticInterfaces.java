package com.av8242n.advancedclassdesign;

public class StaticInterfaces {

    interface House {
        public default String getAddres() {
            return "House";
        }
    }

    interface Office {
        public static String getAddress() {
            return "Office";
        }
    }

    interface WFH extends House, Office {}

    class HomeOffice implements House, Office {
        public String getAddress() {
            return "HOmeOffice";
        }
    }


}

class Parent {
    static int name;
    public static String getSomething() {return "";}
}

class Child extends Parent {
    int name;
    public static String getSomething() { return "";}
        }

       abstract  class Someclass {
    public abstract void something();
        }