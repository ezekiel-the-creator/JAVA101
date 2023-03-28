package org.javamoney;
import javax.money.CurrencyConverter;
import javax.money.Monetary;
import javax.money.MonetaryAmount;
import javax.money.convert.CurrencyConversion;
import javax.money.convert.MonetaryConversions;

/**
 * converter
 *
 */
public class CurrencyConverter{
    
    public static double convert(String fromCurrencyCode, double amount, String toCurrencyCode){
        CurrencyUnit fromCurrency = Monetary.getCurrency(fromCurrencyCode);
        CurrencyUnit toCurrency = Monetary.getCurrency(toCurrencyCode);
        MonetaryAmount fromAmount = Monetary.getDefaultAmountAmountFactory().setCurrency(fromCurrency).setNumber(amount).create();
        CurrencyConversion conversion = MonetaryConversions.getConversion(toCurrencyCode);
        MonetaryAmount toAmount = fromAmount.with(conversion);
        return toAmount.getNumber().doubleValueExact();
    }
}