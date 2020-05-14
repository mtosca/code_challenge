package challenge.euler;

import org.junit.Assert;
import org.junit.Test;

public class MultiplesTest {

    @Test
    public void test_findMultiplesSumLowerThan_10() {
        Multiples multiples = new Multiples(3, 5);

        Integer result = multiples.findSumAllUnder(null);
        Assert.assertEquals((Integer)0, result);

        result = multiples.findSumAllUnder(0);
        Assert.assertEquals((Integer)0, result);
    }

    @Test
    public void test_findMultiplesSumLowerThan_1000() {
        Multiples multiples = new Multiples(3, 5);

        Integer result = multiples.findSumAllUnder(1000);
        Assert.assertEquals((Integer)233168, result);
    }
}
