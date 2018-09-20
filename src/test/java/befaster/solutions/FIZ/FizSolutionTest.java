package befaster.solutions.FIZ;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

public class FizSolutionTest {

    private final FizzBuzzSolution fizzBuzzSolution = new FizzBuzzSolution();

    @Test
    public void shouldWriteFiz_whenNumberDivisibleByThree() {

        assertThat(fizzBuzzSolution.fizzBuzz(9),is("fizz"));
    }

    @Test
    public void shouldWriteFizz_whenNumberDivisibleByFive() {

        assertThat(fizzBuzzSolution.fizzBuzz(25),is("buzz"));
    }


    @Test
    public void shouldWriteFizz_whenNumberDivisibleByFiveAndThree() {

        assertThat(fizzBuzzSolution.fizzBuzz(15),is("fizz buzz"));
    }

    @Test
    public void shouldWriteFizz_whenNumberDivisibleByThree_orNumberHasDigitThree() {
        assertThat(fizzBuzzSolution.fizzBuzz(13),is("fizz"));
    }

    @Test
    public void shouldWriteBuzz_whenNumberDivisibleByFive_orNumberHasDigitFive() {
        assertThat(fizzBuzzSolution.fizzBuzz(55),is("buzz"));
    }

    @Test
    public void shouldWriteFizzBuzz_whenNumberDivisibleByFiveOrThree_orNumberHasDigitFiveOrThree_FailedFix() {
        assertThat(fizzBuzzSolution.fizzBuzz(546),is("fizz buzz"));
    }

    @Test
    public void shouldWriteFizzBuzz_whenNumberDivisibleByFiveOrThree_orNumberHasDigitFiveOrThree() {
        assertThat(fizzBuzzSolution.fizzBuzz(35),is("fizz buzz"));
    }

    @Test
    public void shouldWriteBuzz_whenNumberDivisibleByFiveOrThree_orNumberHasDigitFiveOrThree() {
        assertThat(fizzBuzzSolution.fizzBuzz(35),is("fizz buzz"));
    }

    @Test
    public void shouldWriteFizzBuzzDelux_whenNumberGreaterThanTen_andHasIdenticalDigits_andDivisibleByFiveOThree() {
        assertThat(fizzBuzzSolution.fizzBuzz(35),is("fizz buzz"));
    }
}
