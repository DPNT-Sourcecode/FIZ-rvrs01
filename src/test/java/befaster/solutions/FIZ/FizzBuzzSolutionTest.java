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
    public void testThatNumberANumberThatIsDivisibleBy3ReturnsFizz() {
        assertThat(fizzBuzzSolution.fizzBuzz(27), is("fizz"));
    }

    @Test
    public void testThatNumberANumberThatIsDivisibleBy5ReturnsBuzz() {
        assertThat(fizzBuzzSolution.fizzBuzz(20), is("buzz"));
    }


    @Test
    public void testThatNumberANumberThatIsDivisibleBy3AndContainsTheNumber3AndIfItsAEvenNumberReturnsFizzDeluxe() {
        assertThat(fizzBuzzSolution.fizzBuzz(30), is("fizz buzz deluxe"));
    }

    @Test
    public void testThatNumberANumberThatIsDivisibleBy3AndContainsTheNumber3AndIfItsAOddNumberReturnsFizzFakeDeluxe() {
        assertThat(fizzBuzzSolution.fizzBuzz(3), is("fizz fake deluxe"));
        assertThat(fizzBuzzSolution.fizzBuzz(33), is("fizz fake deluxe"));
    }

    @Test
    public void testThatNumberANumberThatIsDivisibleBy5AndContainsTheNumber5AndIfItsAEvenNumberReturnsFizzDeluxe() {
        assertThat(fizzBuzzSolution.fizzBuzz(50), is("buzz deluxe"));
    }

    @Test
    public void testThatNumberANumberThatIsDivisibleBy5AndContainsTheNumber5AndIfItsAOddNumberReturnsFizzFakeDeluxe() {
        assertThat(fizzBuzzSolution.fizzBuzz(5), is("buzz fake deluxe"));
        assertThat(fizzBuzzSolution.fizzBuzz(55), is("buzz fake deluxe"));
    }

    @Test
    public void testThatNumberANumberThatIsDivisibleByBoth3And5AndAlsoContainsBothNumber3And5ReturnsFizzBuzzFakeDeluxe() {
        assertThat(fizzBuzzSolution.fizzBuzz(315), is("fizz buzz fake deluxe"));
    }

    @Test
    public void testThatNonDeluxeNumberReturnsActualNumber() {
        assertThat(fizzBuzzSolution.fizzBuzz(1), is("1"));
    }
}
