package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User result = null;
        for (int i = 0; i < users.length; i++) {
            if (users[i].getUsername().equals(login)) {
                result = users[i];
            }
        } if (null == login) {
            throw new UserNotFoundException("UserNotFoundException");
        }
        return result;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() || user.getUsername().length() < 3) {
            throw new UserInvalidException("UserInvalidException");
        }
        return user.isValid();
    }

    public static void main(String[] args) {
        try {
            User[] users = {
                    new User("Petr Arsentev", true),
                    new User("Arsentev Petr", true),
                    new User("Oleg Semenov", false)
            };
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException userInvalid) {
            System.out.println(userInvalid.getMessage());
        } catch (UserNotFoundException userNotFound) {
            System.out.println(userNotFound.getMessage());
        }
    }
}
