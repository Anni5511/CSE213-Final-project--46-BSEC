package com.example.ms3anni.companyRepresentative;

public class PayFees {

    private String paymentId,cardDetails;

    public PayFees(String paymentId, String cardDetails) {
        this.paymentId = paymentId;
        this.cardDetails = cardDetails;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getCardDetails() {
        return cardDetails;
    }

    public void setCardDetails(String cardDetails) {
        this.cardDetails = cardDetails;
    }

    @Override
    public String toString() {
        return "PayFees{" +
                "paymentId='" + paymentId + '\'' +
                ", cardDetails='" + cardDetails + '\'' +
                '}';
    }

    public void payfees(){

    }
}
