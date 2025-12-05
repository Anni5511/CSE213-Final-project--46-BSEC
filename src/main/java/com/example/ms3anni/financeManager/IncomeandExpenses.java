package com.example.ms3anni.financeManager;

public class IncomeandExpenses {

    private String IncomeReport, ExpenseReport;
    private int year;

    public IncomeandExpenses(String incomeReport, String expenseReport, int year) {
        IncomeReport = incomeReport;
        ExpenseReport = expenseReport;
        this.year = year;
    }

    public String getIncomeReport() {
        return IncomeReport;
    }

    public void setIncomeReport(String incomeReport) {
        IncomeReport = incomeReport;
    }

    public String getExpenseReport() {
        return ExpenseReport;
    }

    public void setExpenseReport(String expenseReport) {
        ExpenseReport = expenseReport;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "IncomeandExpenses{" +
                "IncomeReport='" + IncomeReport + '\'' +
                ", ExpenseReport='" + ExpenseReport + '\'' +
                ", year=" + year +
                '}';
    }

    public void incomeAndExpenses(){
    }
}
