package befaster.solutions.FIZ;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FizzBuzzSolutionTest {

    private FizzBuzzSolution fizzBuzzSolution;

    @Before
    public void setUp() {
        fizzBuzzSolution = new FizzBuzzSolution();
    }

    @Test
    public void testThatNumber3ReturnsFizzDeluxe() {
        assertThat(fizzBuzzSolution.fizzBuzz(3), is("fizz deluxe"));
    }
}
