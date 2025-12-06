package abdullah.modelclasses;

import java.time.LocalDate;

public class ExecutedTrade {
    private String tradeId;
    private String stockCode;
    private int quantity;
    private double price;
    private LocalDate date;

    public ExecutedTrade() {
    }

    public ExecutedTrade(String tradeId, String stockCode, int quantity, double price, LocalDate date) {
        this.tradeId = tradeId;
        this.stockCode = stockCode;
        this.quantity = quantity;
        this.price = price;
        this.date = date;
    }

    public String getTradeId() {
        return tradeId;
    }

    public void setTradeId(String tradeId) {
        this.tradeId = tradeId;
    }

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "ExecutedTrade{" +
                "tradeId='" + tradeId + '\'' +
                ", stockCode='" + stockCode + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", date=" + date +
                '}';
    }
}
