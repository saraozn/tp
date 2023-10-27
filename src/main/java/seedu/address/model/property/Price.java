package seedu.address.model.property;

import seedu.address.model.customer.Budget;

import static java.util.Objects.isNull;
import static java.util.Objects.requireNonNull;
import static seedu.address.commons.util.AppUtil.checkArgument;

/**
 * Represents a Price in the Property book.
 * Guarantees: details are present and not null, field values are validated, immutable.
 */
public class Price {


    public static final String MESSAGE_CONSTRAINTS =
            "Price should only contain numbers at least 10000";
    public static final String VALIDATION_REGEX = "\\d{5,}";
    public final Integer amount;
    public final String value;

    /**
     * Constructs a {@code Phone}.
     *
     * @param price A valid price number.
     */
    public Price(String price) {
        requireNonNull(price);
        checkArgument(isValidPrice(price), MESSAGE_CONSTRAINTS);
        amount = Integer.parseInt(price);
        value = price;
    }

    /**
     * Returns true if a given string is a valid price.
     */
    public static boolean isValidPrice(String test) {
        return test.matches(VALIDATION_REGEX);
    }

    /**
     * Returns true if the other price is lower or equal this price
     *
     * @param other the other budget being compared
     * @return whether the other budget is lower or equal to this budget
     */
    public boolean isInRangePrice(Price other) {
        return isNull(other) || amount <= other.amount;
    }

    /**
     * Convert the price to a budget object.
     *
     * @return a budget object that have the same amount with the price.
     */
    public Budget ConvertToBudget() {
        return new Budget(value);
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
        if (!(other instanceof Price)) {
            return false;
        }

        Price otherPrice = (Price) other;
        return value.equals(otherPrice.value);
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

}
