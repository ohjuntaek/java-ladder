package nextstep.ladder.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Line {
    private List<Boolean> points = new ArrayList<>();

    public Line(int countOfPersons) {
        points.add(new Random().nextBoolean());
        for (int i = 1; i < countOfPersons - 1; i++) {
            if (points.get(i - 1)) {
                points.add(false);
                continue;
            }
            points.add(new Random().nextBoolean());
        }
    }

    @Override public String toString() {
        StringBuilder sb = new StringBuilder("|");
        for (int i = 0; i < points.size(); i++) {
            if (points.get(i)) {
                sb.append("-----|");
            } else {
                sb.append("     |");
            }
        }
        return sb.toString();
    }
}
