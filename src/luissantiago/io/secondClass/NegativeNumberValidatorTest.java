package luissantiago.io.secondClass;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class NegativeNumberValidatorTest {
    NegativeNumberValidator negativeNumberValidator;

    @Before
    public void setUp(){
        negativeNumberValidator = new NegativeNumberValidator();
    }

    @Test
    public void checkIfNumberIsNegativeWithPositiveValue(){
        boolean value = negativeNumberValidator.isNegative(1);
        Assert.assertThat(value, is(false));
    }

    @Test
    public void checkIfNumberIsNegativeWithZeroValue(){
        boolean value = negativeNumberValidator.isNegative(0);
        Assert.assertThat(value, is(false));
    }

    @Test
    public void checkIfNumberIsNegativeWithNegativeValue(){
        boolean value = negativeNumberValidator.isNegative(-1);
        Assert.assertThat(value, is(true));
    }


}