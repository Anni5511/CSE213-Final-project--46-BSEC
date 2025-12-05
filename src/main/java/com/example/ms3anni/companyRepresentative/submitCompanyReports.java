package com.example.ms3anni.companyRepresentative;

public class submitCompanyReports {
    private String CompanyName,ReportType;
    private int year;

    public submitCompanyReports(String companyName, String reportType, int year) {
        CompanyName = companyName;
        ReportType = reportType;
        this.year = year;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public String getReportType() {
        return ReportType;
    }

    public void setReportType(String reportType) {
        ReportType = reportType;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "submitCompanyReports{" +
                "CompanyName='" + CompanyName + '\'' +
                ", ReportType='" + ReportType + '\'' +
                ", year=" + year +
                '}';
    }

    public void submitCompanyReport(){

    }
}
