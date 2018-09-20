package befaster.solutions.FIZ;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {

        boolean hasDigit3 = digitContainsCharacters("3", number);
        boolean hasDigit5 = digitContainsCharacters("5", number);

        if ((number % 3 == 0 || hasDigit3) && (number % 5 == 0 || hasDigit5)) {
            return "fizz buzz";
        } else if (number % 3 == 0 || hasDigit3) {
            return "fizz";
        } else if (number % 5 == 0 || hasDigit5) {
            return "buzz";
        }
        return number.toString();
    }

    private boolean digitContainsCharacters(String str, Integer number) {
        return number.toString().contains(str);
    }
}
