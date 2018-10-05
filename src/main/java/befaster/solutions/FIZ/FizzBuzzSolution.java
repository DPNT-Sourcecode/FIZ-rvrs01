package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    public String fizzBuzz(final int number) {
        if(number % 3 == 0 && String.valueOf(number).contains("3")) {
            return "fizz deluxe";
        }
        if(number % 5 == 0 && String.valueOf(number).contains("5")) {
            return "buzz deluxe";
        }
        return null;
    }
}
