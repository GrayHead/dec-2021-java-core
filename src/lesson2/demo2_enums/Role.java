package lesson2.demo2_enums;

public enum Role {

    ADMIN("foo"), MANAGER("bar"), VIEWER;

    private String token;

    Role() {
    }

    Role(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }
}
