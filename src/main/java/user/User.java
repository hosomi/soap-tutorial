package user;

public class User {

    private String name;
    private String surname;
    private String country;

    public User(String name, String surname, String country) {
        this.name = name;
        this.surname = surname;
        this.country = country;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
