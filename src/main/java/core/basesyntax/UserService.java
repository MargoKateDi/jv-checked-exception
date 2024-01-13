package core.basesyntax;

public class UserService {
    public void registerUser(User user) throws PasswordValidationException {
        PasswordValidator validator = new PasswordValidator();
        try {
            validator.validate(user.getPassword(), user.getRepeatPassword());
            saveUser(user);
            System.out.println("registration successful");
        } catch (PasswordValidationException e) {
            System.out.println("Your passwords are incorrect. Try again.");
        }
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString()
                + " was saved to database!!!");
    }
}
