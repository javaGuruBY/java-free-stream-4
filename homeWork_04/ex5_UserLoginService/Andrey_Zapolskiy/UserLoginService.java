public class UserLoginService {
    public boolean login(User user, String password) {
        int tries = user.getCountOfTries();

        if (user.UserIsBlocked()) {
            System.out.println("User is blocked");
            return false;
        }

        boolean isPasswordCorrect = user.getPassword().equals(password);
        if (isPasswordCorrect) {
            user.resetEnterTries();
        } else {
            tries = tries - 1;
            user.setCountOfTries(tries);
        }

        if (tries == 0) {
            user.setUserIsBlocked(true);
        }

        return isPasswordCorrect;
    }
}

