package com.av8242n.lambdas;

import java.time.LocalDate;
import java.util.function.Supplier;

public class SupplierTest {
    public static void main(String[] args) {
        Supplier<String> supplierTest = () -> {
            return LocalDate.now().toString();
        };
        System.out.println(supplierTest.get());
    }
}
