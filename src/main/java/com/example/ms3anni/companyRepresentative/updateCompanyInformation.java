package com.example.ms3anni.companyRepresentative;

public class updateCompanyInformation {
    private String updateInfo,Companyname, Address, Email, Phone;

    public updateCompanyInformation(String updateInfo, String companyname, String address, String email, String phone) {
        this.updateInfo = updateInfo;
        Companyname = companyname;
        Address = address;
        Email = email;
        Phone = phone;
    }

    public String getUpdateInfo() {
        return updateInfo;
    }

    public void setUpdateInfo(String updateInfo) {
        this.updateInfo = updateInfo;
    }

    public String getCompanyname() {
        return Companyname;
    }

    public void setCompanyname(String companyname) {
        Companyname = companyname;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    @Override
    public String toString() {
        return "updateCompanyInformation{" +
                "updateInfo='" + updateInfo + '\'' +
                ", Companyname='" + Companyname + '\'' +
                ", Address='" + Address + '\'' +
                ", Email='" + Email + '\'' +
                ", Phone='" + Phone + '\'' +
                '}';
    }

    public void updateCompanyInformation(){

    }
}
