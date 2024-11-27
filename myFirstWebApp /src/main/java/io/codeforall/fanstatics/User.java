package io.codeforall.fanstatics;

public class User {
    private String title= "JAVABANK - Customer #";
    private String name;
    private String mail;
    private String phone;
    private int id;
    public User(String name, String mail, String phone, int id) {
        this.name = name;
        this.mail = mail;
        this.phone = phone;
        this.title = title;
        this.id= id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
