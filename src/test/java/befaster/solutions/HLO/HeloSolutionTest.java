package befaster.solutions.HLO;



import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

public class HeloSolutionTest {

    private final HelloSolution helloSolution = new HelloSolution();

    @Test
    public void shouldSayHelloWorld() {

        assertThat(helloSolution.hello("My Friend!"),is("Hello, My Friend!"));
    }

}
