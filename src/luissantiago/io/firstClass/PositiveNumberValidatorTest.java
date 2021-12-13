package luissantiago.io.firstClass;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class PositiveNumberValidatorTest {

    PositiveNumberValidator SUT;

    @Before
    public void setUp(){
        SUT = new PositiveNumberValidator();
    }


    @Test
    public void testingNegativeResults() {
        boolean result = SUT.isPositive(-1);
        Assert.assertThat(result, is(false));
    }

    @Test
    public void testZeroValue(){
        boolean result = SUT.isPositive(0);
        Assert.assertThat(result, is(false));
    }

    @Test
    public void testPositiveValue(){
        boolean result = SUT.isPositive(1);
        Assert.assertThat(result, is(true));
    }

}