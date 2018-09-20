package befaster.solutions.FIZ;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {

        boolean hasDigit3 = digitContainsCharacters("3", number);
        boolean hasDigit5 = digitContainsCharacters("5", number);

        Boolean isMod3 = numberIsDivisibleBy(number, 3 );
        Boolean isMod5 = numberIsDivisibleBy(number, 5 );

        if((isMod3 || hasDigit3) && (isMod5 || hasDigit5)) {
            if(numberIsDivisibleBy(number,2)) {
                return "fizz buzz deluxe";
            }else {
                return "fizz buzz fake deluxe";
            }
        }

        if(isMod3 && hasDigit3) {
            if(numberIsDivisibleBy(number,2)) {
                return "fizz deluxe";
            }else {
                return "fizz fake deluxe";
            }
        }

        if(isMod5 && hasDigit5) {
            if(numberIsDivisibleBy(number,2)){
                return "buzz deluxe";
            }else {
                return "buzz fake deluxe";
            }
        }

        return number.toString();
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
