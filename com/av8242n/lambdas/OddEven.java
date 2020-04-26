package com.av8242n.lambdas;

public class OddEven {

    @FunctionalInterface
    public interface CheckOddEven {
        public String testOddEven(int a);
    }

    public static void main(String... args) {
        CheckOddEven checkOddEven =
                (int num) -> {
                  String result =
                    (num%2 == 0) ? "even" : "odd";
                  return result;
                };
        System.out.println(checkOddEven.testOddEven(3));
        System.out.println(checkOddEven.testOddEven(2));
    }
}
