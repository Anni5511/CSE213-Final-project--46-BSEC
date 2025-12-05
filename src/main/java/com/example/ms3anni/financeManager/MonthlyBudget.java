package com.example.ms3anni.financeManager;

public class MonthlyBudget {

    private String month, totalBalance;
    private double estimatedIncome, estimatedExoense;

    public MonthlyBudget(String month, String totalBalance, double estimatedIncome, double estimatedExoense) {
        this.month = month;
        this.totalBalance = totalBalance;
        this.estimatedIncome = estimatedIncome;
        this.estimatedExoense = estimatedExoense;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(String totalBalance) {
        this.totalBalance = totalBalance;
    }

    public double getEstimatedIncome() {
        return estimatedIncome;
    }

    public void setEstimatedIncome(double estimatedIncome) {
        this.estimatedIncome = estimatedIncome;
    }

    public double getEstimatedExoense() {
        return estimatedExoense;
    }

    public void setEstimatedExoense(double estimatedExoense) {
        this.estimatedExoense = estimatedExoense;
    }

    @Override
    public String toString() {
        return "MonthlyBudget{" +
                "month='" + month + '\'' +
                ", totalBalance='" + totalBalance + '\'' +
                ", estimatedIncome=" + estimatedIncome +
                ", estimatedExoense=" + estimatedExoense +
                '}';
    }

    public void monthlyBudget(){
    }
}
