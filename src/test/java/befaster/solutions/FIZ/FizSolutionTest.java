package befaster.solutions.FIZ;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

public class FizSolutionTest {

    private final FizzBuzzSolution fizzBuzzSolution = new FizzBuzzSolution();

    @Test
    public void shouldWriteFiz_whenNumberDivisibleByThree() {

        assertThat(fizzBuzzSolution.fizzBuzz(9),is("fizz fake deluxe"));
    }

    @Test
    public void shouldWriteFizz_whenNumberDivisibleByFive() {

        assertThat(fizzBuzzSolution.fizzBuzz(25),is("buzz fake deluxe"));
    }


    @Test
    public void shouldWriteFizz_whenNumberDivisibleByFiveAndThree() {

        assertThat(fizzBuzzSolution.fizzBuzz(15),is("fizz buzz fake deluxe"));
    }

    @Test
    public void shouldWriteFizz_whenNumberDivisibleByThree_orNumberHasDigitThree() {
        assertThat(fizzBuzzSolution.fizzBuzz(13),is("fizz fake deluxe"));
    }

    @Test
    public void shouldWriteFizzBuzz_whenNumberDivisibleByFiveOrThree_orNumberHasDigitFiveOrThree_FailedFix() {
        assertThat(fizzBuzzSolution.fizzBuzz(546),is("fizz buzz deluxe"));
    }

    @Test
    public void shouldWriteFizzBuzz_whenNumberDivisibleByFiveOrThree_orNumberHasDigitFiveOrThree() {
        assertThat(fizzBuzzSolution.fizzBuzz(35),is("fizz buzz fake deluxe"));
    }

    @Test
    public void shouldWriteBuzz_whenNumberDivisibleByFiveOrThree_orNumberHasDigitFiveOrThree() {
        assertThat(fizzBuzzSolution.fizzBuzz(35),is("fizz buzz fake deluxe"));
    }

    @Test
    public void shouldWriteDelux_whenNumberGreaterThanTen_andHasIdenticalDigits() {
        assertThat(fizzBuzzSolution.fizzBuzz(22),is("22"));
    }

    @Test
    public void shouldWriteFizzDelux_whenNumberGreaterThanTen_andHasIdenticalDigits_andNumberHasDigits3() {
        assertThat(fizzBuzzSolution.fizzBuzz(33),is("fizz fake deluxe"));
    }

    @Test
    public void shouldWriteBuzDelux_whenNumberGreaterThanTen_andHasIdenticalDigits_andNumberHasDigits3() {
        assertThat(fizzBuzzSolution.fizzBuzz(555),is("fizz buzz fake deluxe"));
    }

    @Test
    public void shouldWriteBuzz_whenNumberDivisibleByFive_andNumberGreaterThanTen_andNumberHasDigitFive() {
        assertThat(fizzBuzzSolution.fizzBuzz(55),is("buzz fake deluxe"));
    }

    @Test
    public void shouldWriteFakeDelux_whenNumberDivisibleByFive_andNumberGreaterThanTen_andNumberHasAllSameOddDigits() {
        assertThat(fizzBuzzSolution.fizzBuzz(333),is("fizz fake deluxe"));
    }

}
