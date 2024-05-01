package task6;

import java.util.ArrayList;
import java.util.List;

public class UserDatabase {

    private List<UserData> users;



    public UserDatabase() {

        users = new ArrayList<>();

    }



    public void addUser(UserData user) {

        users.add(user);

    }



    public void printUsers() {

        for (UserData user : users) {

            System.out.println(user.getInfo());

        }

    }

}
