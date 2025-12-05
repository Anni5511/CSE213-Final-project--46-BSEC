package com.example.ms3anni.companyRepresentative;

public class CompanyListing {

    private String CompanyName;
    private int RegistrationNumber;

    public CompanyListing(String companyName, int registrationNumber) {
        CompanyName = companyName;
        RegistrationNumber = registrationNumber;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public int getRegistrationNumber() {
        return RegistrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        RegistrationNumber = registrationNumber;
    }

    @Override
    public String toString() {
        return "CompanyListing{" +
                "CompanyName='" + CompanyName + '\'' +
                ", RegistrationNumber=" + RegistrationNumber +
                '}';
    }

    public void companyListing(){

    }
}
