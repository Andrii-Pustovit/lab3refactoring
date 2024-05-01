package task6;

import java.util.List;

public class UserUtils {

    public static void printUsers(UserDatabase userDatabase) {
        List<UserData> users = userDatabase.getUsers();
        for (UserData user : users) {
            System.out.println(user.getInfo());
        }
    }
}
