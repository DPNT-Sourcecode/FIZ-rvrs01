package befaster.solutions.FIZ;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

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
         if(number > 10 ? true : false) {
            return "delux";
         }
        return "";
    }

    private boolean hasAllTheSameDigits(Integer number) {
        String digits = number.toString();
        String[] numbers = new String[digits.length()];
        List<String> digitList = Arrays.asList(numbers);

     //   Predicate<String> digitEquality  {if (a == b) return true;};
//        digitList.forEach(digit -> {
//
//        });


        return false;
    }

    private boolean digitContainsCharacters(String str, Integer number) {
        return number.toString().contains(str);
    }
}
