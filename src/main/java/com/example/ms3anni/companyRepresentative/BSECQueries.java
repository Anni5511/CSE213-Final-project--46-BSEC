package com.example.ms3anni.companyRepresentative;

public class BSECQueries {

    private String  QueryID, Subject, Status;
    private int Date;

    public BSECQueries(String queryID, String subject, String status, int date) {
        QueryID = queryID;
        Subject = subject;
        Status = status;
        Date = date;
    }

    public String getQueryID() {
        return QueryID;
    }

    public void setQueryID(String queryID) {
        QueryID = queryID;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public int getDate() {
        return Date;
    }

    public void setDate(int date) {
        Date = date;
    }

    @Override
    public String toString() {
        return "BSECQueries{" +
                "QueryID='" + QueryID + '\'' +
                ", Subject='" + Subject + '\'' +
                ", Status='" + Status + '\'' +
                ", Date=" + Date +
                '}';
    }

    public void BSECQueries(){

    }
}
