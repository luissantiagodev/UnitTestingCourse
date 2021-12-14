package luissantiago.io.thirdClass;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringDuplicatorTest {

    StringDuplicator stringDuplicator;

    @Before
    public void setUp(){
        stringDuplicator = new StringDuplicator();
    }

    @Test
    public void duplicator_character_duplicateValue(){
        String resultExpected = "HollywoodHollywood";
        String result = stringDuplicator.duplicate("Hollywood");
        assertThat(result, CoreMatchers.is(resultExpected));
    }
}