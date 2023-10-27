package seedu.address.model.property;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static seedu.address.testutil.Assert.assertThrows;

import org.junit.jupiter.api.Test;


public class PriceTest {
    private static final float OTHER_TYPE_INVALID_PRICE = 5.0f;
    private static final String NOT_INTEGER_INVALID_PRICE = "one million";
    private static final String ONE_DIGIT_INVALID_PRICE = "1";
    private static final String TWO_DIGIT_INVALID_PRICE = "11";
    private static final String THREE_DIGIT_INVALID_PRICE = "111";
    private static final String FOUR_DIGIT_INVALID_PRICE = "1111";
    private static final String VALID_PRICE = "100000";
    private static final String LONG_VALID_PRICE = Integer.toString(Integer.MAX_VALUE);
    @Test
    public void constructor_null_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> new Price(null));
    }

    @Test
    public void constructor_invalidPrice_throwsIllegalArgumentException() {
        String invalidPrice = "";
        assertThrows(IllegalArgumentException.class, () -> new Price(invalidPrice));
    }

    @Test
    public void isValidPrice() {
        // null price
        assertThrows(NullPointerException.class, () -> Price.isValidPrice(null));

        // invalid prices
        assertFalse(Price.isValidPrice("")); // empty string
        assertFalse(Price.isValidPrice(" ")); // spaces only
        assertFalse(Price.isValidPrice(NOT_INTEGER_INVALID_PRICE)); // not an integer
        assertFalse(Price.isValidPrice(ONE_DIGIT_INVALID_PRICE)); // one digit only
        assertFalse(Price.isValidPrice(TWO_DIGIT_INVALID_PRICE)); // two digit only
        assertFalse(Price.isValidPrice(THREE_DIGIT_INVALID_PRICE)); // three digit only
        assertFalse(Price.isValidPrice(FOUR_DIGIT_INVALID_PRICE)); // four digit only


        // valid prices
        assertTrue(Price.isValidPrice(VALID_PRICE));
        assertTrue(Price.isValidPrice(LONG_VALID_PRICE)); // long budget
    }

    @Test
    public void isInRangeBudget() {
        // null price
        assertTrue(new Price(VALID_PRICE).isInRangePrice(null));

        // smaller price
        assertFalse(new Price(LONG_VALID_PRICE).isInRangePrice(new Price(VALID_PRICE)));

        // same price
        assertTrue(new Price(VALID_PRICE).isInRangePrice(new Price(VALID_PRICE)));

        // bigger price
        assertTrue(new Price(VALID_PRICE).isInRangePrice(new Price(LONG_VALID_PRICE)));
    }

    @Test
    public void equals() {
        Price price = new Price(VALID_PRICE);

        // same values -> returns true
        assertTrue(price.equals(new Price(VALID_PRICE)));

        // same object -> returns true
        assertTrue(price.equals(price));

        // null -> returns false
        assertFalse(price.equals(null));

        // different types -> returns false
        assertFalse(price.equals(OTHER_TYPE_INVALID_PRICE));

        // different values -> returns false
        assertFalse(price.equals(new Price(LONG_VALID_PRICE)));
    }
}
