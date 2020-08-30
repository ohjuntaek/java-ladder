package nextstep.ladder.domain;

import java.util.ArrayList;
import java.util.List;

public class Users {
    private final List<User> users;

    public Users(List<User> users) {
        this.users = users;
    }

    public static Users of(String personsRaw) {
        String[] split = personsRaw.split(",");
        List<User> users = new ArrayList<>();
        for (int i = 0; i < split.length; i++) {
            users.add(new User(split[i]));
        }
        return new Users(users);
    }

    public int countOfUsers() {
        return users.size();
    }
}
