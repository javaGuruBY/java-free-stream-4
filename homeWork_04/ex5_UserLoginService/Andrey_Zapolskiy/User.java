public class User {
    public String user;
    public String password;
    public boolean UserIsBlocked = false;
    public int countOfTries=3;

    public User(String login, String password) {
        this.user = login;
        this.password = password;
    }
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean UserIsBlocked() {
        return UserIsBlocked;
    }

    public void setUserIsBlocked(boolean userIsBlocked) {
        this.UserIsBlocked = userIsBlocked;
    }

    public int getCountOfTries() {
        return countOfTries;
    }

    public void setCountOfTries(int countOfTries) {
        this.countOfTries = countOfTries;
    }


    public void resetEnterTries (){
        countOfTries = 3;

    }
    public void blockUser() {
        UserIsBlocked = true;
    }
}
