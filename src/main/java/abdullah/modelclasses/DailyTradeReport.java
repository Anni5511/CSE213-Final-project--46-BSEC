package abdullah.modelclasses;

import java.time.LocalDate;

public class DailyTradeReport {
    private LocalDate date;
    private int totalTrades;
    private double totalTradeValue;

    public DailyTradeReport() {
    }

    public DailyTradeReport(LocalDate date, int totalTrades, double totalTradeValue) {
        this.date = date;
        this.totalTrades = totalTrades;
        this.totalTradeValue = totalTradeValue;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getTotalTrades() {
        return totalTrades;
    }

    public void setTotalTrades(int totalTrades) {
        this.totalTrades = totalTrades;
    }

    public double getTotalTradeValue() {
        return totalTradeValue;
    }

    public void setTotalTradeValue(double totalTradeValue) {
        this.totalTradeValue = totalTradeValue;
    }

    @Override
    public String toString() {
        return "DailyTradeReport{" +
                "date=" + date +
                ", totalTrades=" + totalTrades +
                ", totalTradeValue=" + totalTradeValue +
                '}';
    }
}
