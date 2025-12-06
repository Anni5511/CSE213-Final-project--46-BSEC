package com.example.bsec.modelclasses;

import java.time.LocalDate;

public class Transaction {
    private String transactionId;
    private String boAccountId;
    private String stockCode;
    private int quantity;
    private double price;
    private String type; // BUY/SELL
    private LocalDate date;

    public Transaction() {
    }

    public Transaction(String transactionId, String boAccountId, String stockCode, int quantity, double price, String type, LocalDate date) {
        this.transactionId = transactionId;
        this.boAccountId = boAccountId;
        this.stockCode = stockCode;
        this.quantity = quantity;
        this.price = price;
        this.type = type;
        this.date = date;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionId='" + transactionId + '\'' +
                ", boAccountId='" + boAccountId + '\'' +
                ", stockCode='" + stockCode + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", date=" + date +
                '}';
    }
}
