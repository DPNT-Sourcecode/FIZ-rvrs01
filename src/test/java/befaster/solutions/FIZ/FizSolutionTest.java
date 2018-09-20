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
    public void shouldWriteFiz_whenNumberDivisibleByFive() {

        assertThat(fizzBuzzSolution.fizzBuzz(25),is("buzz"));
    }

}
