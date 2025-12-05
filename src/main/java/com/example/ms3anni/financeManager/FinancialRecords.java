package com.example.ms3anni.financeManager;

public class FinancialRecords {

    private String managerId, department,Description;
    private int date, amount, securityLevel;

    public FinancialRecords(String managerId, String department, String description, int date, int amount, int securityLevel) {
        this.managerId = managerId;
        this.department = department;
        Description = description;
        this.date = date;
        this.amount = amount;
        this.securityLevel = securityLevel;
    }

    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getSecurityLevel() {
        return securityLevel;
    }

    public void setSecurityLevel(int securityLevel) {
        this.securityLevel = securityLevel;
    }

    @Override
    public String toString() {
        return "FinancialRecords{" +
                "managerId='" + managerId + '\'' +
                ", department='" + department + '\'' +
                ", Description='" + Description + '\'' +
                ", date=" + date +
                ", amount=" + amount +
                ", securityLevel=" + securityLevel +
                '}';
    }

    public void financialRecords(){
    }
}
