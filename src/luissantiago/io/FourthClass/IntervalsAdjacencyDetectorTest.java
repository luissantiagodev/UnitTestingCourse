package luissantiago.io.FourthClass;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class IntervalsAdjacencyDetectorTest {

    IntervalsAdjacencyDetector intervalsAdjacencyDetector;

    @Before
    public void setUp() {
        intervalsAdjacencyDetector = new IntervalsAdjacencyDetector();
    }

    @Test
    public void intervals_values_areAdjacent() {
        Interval interval1 = new Interval(5, 6);
        Interval interval2 = new Interval(5, 6);
        boolean result = intervalsAdjacencyDetector.isAdjacent(interval1, interval2);
        Assert.assertThat(result, is(true));
    }

    @Test
    public void intervals_values_areNotAdjacent() {
        Interval interval1 = new Interval(1, 5);
        Interval interval2 = new Interval(6, 9);
        boolean result = intervalsAdjacencyDetector.isAdjacent(interval1, interval2);
        Assert.assertThat(result, is(false));
    }
}