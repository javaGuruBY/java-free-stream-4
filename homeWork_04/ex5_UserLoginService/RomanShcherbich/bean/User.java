package UserLoginService.bean;

public class User {

  private String login;
  private String password;
  private boolean isBlocked = false;
  private int tryLoginCount = 3;

  public User(String login, String password) {
    this.login = login;
    this.password = password;
  }

  public void resetTries() {
    this.tryLoginCount = 3;
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

  public int getTryLoginCount() {
    return tryLoginCount;
  }

  public void setTryLoginCount(int tryLoginCount) {
    if (tryLoginCount > 3 || tryLoginCount < 0) {
      try {
        throw new Exception();
      } catch (Exception e) {
        System.out.println("invalid value for login tries");
        e.printStackTrace();
      }
    }
    this.tryLoginCount = tryLoginCount;
  }
}
