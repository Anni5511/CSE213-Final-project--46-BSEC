package com.example.bsec.modelclasses;

public class WatchlistItem {
    private String boAccountId;
    private String stockCode;
    private double latestPrice;

    public WatchlistItem() {
    }

    public WatchlistItem(String boAccountId, String stockCode, double latestPrice) {
        this.boAccountId = boAccountId;
        this.stockCode = stockCode;
        this.latestPrice = latestPrice;
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

    public double getLatestPrice() {
        return latestPrice;
    }

    public void setLatestPrice(double latestPrice) {
        this.latestPrice = latestPrice;
    }

    @Override
    public String toString() {
        return "WatchlistItem{" +
                "boAccountId='" + boAccountId + '\'' +
                ", stockCode='" + stockCode + '\'' +
                ", latestPrice=" + latestPrice +
                '}';
    }
}
