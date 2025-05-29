package com.example;

import javafx.beans.property.SimpleStringProperty;

public class User {
    private final SimpleStringProperty username;
    private final SimpleStringProperty password;
    private final SimpleStringProperty dateCreated;
    private final SimpleStringProperty accStats;

    public User(String uname, String pword, String dcreated, String astatus) {

        this.username = new SimpleStringProperty(uname);
        this.password = new SimpleStringProperty(pword);
        this.dateCreated = new SimpleStringProperty(dcreated);
        this.accStats = new SimpleStringProperty(astatus);
    }

    public String getUsername() {
        return username.get();
    }

    public String getPassword() {
        return password.get();
    }

    public String getAccountcreated() {
        return dateCreated.get();
    }

    public String getAccountstatus() {
        return accStats.get();
    }
}
