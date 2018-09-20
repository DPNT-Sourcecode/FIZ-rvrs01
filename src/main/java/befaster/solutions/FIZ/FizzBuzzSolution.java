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
        Integer[] numbers = getIntegers(digits);

        BiFunction<Integer, Integer, Integer> compareDigits = (Integer a, Integer b) -> a.compareTo(b);
        if (numbers.length == 2) {
            return compareDigits.apply(numbers[0], numbers[1]) == 0;
        } else if (numbers.length == 3) {
            return compareDigits.apply(numbers[1], numbers[2]) == 0;
        } else if (numbers.length == 4) {
            return compareDigits.apply(numbers[1], numbers[3]) == 0;
        }
        return false;
    }

    private Integer[] getIntegers(final String digits) {
        Integer[] numbers = new Integer[digits.length()];
        for (int i = 0; i < digits.length(); i++) {
            numbers[i] = Integer.valueOf(Character.toString(digits.charAt(i)));
        }
        return numbers;
    }

    private boolean digitContainsCharacters(String str, Integer number) {
        return number.toString().contains(str);
    }
}
