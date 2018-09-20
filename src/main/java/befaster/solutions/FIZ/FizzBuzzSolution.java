package befaster.solutions.FIZ;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {

        if ((number % 3 == 0) && (number % 5 == 0) ){
            return "fizz buzz";
        } else if (number % 3 == 0 ||  digitContainsCharcters("3", number) ) {
            return "fizz";
        } else if (number % 5 == 0) {
            return "buzz";
        }
        return number.toString();
    }

    private boolean digitContainsCharcters(String str, Integer number){
        return number.toString().contains(str);
    }
}
