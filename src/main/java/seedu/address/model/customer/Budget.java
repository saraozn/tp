package seedu.address.model.customer;

import static java.util.Objects.isNull;
import static java.util.Objects.requireNonNull;
import static seedu.address.commons.util.AppUtil.checkArgument;

/**
 * Represents a Customer's budget in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidBudget(String)}
 */
public class Budget {


    public static final String MESSAGE_CONSTRAINTS =
            "Budget should only contain numbers at least 10000";
    public static final String VALIDATION_REGEX = "\\d{5,}";
    public final Integer amount;
    public final String value;

    /**
     * Constructs a {@code Budget}.
     *
     * @param budget A valid budget number.
     */
    public Budget(String budget) {
        requireNonNull(budget);
        checkArgument(isValidBudget(budget), MESSAGE_CONSTRAINTS);
        amount = Integer.parseInt(budget);
        value = budget;
    }

    /**
     * Returns true if a given string is a valid budget.
     */
    public static boolean isValidBudget(String test) {
        return test.matches(VALIDATION_REGEX);
    }

    /**
     * Returns true if the other budget is greater or equal this budget
     *
     * @param other the other budget being compared
     * @return whether the other budget is greater or equal to this budget
     */
    public boolean isInRangeBudget(Budget other) {
        return isNull(other) || amount >= other.amount;
    }

    @Override
    public String toString() {
        return "$" + value;
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
