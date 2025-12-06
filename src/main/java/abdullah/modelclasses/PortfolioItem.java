package abdullah.modelclasses;

public class PortfolioItem {
    private String stockCode;
    private int quantity;
    private double avgPrice;
    private double currentPrice;

    public PortfolioItem() {
    }

    public PortfolioItem(String stockCode, int quantity, double avgPrice, double currentPrice) {
        this.stockCode = stockCode;
        this.quantity = quantity;
        this.avgPrice = avgPrice;
        this.currentPrice = currentPrice;
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

    public double getAvgPrice() {
        return avgPrice;
    }

    public void setAvgPrice(double avgPrice) {
        this.avgPrice = avgPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    @Override
    public String
    toString() {
        return "PortfolioItem{" +
                "stockCode='" + stockCode + '\'' +
                ", quantity=" + quantity +
                ", avgPrice=" + avgPrice +
                ", currentPrice=" + currentPrice +
                '}';
    }
}
