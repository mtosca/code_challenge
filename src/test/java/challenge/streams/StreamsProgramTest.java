package challenge.streams;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class StreamsProgramTest {

    @Test
    public void test_getEvenUntil() {
        StreamsProgram streamsProgram = new StreamsProgram();
        Assert.assertEquals(Arrays.asList(0, 2, 4, 6, 8), streamsProgram.getEvenUntil(10));
        Assert.assertEquals(Arrays.asList(0, 2, 4, 6, 8, 10, 12, 14), streamsProgram.getEvenUntil(15));
        Assert.assertEquals(Arrays.asList(0), streamsProgram.getEvenUntil(0));
        Assert.assertEquals(Arrays.asList(0), streamsProgram.getEvenUntil(null));
    }

    @Test
    public void test_countFrequency() {
        List<String> list = Arrays.asList("Java", "C#", "Javascript", "Java", "C", "Python", "Python", "Java");
        StreamsProgram streamsProgram = new StreamsProgram();
        Map<String, Integer> result = streamsProgram.countFrequency(list);
        Assert.assertEquals((int)result.get("Java"), 3);
        Assert.assertEquals((int)result.get("C#"), 1);
        Assert.assertEquals((int)result.get("Javascript"), 1);
        Assert.assertEquals((int)result.get("C"), 1);
        Assert.assertEquals((int)result.get("Python"), 2);
    }

    @Test
    public void test_groupByFrequency() {
        List<String> list = Arrays.asList("Java", "C#", "Javascript", "Java", "C", "Python", "Python", "Java");

        StreamsProgram streamsProgram = new StreamsProgram();
        Map<String, Long> result = streamsProgram.groupByFrequency(list);

        Assert.assertEquals((long)result.get("Java"), 3);
        Assert.assertEquals((long)result.get("C#"), 1);
        Assert.assertEquals((long)result.get("Javascript"), 1);
        Assert.assertEquals((long)result.get("C"), 1);
        Assert.assertEquals((long)result.get("Python"), 2);
    }
}
