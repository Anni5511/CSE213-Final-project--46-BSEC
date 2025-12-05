package com.example.ms3anni.companyRepresentative;

public class Notifications {

    private String reportSubmissionReminders, policyUpdates,newCirculars, approvalMessages;
    private int date;

    public Notifications(String reportSubmissionReminders, String policyUpdates, String newCirculars, String approvalMessages, int date) {
        this.reportSubmissionReminders = reportSubmissionReminders;
        this.policyUpdates = policyUpdates;
        this.newCirculars = newCirculars;
        this.approvalMessages = approvalMessages;
        this.date = date;
    }

    public String getReportSubmissionReminders() {
        return reportSubmissionReminders;
    }

    public void setReportSubmissionReminders(String reportSubmissionReminders) {
        this.reportSubmissionReminders = reportSubmissionReminders;
    }

    public String getPolicyUpdates() {
        return policyUpdates;
    }

    public void setPolicyUpdates(String policyUpdates) {
        this.policyUpdates = policyUpdates;
    }

    public String getNewCirculars() {
        return newCirculars;
    }

    public void setNewCirculars(String newCirculars) {
        this.newCirculars = newCirculars;
    }

    public String getApprovalMessages() {
        return approvalMessages;
    }

    public void setApprovalMessages(String approvalMessages) {
        this.approvalMessages = approvalMessages;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Notifications{" +
                "reportSubmissionReminders='" + reportSubmissionReminders + '\'' +
                ", policyUpdates='" + policyUpdates + '\'' +
                ", newCirculars='" + newCirculars + '\'' +
                ", approvalMessages='" + approvalMessages + '\'' +
                ", date=" + date +
                '}';
    }

    public void notifications(){

    }
}
