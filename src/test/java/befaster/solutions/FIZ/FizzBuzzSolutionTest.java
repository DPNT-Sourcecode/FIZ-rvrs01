package befaster.solutions.FIZ;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.MatcherAssert.assertThat;

public class FizzBuzzSolutionTest {

    private FizzBuzzSolution fizzBuzzSolution;

    @Before
    public void setUp() {
        fizzBuzzSolution = new FizzBuzzSolution();
    }

    @Test
    public void testThatNumberANumberThatIsDivisibleBy3AndContainsTheNumber3ReturnsFizzDeluxe() {
        assertThat(fizzBuzzSolution.fizzBuzz(3), is("fizz deluxe"));
        assertThat(fizzBuzzSolution.fizzBuzz(30), is("fizz deluxe"));
        assertThat(fizzBuzzSolution.fizzBuzz(33), is("fizz deluxe"));
    }


    @Test
    public void testThatNumberANumberThatIsDivisibleBy5AndContainsTheNumber5ReturnsFizzDeluxe() {
        assertThat(fizzBuzzSolution.fizzBuzz(5), is("buzz deluxe"));
        assertThat(fizzBuzzSolution.fizzBuzz(50), is("buzz deluxe"));
        assertThat(fizzBuzzSolution.fizzBuzz(55), is("buzz deluxe"));
    }

    @Test
    public void testThatNonDeluxeNumberReturnsNull() {
        assertThat(fizzBuzzSolution.fizzBuzz(1), is(nullValue()));
        assertThat(fizzBuzzSolution.fizzBuzz(6), is(nullValue()));
        assertThat(fizzBuzzSolution.fizzBuzz(20), is(nullValue()));
    }
}
