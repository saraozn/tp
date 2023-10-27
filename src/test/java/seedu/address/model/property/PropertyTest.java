package seedu.address.model.property;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static seedu.address.logic.commands.CommandPropertyTestUtil.VALID_ADDRESS_SKYVIEW;
import static seedu.address.logic.commands.CommandPropertyTestUtil.VALID_NAME_SKYVIEW;
import static seedu.address.logic.commands.CommandPropertyTestUtil.VALID_PHONE_SKYVIEW;
import static seedu.address.logic.commands.CommandPropertyTestUtil.VALID_PRICE_SKYVIEW;
import static seedu.address.logic.commands.CommandPropertyTestUtil.VALID_TAG_BIG;
import static seedu.address.testutil.Assert.assertThrows;
import static seedu.address.testutil.TypicalProperties.AQUAVISTA;
import static seedu.address.testutil.TypicalProperties.SKYVIEW;

import org.junit.jupiter.api.Test;

import seedu.address.testutil.PropertyBuilder;

public class PropertyTest {

    @Test
    public void asObservableList_modifyList_throwsUnsupportedOperationException() {
        Property property = new PropertyBuilder().build();
        assertThrows(UnsupportedOperationException.class, () -> property.getTags().remove(0));
    }

    @Test
    public void isSameProperty() {
        // same object -> returns true
        assertTrue(AQUAVISTA.isSameProperty(AQUAVISTA));

        // null -> returns false
        assertFalse(AQUAVISTA.isSameProperty(null));

        // same name, all other attributes different -> returns true
        Property editedAlice = new PropertyBuilder(AQUAVISTA).withPhone(VALID_PHONE_SKYVIEW)
                .withAddress(VALID_ADDRESS_SKYVIEW)
                .withPrice(VALID_PRICE_SKYVIEW).withTags(VALID_TAG_BIG).build();
        assertTrue(AQUAVISTA.isSameProperty(editedAlice));

        // different name, all other attributes same -> returns false
        editedAlice = new PropertyBuilder(AQUAVISTA).withName(VALID_NAME_SKYVIEW).build();
        assertFalse(AQUAVISTA.isSameProperty(editedAlice));

        // name differs in case, all other attributes same -> returns false
        Property editedSkyview = new PropertyBuilder(SKYVIEW).withName(VALID_NAME_SKYVIEW.toLowerCase()).build();
        assertFalse(SKYVIEW.isSameProperty(editedSkyview));

        // name has trailing spaces, all other attributes same -> returns false
        String nameWithTrailingSpaces = VALID_NAME_SKYVIEW + " ";
        editedSkyview = new PropertyBuilder(SKYVIEW).withName(nameWithTrailingSpaces).build();
        assertFalse(SKYVIEW.isSameProperty(editedSkyview));
    }

    @Test
    public void equals() {
        // same values -> returns true
        Property aquavistaCopy = new PropertyBuilder(AQUAVISTA).build();
        assertTrue(AQUAVISTA.equals(aquavistaCopy));

        // same object -> returns true
        assertTrue(AQUAVISTA.equals(AQUAVISTA));

        // null -> returns false
        assertFalse(AQUAVISTA.equals(null));

        // different type -> returns false
        assertFalse(AQUAVISTA.equals(5));

        // different property -> returns false
        assertFalse(AQUAVISTA.equals(SKYVIEW));

        // different name -> returns false
        Property editedAquavista = new PropertyBuilder(AQUAVISTA).withName(VALID_NAME_SKYVIEW).build();
        assertFalse(AQUAVISTA.equals(editedAquavista));

        // different phone -> returns false
        editedAquavista = new PropertyBuilder(AQUAVISTA).withPhone(VALID_PHONE_SKYVIEW).build();
        assertFalse(AQUAVISTA.equals(editedAquavista));

        // different email -> returns false
        editedAquavista = new PropertyBuilder(AQUAVISTA).withAddress(VALID_ADDRESS_SKYVIEW).build();
        assertFalse(AQUAVISTA.equals(editedAquavista));

        // different budget -> returns false
        editedAquavista = new PropertyBuilder(AQUAVISTA).withPrice(VALID_PRICE_SKYVIEW).build();
        assertFalse(AQUAVISTA.equals(editedAquavista));

        // different tags -> returns false
        editedAquavista = new PropertyBuilder(AQUAVISTA).withTags(VALID_TAG_BIG).build();
        assertFalse(AQUAVISTA.equals(editedAquavista));
    }

    @Test
    public void toStringMethod() {
        String expected = Property.class.getCanonicalName() + "{name=" + AQUAVISTA.getName()
                + ", address=" + AQUAVISTA.getAddress() + ", phone=" + AQUAVISTA.getPhone()
                + ", price=" + AQUAVISTA.getPrice() + ", tags=" + AQUAVISTA.getTags() + "}";
        assertEquals(expected, AQUAVISTA.toString());
    }
}
