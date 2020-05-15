package challenge.streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamsProgram {


    public List<Integer> getEvenUntil(Integer max) {
        if (null == max || max <= 1) {
            return Arrays.asList(0);
        }

        return IntStream.range(0, max).boxed().filter(e -> e % 2 == 0).collect(Collectors.toList());
    }

    public Map<String, Integer> countFrequency(List<String> list) {
        Map<String, Integer> result = new HashMap<String, Integer>();
        list.stream().forEach((e) -> result.put(e, Collections.frequency(list, e)));
        return result;
    }

    public Map<String, Long> groupByFrequency(List<String> list) {
        return list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}
