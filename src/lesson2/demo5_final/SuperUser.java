package lesson2.demo5_final;

public class SuperUser extends User {
    private String login;
    private String password;

    public SuperUser() {}

    public SuperUser(int id, String name, String login, String password) {
        super(id, name); // this
        this.login = login;
        this.password = password;
    }

    @Override
    public String toString() {
        return "SuperUser{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                "} " + super.toString();
    }


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
