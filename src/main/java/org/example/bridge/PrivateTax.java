package org.example.bridge;

import org.example.apitax.TaxPrivateAPI;

public class PrivateTax implements Tax{
    @Override
    public double getTax(double priceBeforeTax) {
        return TaxPrivateAPI.getTax(priceBeforeTax);
    }
}
