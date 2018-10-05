package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    public String fizzBuzz(final int number) {
        String numberValue = String.valueOf(number);
        StringBuilder builder = new StringBuilder();
        if(number % 3 == 0 && numberValue.contains("3")) {
            builder.append("fizz");
        }
        if(number % 5 == 0 && numberValue.contains("5")) {
            if(builder.length() != 0 ) {
                builder.append(" ");
            }
            builder.append("buzz");
        }

        if(builder.length() != 0) {
            if(number % 2 == 0) {
                return builder.append(" deluxe").toString();
            }
            return builder.append(" fake deluxe").toString();
        }
        return numberValue;
    }
}
