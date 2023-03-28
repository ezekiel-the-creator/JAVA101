package org.javamoney;

public class Main {
    public static void main(String[] args) {
        double amount = 100;
        String fromCurrency = "USD";
        String toCurrency = "EUR";
        double convertedAmount = CurrencyConverter.convert(fromCurrency, amount, toCurrency);
        System.out.println(amount + " " + fromCurrency + " = " + convertedAmount + " " + toCurrency);
    }
}
