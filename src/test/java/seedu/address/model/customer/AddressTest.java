package seedu.address.model.customer;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static seedu.address.testutil.Assert.assertThrows;

import org.junit.jupiter.api.Test;

public class AddressTest {

    @Test
    public void constructor_null_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> new Address(null));
    }

    @Test
    public void constructor_invalidAddress_throwsIllegalArgumentException() {
        String invalidAddress = "";
        assertThrows(IllegalArgumentException.class, () -> new Address(invalidAddress));
    }

    @Test
    public void isValidAddress() {
        // null budget
        assertThrows(NullPointerException.class, () -> Address.isValidAddress(null));

        // invalid addresses
        assertFalse(Address.isValidAddress("")); // empty string
        assertFalse(Address.isValidAddress(" ")); // spaces only

        // valid addresses
        assertTrue(Address.isValidAddress("Blk 456, Den Road, #01-355"));
        assertTrue(Address.isValidAddress("-")); // one character
        assertTrue(Address.isValidAddress("Leng Inc; 1234 Market St; San Francisco CA 2349879; USA")); // long address
        assertTrue(Address.isValidAddress("^")); // only non-alphanumeric characters
        assertTrue(Address.isValidAddress("skyview*")); // contains non-alphanumeric characters
        assertTrue(Address.isValidAddress("skyview")); // alphabets only
        assertTrue(Address.isValidAddress("12345")); // numbers only
        assertTrue(Address.isValidAddress("skyview 2")); // alphanumeric characters
        assertTrue(Address.isValidAddress("Skyview")); // with capital letters
        assertTrue(Address.isValidAddress("J'den")); // apostrophes
        assertTrue(Address.isValidAddress("With space")); // with space
        assertTrue(Address.isValidAddress("!@#$%^&*()-_+=[{}]|:;'',<>.?/")); // symbols
        assertTrue(Address.isValidAddress("-Hello")); // start with dash
    }

    @Test
    public void equals() {
        Address address = new Address("Valid Address");

        // same values -> returns true
        assertTrue(address.equals(new Address("Valid Address")));

        // same object -> returns true
        assertTrue(address.equals(address));

        // null -> returns false
        assertFalse(address.equals(null));

        // different types -> returns false
        assertFalse(address.equals(5.0f));

        // different values -> returns false
        assertFalse(address.equals(new Address("Other Valid Address")));
    }
}
