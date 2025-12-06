package com.example.bsec.modelclasses;

public class Client {
    private String name;
    private String boAccountId;
    private String email;
    private String status;

    public Client() {
    }

    public Client(String email, String name, String boAccountId, String status) {
        this.email = email;
        this.name = name;
        this.boAccountId = boAccountId;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBoAccountId() {
        return boAccountId;
    }

    public void setBoAccountId(String boAccountId) {
        this.boAccountId = boAccountId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", boAccountId='" + boAccountId + '\'' +
                ", email='" + email + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
