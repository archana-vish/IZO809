package com.av8242n.enthuware.AdvancedClassDesign;

public class Coffee implements i1, i2 {
    public static void main(String[] args) {
        System.out.println(i1.VALUE);
    }

    public void m1() {}

}

interface i1 {
    int VALUE = 1;
    void m1();
}

interface i2 {
    int VALUE = 2;
    void m1();
}


