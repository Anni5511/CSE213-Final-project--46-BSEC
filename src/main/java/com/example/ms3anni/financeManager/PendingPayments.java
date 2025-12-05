package com.example.ms3anni.financeManager;

public class PendingPayments {

    private String paymentId, companyName, purpose, status;
    private double amount;

    public PendingPayments(String paymentId, String companyName, String purpose, String status, double amount) {
        this.paymentId = paymentId;
        this.companyName = companyName;
        this.purpose = purpose;
        this.status = status;
        this.amount = amount;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "PendingPayments{" +
                "paymentId='" + paymentId + '\'' +
                ", companyName='" + companyName + '\'' +
                ", purpose='" + purpose + '\'' +
                ", status='" + status + '\'' +
                ", amount=" + amount +
                '}';
    }

    public void pendingPayments(){
    }
}
