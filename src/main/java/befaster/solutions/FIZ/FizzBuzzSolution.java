package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FizzBuzzSolution {

    public String fizzBuzz(final int number) {
        FizzBuzzStringBuilder builder = new FizzBuzzStringBuilder(number);
        return builder.process();
    }

    public class FizzBuzzStringBuilder {

        private Integer number;

        FizzBuzzStringBuilder(int number) {
            this.number = number;
        }

        String process() {
            List<Optional<FizzBuzzIdentifier>> fizzBuzzIdentifierList = new ArrayList<>();
            fizzBuzzIdentifierList.add(extract(3, "fizz"));
            fizzBuzzIdentifierList.add(extract(5, "buzz"));

            StringBuilder builder = new StringBuilder();
            for(Optional<FizzBuzzIdentifier> fizzBuzzIdentifier : fizzBuzzIdentifierList) {
                append(builder, fizzBuzzIdentifier);
            }
            builder.append(extractDeluxe(fizzBuzzIdentifierList));
            return builder.toString();
        }

        String extractDeluxe(List<Optional<FizzBuzzIdentifier>> fizzBuzzIdentifierList) {
            for(Optional<FizzBuzzIdentifier> fizzBuzzIdentifier : fizzBuzzIdentifierList) {
                if(fizzBuzzIdentifier.isPresent()) {
                    if(fizzBuzzIdentifier.get().isDivisible) {
                        if(number.toString().contains("3") || number.toString().contains("5")) {
                            if(number % 2 == 0) {
                                return "deluxe";
                            }
                            return "fake deluxe";
                        }
                    }
                }
            }
            return "";
        }

        void append(final StringBuilder builder, final Optional<FizzBuzzIdentifier> value) {
            if(!value.isPresent()) {
                return;
            }

            if(builder.length() > 0) {
                builder.append(" ");
            }
            builder.append(value.get().type);
        }

        private Optional<FizzBuzzIdentifier> extract(Integer compareTo, String type) {
            if(number % compareTo == 0) {
                return Optional.of(new FizzBuzzIdentifier(type, true));
            }
            if(String.valueOf(number).contains(compareTo.toString())) {
                return Optional.of(new FizzBuzzIdentifier(type, false));
            }
            return Optional.empty();
        }
    }

    private class FizzBuzzIdentifier {
        private String type;
        private boolean isDivisible;

        public FizzBuzzIdentifier(String type, boolean isDivisible) {
            this.type = type;
            this.isDivisible = isDivisible;
        }
    }
}
