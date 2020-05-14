package challenge.euler;

import java.util.*;

// Euler project number one
public final class Multiples {

    private final List<Integer> multiples;

    public Multiples(Integer... naturals) {
        this.multiples = Arrays.asList(naturals);
    }

    public Integer findSumAllUnder(Integer max) {

        if (max == null) {
            return 0;
        }

        Integer sum = 0;
        for (int i = 1; i < max; i++) {
            sum += this.returnIfMultiple(i);
        }
        return sum;
    }

    private Integer returnIfMultiple(Integer val) {
        return this.multiples.stream().anyMatch(m -> val % m == 0) ? val : 0;
    }
}
