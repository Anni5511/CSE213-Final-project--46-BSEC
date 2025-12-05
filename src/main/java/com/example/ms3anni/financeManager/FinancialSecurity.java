package com.example.ms3anni.financeManager;

public class FinancialSecurity {

    private String password;
    private boolean twoStepVerification, dataBackup;

    public FinancialSecurity(String password, boolean twoStepVerification, boolean dataBackup) {
        this.password = password;
        this.twoStepVerification = twoStepVerification;
        this.dataBackup = dataBackup;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isTwoStepVerification() {
        return twoStepVerification;
    }

    public void setTwoStepVerification(boolean twoStepVerification) {
        this.twoStepVerification = twoStepVerification;
    }

    public boolean isDataBackup() {
        return dataBackup;
    }

    public void setDataBackup(boolean dataBackup) {
        this.dataBackup = dataBackup;
    }

    @Override
    public String toString() {
        return "FinancialSecurity{" +
                "password='" + password + '\'' +
                ", twoStepVerification=" + twoStepVerification +
                ", dataBackup=" + dataBackup +
                '}';
    }

    public void financialSecurity(){
    }
}
