package befaster.solutions.HLO;

import static java.lang.String.format;

import befaster.runner.SolutionNotImplementedException;

public class HelloSolution {
    public String hello(String friendName) {
        return format("Hello, %s",friendName);
    }
}
