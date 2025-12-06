package com.example.bsec.modelclasses;

public class Order {
    private String orderId;
    private String boAccountId;
    private String stockCode;
    private int quantity;
    private double price;
    private String type;
    private String status;

    public Order() {
    }

    public Order(String orderId, String boAccountId, String stockCode, int quantity, double price, String type, String status) {
        this.orderId = orderId;
        this.boAccountId = boAccountId;
        this.stockCode = stockCode;
        this.quantity = quantity;
        this.price = price;
        this.type = type;
        this.status = status;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getBoAccountId() {
        return boAccountId;
    }

    public void setBoAccountId(String boAccountId) {
        this.boAccountId = boAccountId;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", boAccountId='" + boAccountId + '\'' +
                ", stockCode='" + stockCode + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
