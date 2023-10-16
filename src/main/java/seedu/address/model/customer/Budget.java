package seedu.address.model.customer;

import static java.util.Objects.requireNonNull;
import static seedu.address.commons.util.AppUtil.checkArgument;

public class Budget {


    public static final String MESSAGE_CONSTRAINTS =
            "Budget should only contain numbers at least 10000";
    public static final String VALIDATION_REGEX = "\\d{5,}";
    public final Integer amount;
    public final String value;

    /**
     * Constructs a {@code Phone}.
     *
     * @param budget A valid budget number.
     */
    public Budget(String budget) {
        requireNonNull(budget);
        checkArgument(isValidBudget(budget), MESSAGE_CONSTRAINTS);
        amount = Integer.parseInt(budget);
        value = "$" + budget;
    }

    /**
     * Returns true if a given string is a valid phone number.
     */
    public static boolean isValidBudget(String test) {
        return test.matches(VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }

        // instanceof handles nulls
        if (!(other instanceof Budget)) {
            return false;
        }

        Budget otherBudget = (Budget) other;
        return value.equals(otherBudget.value);
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

}
