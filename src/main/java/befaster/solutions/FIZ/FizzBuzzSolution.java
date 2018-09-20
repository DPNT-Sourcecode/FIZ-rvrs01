package befaster.solutions.FIZ;

import java.util.function.BiFunction;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {

        boolean hasDigit3 = digitContainsCharacters("3", number);
        boolean hasDigit5 = digitContainsCharacters("5", number);


        if ((number % 3 == 0 || hasDigit3) && (number % 5 == 0 || hasDigit5)) {
            return "fizz buzz" + numberGreaterThanTen(number);
        } else if (number % 3 == 0 || hasDigit3) {
            return "fizz";
        } else if (number % 5 == 0 || hasDigit5) {
            return "buzz";
        } else {
            numberGreaterThanTen(number);
        }

        return number.toString();
    }

    private String numberGreaterThanTen(Integer number) {
        if (number > 10 && hasAllTheSameDigits(number)) {
            return "delux";
        }
        return "";
    }

    private boolean hasAllTheSameDigits(Integer number) {
        String digits = number.toString();
        Integer[] numbers = new Integer[digits.length()];

        if (numbers[0].compareTo(numbers[1]) == 0) {
            if (numbers.length > 2) {
                if ((numbers[1].compareTo(numbers[2])) == 0) {
                    if (numbers.length > 3) {
                        if(numbers[1].compareTo(numbers[3]) == 0){
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    private boolean digitContainsCharacters(String str, Integer number) {
        return number.toString().contains(str);
    }
}
