package User.bean;

public class User {
    private String login;
    private String password;
    private boolean isBlocked = false;
    private int countLoginAttempts = 3;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void resetTries() {
        this.countLoginAttempts = 3;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }

    public String getPassword() {
        return password;
    }

    public int getCountLoginAttempts() {
        return countLoginAttempts;
    }

    public void setCountLoginAttempts(int countLoginAttempts) {
        if (countLoginAttempts > 3 || countLoginAttempts < 0) {
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("invalid value for login tries");
                e.printStackTrace();
            }
        }
        this.countLoginAttempts = countLoginAttempts;
    }
}
