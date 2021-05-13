package nLayeredDemo.entities.concretes;

import nLayeredDemo.entities.abstracts.Entity;

public class User implements Entity {
    private int Id;
    private String Name;
    private String Surname;
    private String Email;
    private String Password;

    public User() {
    }

    public User(int id, String name, String surname, String email, String password) {
        Id = id;
        Name = name;
        Surname = surname;
        Email = email;
        Password = password;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
