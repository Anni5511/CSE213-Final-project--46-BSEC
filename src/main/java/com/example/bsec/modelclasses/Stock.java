package com.example.bsec.modelclasses;

public class Stock {
    private String stockCode;
    private String stockName;
    private double price;

    public Stock() {
    }

    public Stock(String stockCode, String stockName, double price) {
        this.stockCode = stockCode;
        this.stockName = stockName;
        this.price = price;
    }

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "stockCode='" + stockCode + '\'' +
                ", stockName='" + stockName + '\'' +
                ", price=" + price +
                '}';
    }
}
