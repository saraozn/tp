package seedu.address.model.util;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import seedu.address.model.AddressBook;
import seedu.address.model.PropertyBook;
import seedu.address.model.property.Price;
import seedu.address.model.property.PropAddress;
import seedu.address.model.property.PropName;
import seedu.address.model.property.PropPhone;
import seedu.address.model.property.Property;
import seedu.address.model.ReadOnlyAddressBook;
import seedu.address.model.ReadOnlyPropertyBook;
import seedu.address.model.customer.Budget;
import seedu.address.model.customer.Customer;
import seedu.address.model.customer.Email;
import seedu.address.model.customer.Name;
import seedu.address.model.customer.Phone;
import seedu.address.model.tag.Tag;

/**
 * Contains utility methods for populating {@code AddressBook} with sample data.
 */
public class SampleDataUtil {
    public static Customer[] getSampleCustomers() {
        return new Customer[] {
            new Customer(new Name("Alex Yeoh"), new Phone("87438807"), new Email("alexyeoh@example.com"),
                new Budget("100000"),
                getTagSet("bright")),
            new Customer(new Name("Bernice Yu"), new Phone("99272758"), new Email("berniceyu@example.com"),
                new Budget("999000"),
                getTagSet("white", "square")),
            new Customer(new Name("Charlotte Oliveiro"), new Phone("93210283"), new Email("charlotte@example.com"),
                new Budget("40000000"),
                getTagSet("neighbours")),
            new Customer(new Name("David Li"), new Phone("91031282"), new Email("lidavid@example.com"),
                new Budget("7600000"),
                getTagSet("family")),
            new Customer(new Name("Irfan Ibrahim"), new Phone("92492021"), new Email("irfan@example.com"),
                new Budget("50000"),
                getTagSet("small")),
            new Customer(new Name("Roy Balakrishnan"), new Phone("92624417"), new Email("royb@example.com"),
                new Budget("200000"),
                getTagSet("city-center"))
        };
    }

    public static Property[] getSampleProperties() {
        return new Property[] {
            new Property(new PropName("Alex Yeoh"), new PropAddress("Blk 30 Geylang Street 29, #06-40"),
                    new PropPhone("87438807"), new Price("10101010"),
                        getTagSet("friends")),
                new Property(new PropName("Bernice Yu"), new PropAddress("Blk 30 Lorong 3 Serangoon Gardens, #07-18"),
                        new PropPhone("87438808"), new Price("2504830"),
                        getTagSet("friends")),
                new Property(new PropName("Charlotte Oliveiro"), new PropAddress("Blk 11 Ang Mo Kio Street 74, #11-04"),
                        new PropPhone("87438809"), new Price("36817468"),
                        getTagSet("friends")),
                new Property(new PropName("David Li"), new PropAddress("Blk 436 Serangoon Gardens Street 26, #16-43"),
                        new PropPhone("87438810"), new Price("81648137"),
                        getTagSet("friends")),
                new Property(new PropName("Irfan Ibrahim"), new PropAddress("Blk 47 Tampines Street 20, #17-35"),
                        new PropPhone("87438811"), new Price("8276464"),
                        getTagSet("friends")),
                new Property(new PropName("Roy Balakrishnan"), new PropAddress("Blk 45 Aljunied Street 85, #11-31"),
                        new PropPhone("87438812"), new Price("42846276"),
                        getTagSet("friends"))
        };
    }

    public static ReadOnlyAddressBook getSampleAddressBook() {
        AddressBook sampleAb = new AddressBook();
        for (Customer sampleCustomer : getSampleCustomers()) {
            sampleAb.addCustomer(sampleCustomer);
        }
        return sampleAb;
    }

    public static ReadOnlyPropertyBook getSamplePropertyBook() {
        PropertyBook sampleAb = new PropertyBook();
        for (Property sampleProperty : getSampleProperties()) {
            sampleAb.addProperty(sampleProperty);
        }
        return sampleAb;
    }
    /**
     * Returns a tag set containing the list of strings given.
     */
    public static Set<Tag> getTagSet(String... strings) {
        return Arrays.stream(strings)
                .map(Tag::new)
                .collect(Collectors.toSet());
    }

}
