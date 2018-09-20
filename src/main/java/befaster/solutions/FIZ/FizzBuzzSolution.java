package befaster.solutions.FIZ;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {

        boolean hasDigit3 = digitContainsCharacters("3", number);
        boolean hasDigit5 = digitContainsCharacters("5", number);

        Boolean isMod3 = numberIsDivisibleBy(number, 3 );
        Boolean isMod5 = numberIsDivisibleBy(number, 5 );

        if((isMod3 || hasDigit3) && (isMod5 || hasDigit5)) {
            if (numberIsDivisibleBy(number, 2)) {
                return "fizz buzz deluxe";
            } else {
                return "fizz buzz fake deluxe";
            }
        }
        String fizz1 = getDivideBy3(number, hasDigit3, isMod3);
        if (fizz1 != null) return fizz1;

        String buzz1 = getDivideBy5(number, hasDigit5, isMod5);
        if (buzz1 != null) return buzz1;

        return number.toString();
    }

    private String getDivideBy3(final Integer number, final boolean hasDigit3, final Boolean isMod3) {
        String fizz = "fizz";
        if(isMod3 && hasDigit3) {

            if(numberIsDivisibleBy(number,2)) {
                fizz = fizz + " deluxe";
            }else {
                fizz = fizz +  " fake deluxe";
            }
            return fizz;
        } else if(isMod3) {
            return "fizz";
        }
        return null;
    }

    private String getDivideBy5(final Integer number, final boolean hasDigit5, final Boolean isMod5) {
        String buzz = "buzz";
        if(isMod5 && hasDigit5) {
            if(numberIsDivisibleBy(number,2)){
                buzz = buzz +  "deluxe";
            }else {
                buzz = buzz + " fake deluxe";
            }
            return buzz;
        } else if(isMod5) {
            return "buzz";
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
