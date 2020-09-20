package nextstep.ladder.domain;

import java.util.ArrayList;
import java.util.List;

public class Users {
    private final List<User> users;

    public Users(List<User> users) {
        this.users = users;
    }

    public static Users of(String personsRaw) {
        String[] splitPersonsRaw = personsRaw.split(",");
        List<User> users = new ArrayList<>();
        for (String personRaw : splitPersonsRaw) {
            users.add(new User(personRaw.trim()));
        }
        return new Users(users);
    }

    public int countOfUsers() {
        return users.size();
    }
}
