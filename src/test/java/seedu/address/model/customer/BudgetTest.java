package seedu.address.model.customer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static seedu.address.testutil.Assert.assertThrows;

public class BudgetTest {
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
        assertFalse(Budget.isValidBudget("one million")); // not an integer
        assertFalse(Budget.isValidBudget("1")); // one digit only
        assertFalse(Budget.isValidBudget("11")); // two digit only
        assertFalse(Budget.isValidBudget("111")); // three digit only
        assertFalse(Budget.isValidBudget("1111")); // four digit only


        // valid budgets
        assertTrue(Budget.isValidBudget("100000"));
        assertTrue(Budget.isValidBudget("100000000000000000")); // long budget
    }

    @Test
    public void equals() {
        Budget budget = new Budget("100000");

        // same values -> returns true
        assertTrue(budget.equals(new Budget("100000")));

        // same object -> returns true
        assertTrue(budget.equals(budget));

        // null -> returns false
        assertFalse(budget.equals(null));

        // different types -> returns false
        assertFalse(budget.equals(5.0f));

        // different values -> returns false
        assertFalse(budget.equals(new Budget("500000")));
    }
}
