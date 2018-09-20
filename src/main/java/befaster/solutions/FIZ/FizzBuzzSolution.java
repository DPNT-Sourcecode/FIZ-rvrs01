package befaster.solutions.FIZ;

import java.util.function.BiFunction;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {

        boolean hasDigit3 = digitContainsCharacters("3", number);
        boolean hasDigit5 = digitContainsCharacters("5", number);


        if ((number % 3 == 0 || hasDigit3) && (number % 5 == 0 || hasDigit5)) {
            return ("fizz buzz" + numberGreaterThanTen(number));
        } else if (number % 3 == 0 || hasDigit3) {
            return ("fizz"  + numberGreaterThanTen(number));
        } else if (number % 5 == 0 || hasDigit5) {
            return ("buzz"  + numberGreaterThanTen(number));
        } else if (number > 10){
            if(numberGreaterThanTen(number).trim() != "") {
                return numberGreaterThanTen(number).trim();
            } else {
                return number.toString();
            }
        }
        return number.toString();
    }

    private String numberGreaterThanTen(Integer number) {
        if (hasAllTheSameDigits(number)) {
            return " deluxe";
        }
        return "";
    }

    private boolean hasAllTheSameDigits(Integer number) {
        String digits = number.toString();
        Integer[] numbers = getIntegers(digits);

        if (numbers.length >= 2) {
            return numbers[0].compareTo(numbers[1]) == 0;
        } else if (numbers.length >= 3) {
            return numbers[0].compareTo(numbers[2]) == 0;
        } else if (numbers.length == 4) {
            return numbers[0].compareTo(numbers[3]) == 0;
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
