package bean;

public class User {
    private String login;
    private String password;
    private Boolean isBlocked = false;
    private int attemptsBeforeBlock = 3;

    public User(String login, String password){
        this.login = login;
        this.password = password;
    }

    public void clearAttempts(){
        this.attemptsBeforeBlock = 3;
    }

    public void decreaseAttempts(){
        this.attemptsBeforeBlock--;
        if (this.attemptsBeforeBlock == 0) this.blockUser();
    }

    public void blockUser(){
        this.isBlocked = true;
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

    public Boolean getBlocked() {
        return isBlocked;
    }

    public int getAttemptsBeforeBlock() {
        return attemptsBeforeBlock;
    }

    public String getInformation() {
        return "Login: \"" + this.getLogin() +
                "\", Password: \"" + this.getPassword() +
                "\", Attempts: " + this.getAttemptsBeforeBlock() +
                ", Is blocked: " + this.getBlocked();
    }
}
