package com.example.ms3anni.financeManager;

public class FinancialReports {

    private String MonthlyReport, QuarterlyReport,AnnualReport;
    private double TotalIncome, TotalExpense, Profit, loss;

    public FinancialReports(String monthlyReport, String quarterlyReport, String annualReport, double totalIncome, double totalExpense, double profit, double loss) {
        MonthlyReport = monthlyReport;
        QuarterlyReport = quarterlyReport;
        AnnualReport = annualReport;
        TotalIncome = totalIncome;
        TotalExpense = totalExpense;
        Profit = profit;
        this.loss = loss;
    }

    public String getMonthlyReport() {
        return MonthlyReport;
    }

    public void setMonthlyReport(String monthlyReport) {
        MonthlyReport = monthlyReport;
    }

    public String getQuarterlyReport() {
        return QuarterlyReport;
    }

    public void setQuarterlyReport(String quarterlyReport) {
        QuarterlyReport = quarterlyReport;
    }

    public String getAnnualReport() {
        return AnnualReport;
    }

    public void setAnnualReport(String annualReport) {
        AnnualReport = annualReport;
    }

    public double getTotalIncome() {
        return TotalIncome;
    }

    public void setTotalIncome(double totalIncome) {
        TotalIncome = totalIncome;
    }

    public double getTotalExpense() {
        return TotalExpense;
    }

    public void setTotalExpense(double totalExpense) {
        TotalExpense = totalExpense;
    }

    public double getProfit() {
        return Profit;
    }

    public void setProfit(double profit) {
        Profit = profit;
    }

    public double getLoss() {
        return loss;
    }

    public void setLoss(double loss) {
        this.loss = loss;
    }

    @Override
    public String toString() {
        return "FinancialReports{" +
                "MonthlyReport='" + MonthlyReport + '\'' +
                ", QuarterlyReport='" + QuarterlyReport + '\'' +
                ", AnnualReport='" + AnnualReport + '\'' +
                ", TotalIncome=" + TotalIncome +
                ", TotalExpense=" + TotalExpense +
                ", Profit=" + Profit +
                ", loss=" + loss +
                '}';
    }

    public void financialReports(){
    }
}
