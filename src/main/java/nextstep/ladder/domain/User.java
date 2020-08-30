package nextstep.ladder.domain;

public class User {
    private final String name;

    public User(String name) {
        checkNameNotOver5(name);
        this.name = name;
    }

    private void checkNameNotOver5(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException("이름의 길이는 5를 넘지 않아야 합니다.");
        }
    }
}
