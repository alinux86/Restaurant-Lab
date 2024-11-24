package org.example.bridge;

import org.example.apitax.TaxCompanyAPI;

public class CompanyTax implements Tax {
    @Override
    public double getTax(double priceBeforeTax) {
        return TaxCompanyAPI.getTax(priceBeforeTax);
    }
}
