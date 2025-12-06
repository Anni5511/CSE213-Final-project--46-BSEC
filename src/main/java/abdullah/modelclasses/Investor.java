package abdullah.modelclasses;

public class Investor {
    private String name;
    private String nidNumber;
    private String email;
    private String phone;
    private String address;
    private String password;
    private String boAccountId;

    public Investor() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNidNumber() {
        return nidNumber;
    }

    public void setNidNumber(String nidNumber) {
        this.nidNumber = nidNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBoAccountId() {
        return boAccountId;
    }

    public void setBoAccountId(String boAccountId) {
        this.boAccountId = boAccountId;
    }

    @Override
    public String toString() {
        return "Investor{" +
                "name='" + name + '\'' +
                ", nidNumber='" + nidNumber + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", password='" + password + '\'' +
                ", boAccountId='" + boAccountId + '\'' +
                '}';
    }

    public Investor(String name, String nidNumber, String email, String phone, String address, String password, String boAccountId) {
        this.name = name;
        this.nidNumber = nidNumber;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.password = password;
        this.boAccountId = boAccountId;

    }
}
