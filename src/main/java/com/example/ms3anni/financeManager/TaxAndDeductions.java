package com.example.ms3anni.financeManager;

public class TaxAndDeductions {

    private String companyId;
    private int taxYear;
    private double taxAmount;

    public TaxAndDeductions(String companyId, int taxYear, double taxAmount) {
        this.companyId = companyId;
        this.taxYear = taxYear;
        this.taxAmount = taxAmount;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public int getTaxYear() {
        return taxYear;
    }

    public void setTaxYear(int taxYear) {
        this.taxYear = taxYear;
    }

    public double getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(double taxAmount) {
        this.taxAmount = taxAmount;
    }

    @Override
    public String toString() {
        return "TaxAndDeductions{" +
                "companyId='" + companyId + '\'' +
                ", taxYear=" + taxYear +
                ", taxAmount=" + taxAmount +
                '}';
    }

    public void taxAndDeductions(){
    }
}
