package befaster.solutions.FIZ;

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
            Optional<FizzBuzzIdentifier> fizzIdentifier = extract(3, "fizz");
            if(fizzIdentifier.isPresent()) {
                fizzBuzzIdentifierList.add(fizzIdentifier);
            }
            Optional<FizzBuzzIdentifier> buzzIdentifier = extract(5, "buzz");
            if(buzzIdentifier.isPresent()) {
                fizzBuzzIdentifierList.add(buzzIdentifier);
            }

            if (!fizzBuzzIdentifierList.isEmpty()) {
                StringBuilder builder = new StringBuilder();
                for(Optional<FizzBuzzIdentifier> fizzBuzzIdentifier : fizzBuzzIdentifierList) {
                    append(builder, fizzBuzzIdentifier);
                }
                builder.append(extractDeluxe(fizzBuzzIdentifierList));
                return builder.toString();
            }
            return number.toString();
        }

        String extractDeluxe(List<Optional<FizzBuzzIdentifier>> fizzBuzzIdentifierList) {
            for(Optional<FizzBuzzIdentifier> fizzBuzzIdentifier : fizzBuzzIdentifierList) {
                if(fizzBuzzIdentifier.isPresent()) {
                    if(fizzBuzzIdentifier.get().isDivisible) {
                        if(fizzBuzzIdentifier.get().isDeluxe()) {
                            if(number % 2 == 0) {
                                return " deluxe";
                            }
                            return " fake deluxe";
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
                return Optional.of(new FizzBuzzIdentifier(type, true, containCompareNumber(compareTo)));
            }
            if(String.valueOf(number).contains(compareTo.toString())) {
                return Optional.of(new FizzBuzzIdentifier(type, false, containCompareNumber(compareTo)));
            }
            return Optional.empty();
        }

        private boolean containCompareNumber(Integer hasNumber) {
            return number.toString().contains(hasNumber.toString());
        }
    }

    private class FizzBuzzIdentifier {
        private String type;
        private boolean isDivisible;
        private boolean hasNumber;

        FizzBuzzIdentifier(String type, boolean isDivisible, boolean hasNumber) {
            this.type = type;
            this.isDivisible = isDivisible;
            this.hasNumber = hasNumber;
        }

        boolean isDeluxe() {
            return isDivisible && hasNumber;
        }
    }
}
