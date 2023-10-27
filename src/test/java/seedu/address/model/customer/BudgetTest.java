package seedu.address.model.customer;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static seedu.address.testutil.Assert.assertThrows;

import org.junit.jupiter.api.Test;


public class BudgetTest {
    private static final float OTHER_TYPE_INVALID_BUDGET = 5.0f;
    private static final String NOT_INTEGER_INVALID_BUDGET = "one million";
    private static final String ONE_DIGIT_INVALID_BUDGET = "1";
    private static final String TWO_DIGIT_INVALID_BUDGET = "11";
    private static final String THREE_DIGIT_INVALID_BUDGET = "111";
    private static final String FOUR_DIGIT_INVALID_BUDGET = "1111";
    private static final String VALID_BUDGET = "100000";
    private static final String LONG_VALID_BUDGET = Integer.toString(Integer.MAX_VALUE);
    @Test
    public void constructor_null_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> new Budget(null));
    }

    @Test
    public void constructor_invalidBudget_throwsIllegalArgumentException() {
        String invalidBudget = "";
        assertThrows(IllegalArgumentException.class, () -> new Budget(invalidBudget));
    }

    @Test
    public void isValidBudget() {
        // null budget
        assertThrows(NullPointerException.class, () -> Budget.isValidBudget(null));

        // invalid budgets
        assertFalse(Budget.isValidBudget("")); // empty string
        assertFalse(Budget.isValidBudget(" ")); // spaces only
        assertFalse(Budget.isValidBudget(NOT_INTEGER_INVALID_BUDGET)); // not an integer
        assertFalse(Budget.isValidBudget(ONE_DIGIT_INVALID_BUDGET)); // one digit only
        assertFalse(Budget.isValidBudget(TWO_DIGIT_INVALID_BUDGET)); // two digit only
        assertFalse(Budget.isValidBudget(THREE_DIGIT_INVALID_BUDGET)); // three digit only
        assertFalse(Budget.isValidBudget(FOUR_DIGIT_INVALID_BUDGET)); // four digit only


        // valid budgets
        assertTrue(Budget.isValidBudget(VALID_BUDGET));
        assertTrue(Budget.isValidBudget(LONG_VALID_BUDGET)); // long budget
    }

    @Test
    public void isInRangeBudget() {
        // null budget
        assertTrue(new Budget(VALID_BUDGET).isInRangeBudget(null));

        // smaller budget
        assertTrue(new Budget(LONG_VALID_BUDGET).isInRangeBudget(new Budget(VALID_BUDGET)));

        // same budget
        assertTrue(new Budget(VALID_BUDGET).isInRangeBudget(new Budget(VALID_BUDGET)));

        // bigger budget
        assertFalse(new Budget(VALID_BUDGET).isInRangeBudget(new Budget(LONG_VALID_BUDGET)));
    }

    @Test
    public void equals() {
        Budget budget = new Budget(VALID_BUDGET);

        // same values -> returns true
        assertTrue(budget.equals(new Budget(VALID_BUDGET)));

        // same object -> returns true
        assertTrue(budget.equals(budget));

        // null -> returns false
        assertFalse(budget.equals(null));

        // different types -> returns false
        assertFalse(budget.equals(OTHER_TYPE_INVALID_BUDGET));

        // different values -> returns false
        assertFalse(budget.equals(new Budget(LONG_VALID_BUDGET)));
    }
}
