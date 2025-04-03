public class User {

    private String username;
    private String password;

    User(String uzer, String pazz) {
        this.username = uzer;
        this.password = pazz;
    }

    public String getUser() {
        return this.username;
    }

    public String getPass() {
        return this.password;
    }

}

