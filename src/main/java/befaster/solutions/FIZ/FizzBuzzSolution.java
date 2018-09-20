package befaster.solutions.FIZ;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {

        if ((number % 3 == 0) && (number % 5 == 0) ){
            return "fizz buzz";
        } else if (number % 3 == 0 ||  digitContainsCharacters("3", number) ) {
            return "fizz";
        } else if (number % 5 == 0 || digitContainsCharacters("5", number)) {
            return "buzz";
        }
        return number.toString();
    }

    private boolean digitContainsCharacters(String str, Integer number){
        return number.toString().contains(str);
    }
}
