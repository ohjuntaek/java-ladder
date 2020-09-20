package nextstep.ladder.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Line {
    public static final Random random = new Random();

    private final List<Boolean> points = new ArrayList<>();

    public Line(int countOfPersons) {
        points.add(random.nextBoolean());
        int pointNumber = countOfPersons - 1;

        for (int i = 1; i < pointNumber; i++) {
            addPoint(i);
        }
    }

    private void addPoint(int index) {
        if (addFalseIfBeforeTrue(index)) return;
        points.add(random.nextBoolean());
    }

    private boolean addFalseIfBeforeTrue(int index) {
        if (points.get(index - 1)) {
            points.add(false);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return points.stream()
                .map(LineRaw::getRawByIsDrawn)
                .collect(Collectors.joining("", "|", ""));
    }
}
