package UserLoginService;

import UserLoginService.bean.User;
import UserLoginService.service.UserLoginService;
import org.junit.Assert;
import org.junit.Test;

public class UserTest {

  private UserLoginService loginService = new UserLoginService();

  @Test
  public void loginSuccess() {
    User admin = new User("Roman", "qwerty");
    Assert.assertTrue("Login is not successful", loginService.login(admin, "qwerty"));
  }

  @Test
  public void passwordInvalidOne() {
    User admin = new User("Roman", "qwerty");
    Assert.assertFalse("Login is not successful", loginService.login(admin, "qwerty1"));
    Assert.assertTrue("Login is not successful", loginService.login(admin, "qwerty"));
  }

  @Test
  public void passwordInvalidTwo() {
    User admin = new User("Roman", "qwerty");
    Assert.assertFalse("Login is not successful", loginService.login(admin, "qwerty1"));
    Assert.assertFalse("Login is not successful", loginService.login(admin, "qwerty1"));
    Assert.assertTrue("Login is not successful", loginService.login(admin, "qwerty"));
  }

  @Test
  public void passwordValidUserBlocked() {
    User admin = new User("Roman", "qwerty");
    Assert.assertFalse("Login is not successful", loginService.login(admin, "qwerty1"));
    Assert.assertFalse("Login is not successful", loginService.login(admin, "qwerty12"));
    Assert.assertFalse("Login is not successful", loginService.login(admin, "qwerty13"));
    Assert.assertFalse("Login is not successful", loginService.login(admin, "qwerty"));
  }

  @Test
  public void triesReseted() {
    User admin = new User("Roman", "qwerty");
    Assert.assertFalse("Login is not successful", loginService.login(admin, "qwerty1"));
    Assert.assertFalse("Login is not successful", loginService.login(admin, "qwerty12"));
    Assert.assertTrue("Login is not successful", loginService.login(admin, "qwerty"));
    Assert.assertFalse("Login is not successful", loginService.login(admin, "qwerty13"));
    Assert.assertTrue("Login is not successful", loginService.login(admin, "qwerty"));
  }
}
