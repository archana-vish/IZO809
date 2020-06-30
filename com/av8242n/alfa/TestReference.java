package com.av8242n.alfa;

import java.util.ArrayList;
import java.util.List;

public class TestReference {

    class BankDetails {
        int id;
        String name;

        BankDetails(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "BankDetails{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        TestReference testReference = new TestReference();
        List<BankDetails> bankDetailsList = testReference.addBankDetails();
        testReference.changeMethod(bankDetailsList);
        System.out.println(bankDetailsList);

    }

    public List<BankDetails> addBankDetails() {
        List<BankDetails> bankDetailsList = new ArrayList<>();
        BankDetails one = new BankDetails(1, "One");
        BankDetails two = new BankDetails(2, "Two");
        bankDetailsList.add(one); bankDetailsList.add(two);
        return bankDetailsList;
    }

    public void changeMethod(List<BankDetails> bankDetailsList) {
            bankDetailsList.get(0).name = "1 mod";
    }
}
