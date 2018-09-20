package befaster.solutions.FIZ;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {

        boolean hasDigit3 = digitContainsCharacters("3", number);
        boolean hasDigit5 = digitContainsCharacters("5", number);

        Boolean isMod3 = numberIsDivisibleBy(number, 3 );
        Boolean isMod5 = numberIsDivisibleBy(number, 5 );

        if((isMod3 || hasDigit3) && (isMod5 || hasDigit5)) {
            String fizbuzz = geKeywordDividedByDigitAndContainsDigit(number, true, true, "fizz buzz");

            if (numberIsDivisibleBy(number, 2)) {
                return "fizz buzz deluxe";
            } else {
                return "fizz buzz fake deluxe";
            }
        }
        String fizz1 = geKeywordDividedByDigitAndContainsDigit(number, hasDigit3, isMod3, "fizz");
        if (fizz1 != null) return fizz1;

        String buzz1 = geKeywordDividedByDigitAndContainsDigit(number, hasDigit5, isMod5, "buzz");
        if (buzz1 != null) return buzz1;

        return number.toString();
    }

    private String geKeywordDividedByDigitAndContainsDigit(final Integer number, final boolean hasDigit, final Boolean isModNumber, String prefix) {

        if(isModNumber && hasDigit) {
            if(numberIsDivisibleBy(number,2)){
                prefix = prefix +  " deluxe";
                return prefix;
            }else {
                prefix = prefix+ " fake deluxe";
                return prefix;
            }
        } else if(isModNumber || hasDigit) {
            return prefix;
        }
        return null;
    }


    private boolean digitContainsCharacters(String str, Integer number) {
        return number.toString().contains(str);
    }

    private boolean numberIsDivisibleBy( Integer number, int diviser) {
       if (number % diviser == 0) {
        return true;
       }
       return false;
   }
}
