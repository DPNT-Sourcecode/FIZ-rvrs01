package befaster.solutions.FIZ;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {

        boolean hasDigit3 = digitContainsCharacters("3", number);
        boolean hasDigit5 = digitContainsCharacters("5", number);

        if ((number % 3 == 0 || hasDigit3) && (number % 5 == 0 || hasDigit5)) {
            return ("fizz buzz" + numberIsDeluxeOrFakeDeluxe(number));
        } else if (number % 3 == 0 || hasDigit3) {
            return ("fizz"  + numberIsDeluxeOrFakeDeluxe(number));
        } else if (number % 5 == 0 || hasDigit5) {
            return ("buzz"  + numberIsDeluxeOrFakeDeluxe(number));
        } else if (number > 10){
            if(numberIsDeluxeOrFakeDeluxe(number).trim() != "") {
                return numberIsDeluxeOrFakeDeluxe(number).trim();
            } else {
                return number.toString();
            }
        }
        return number.toString();
    }

    private String numberIsDeluxeOrFakeDeluxe(Integer number) {
            if(number % 2 == 0) {
                return " deluxe";
            } else {
                return " fake deluxe";
            }
    }

    private boolean digitContainsCharacters(String str, Integer number) {
        return number.toString().contains(str);
    }
}
