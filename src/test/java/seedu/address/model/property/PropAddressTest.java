package seedu.address.model.property;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static seedu.address.testutil.Assert.assertThrows;

import org.junit.jupiter.api.Test;

public class PropAddressTest {

    @Test
    public void constructor_null_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> new PropAddress(null));
    }

    @Test
    public void constructor_invalidPropAddress_throwsIllegalArgumentException() {
        String invalidAddress = "";
        assertThrows(IllegalArgumentException.class, () -> new PropAddress(invalidAddress));
    }

    @Test
    public void isValidPropAddress() {
        // null budget
        assertThrows(NullPointerException.class, () -> PropAddress.isValidAddress(null));

        // invalid property addresses
        assertFalse(PropAddress.isValidAddress("")); // empty string
        assertFalse(PropAddress.isValidAddress(" ")); // spaces only

        // valid property addresses
        assertTrue(PropAddress.isValidAddress("Blk 456, Den Road, #01-355"));
        assertTrue(PropAddress.isValidAddress("-")); // one character
        assertTrue(PropAddress.isValidAddress("Leng Inc; 1234 Market St; San Francisco CA 2349879; USA")); // long budget
    }

    @Test
    public void equals() {
        PropAddress propAddress = new PropAddress("Valid Address");

        // same values -> returns true
        assertTrue(propAddress.equals(new PropAddress("Valid Address")));

        // same object -> returns true
        assertTrue(propAddress.equals(propAddress));

        // null -> returns false
        assertFalse(propAddress.equals(null));

        // different types -> returns false
        assertFalse(propAddress.equals(5.0f));

        // different values -> returns false
        assertFalse(propAddress.equals(new PropAddress("Other Valid Address")));
    }
}
