package abdullah.modelclasses;

public class CommissionReportItem {
    private String clientBoId;
    private int tradeValue;
    private int commissionEarned;

    public CommissionReportItem() {
    }

    public CommissionReportItem(String clientBoId, int tradeValue, int commissionEarned) {
        this.clientBoId = clientBoId;
        this.tradeValue = tradeValue;
        this.commissionEarned = commissionEarned;
    }

    public String getClientBoId() {
        return clientBoId;
    }

    public void setClientBoId(String clientBoId) {
        this.clientBoId = clientBoId;
    }

    public int getTradeValue() {
        return tradeValue;
    }

    public void setTradeValue(int tradeValue) {
        this.tradeValue = tradeValue;
    }

    public int getCommissionEarned() {
        return commissionEarned;
    }

    public void setCommissionEarned(int commissionEarned) {
        this.commissionEarned = commissionEarned;
    }

    @Override
    public String toString() {
        return "CommissionReportItem{" +
                "clientBoId='" + clientBoId + '\'' +
                ", tradeValue=" + tradeValue +
                ", commissionEarned=" + commissionEarned +
                '}';
    }
}
