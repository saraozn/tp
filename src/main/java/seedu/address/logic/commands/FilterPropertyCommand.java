package seedu.address.logic.commands;

import seedu.address.commons.util.ToStringBuilder;
import seedu.address.logic.Messages;
import seedu.address.logic.commands.exceptions.CommandException;
import seedu.address.model.Model;
import seedu.address.model.property.PriceAndTagsInRangePredicate;

import static java.util.Objects.requireNonNull;
import static seedu.address.logic.parser.CliSyntax.PREFIX_PRICE;
import static seedu.address.logic.parser.CliSyntax.PREFIX_TAG;

public class FilterPropertyCommand extends Command {
    public static final String COMMAND_WORD = "filterprop";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Filters properties from the address book. "
            + "Parameters: "
            + "[" + PREFIX_PRICE + "PRICE] "
            + "[" + PREFIX_TAG + "TAG]...\n"
            + "Example: " + COMMAND_WORD + " "
            + PREFIX_PRICE + "100000000 "
            + PREFIX_TAG + "bright "
            + PREFIX_TAG + "sunny";

    private PriceAndTagsInRangePredicate predicate;

    /**
     * Creates an FilteredPropertyCommand to get all the specified {@code Property}
     */
    public FilterPropertyCommand(PriceAndTagsInRangePredicate predicate) {
        this.predicate = predicate;
    }

    @Override
    public CommandResult execute(Model model) throws CommandException {
        requireNonNull(model);
        model.updateFilteredPropertyList(predicate);
        return new CommandResult(
                String.format(Messages.MESSAGE_PROPERTIES_LISTED_OVERVIEW, model.getFilteredPropertyList().size()));
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }

        // instanceof handles nulls
        if (!(other instanceof FilterPropertyCommand)) {
            return false;
        }

        FilterPropertyCommand otherFilterPropertyCommand = (FilterPropertyCommand) other;
        return predicate.equals(otherFilterPropertyCommand.predicate);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .add("predicate", predicate)
                .toString();
    }
}
