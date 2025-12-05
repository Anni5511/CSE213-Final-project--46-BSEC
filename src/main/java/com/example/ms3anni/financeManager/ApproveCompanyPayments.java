package com.example.ms3anni.financeManager;

public class ApproveCompanyPayments {

    private String companyName,Purpose,Status;
    private int paymentId;
    private double amount;

    public ApproveCompanyPayments(String companyName, String purpose, String status, int paymentId, double amount) {
        this.companyName = companyName;
        Purpose = purpose;
        Status = status;
        this.paymentId = paymentId;
        this.amount = amount;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPurpose() {
        return Purpose;
    }

    public void setPurpose(String purpose) {
        Purpose = purpose;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "ApproveCompanyPayments{" +
                "companyName='" + companyName + '\'' +
                ", Purpose='" + Purpose + '\'' +
                ", Status='" + Status + '\'' +
                ", paymentId=" + paymentId +
                ", amount=" + amount +
                '}';
    }

    public void approveCompanyPayments(){
    }
}
