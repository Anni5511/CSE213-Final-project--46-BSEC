package com.example.ms3anni.companyRepresentative;

public class checkSubmissionStatus {

    private String reportName, status;
    private int SubmissionDate;

    public checkSubmissionStatus(String reportName, String status, int submissionDate) {
        this.reportName = reportName;
        this.status = status;
        SubmissionDate = submissionDate;
    }

    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getSubmissionDate() {
        return SubmissionDate;
    }

    public void setSubmissionDate(int submissionDate) {
        SubmissionDate = submissionDate;
    }

    @Override
    public String toString() {
        return "checkSubmissionStatus{" +
                "reportName='" + reportName + '\'' +
                ", status='" + status + '\'' +
                ", SubmissionDate=" + SubmissionDate +
                '}';
    }

    public void checkSubmissionStatus(){

    }
}
