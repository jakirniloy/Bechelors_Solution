package me.jakirniloy.bechelors_solution.Models;

public class User {

    private String uid;
    private String rid;
    private String createAccountDateTime;

    private String email;
    private String name;
    private String phoneNumber;
    private String status;
    private String availability;

    public User() {
    }

    public User(String uid, String rid, String createAccountDateTime,  String email, String name, String phoneNumber,  String status, String availability) {
        this.uid = uid;
        this.rid = rid;
        this.createAccountDateTime = createAccountDateTime;

        this.email = email;
        this.name = name;
        this.phoneNumber = phoneNumber;

        this.status = status;
        this.availability = availability;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public void setRid(String rid) {
        this.rid = rid;
    }

    public void setCreateAccountDateTime(String createAccountDateTime) {
        this.createAccountDateTime = createAccountDateTime;
    }



    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }



    public void setStatus(String status) {
        this.status = status;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public String getUid() {
        return uid;
    }

    public String getRid() {
        return rid;
    }

    public String getCreateAccountDateTime() {
        return createAccountDateTime;
    }



    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }



    public String getStatus() {
        return status;
    }

    public String getAvailability() {
        return availability;
    }
}

