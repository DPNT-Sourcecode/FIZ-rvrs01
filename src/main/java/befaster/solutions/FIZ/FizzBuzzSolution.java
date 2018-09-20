package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {

        if(number % 3 == 0){
            return "fizz";
        }
        return number.toString();
    }

}
