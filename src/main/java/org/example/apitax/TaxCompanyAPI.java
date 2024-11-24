package org.example.apitax;

public class TaxCompanyAPI {
    private static final double TAX_RATE = 0.02;

    public static double getTax(double priceBeforeTax) {
        return priceBeforeTax * TAX_RATE;
    }
}
