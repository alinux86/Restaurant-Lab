package org.example.apitax;

public class TaxPrivateAPI {

    private static final double TAX_RATE = 0.08;

    public static double getTax(double priceBeforeTax) {
        return priceBeforeTax * TAX_RATE;
    }

}
