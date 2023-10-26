package seedu.address.logic.commands;

import static java.util.Objects.requireNonNull;
import static seedu.address.logic.parser.CliSyntax.PREFIX_BUDGET;
import static seedu.address.logic.parser.CliSyntax.PREFIX_TAG;

import seedu.address.commons.util.ToStringBuilder;
import seedu.address.logic.Messages;
import seedu.address.logic.commands.exceptions.CommandException;
import seedu.address.model.Model;
import seedu.address.model.customer.BudgetAndTagsInRangePredicate;

/**
 * Filter all customers in the address book to the user based on specific tags and/or budget.
 */
public class FilterCustomerCommand extends Command {
    public static final String COMMAND_WORD = "filtercust";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Filters customers from the address book. "
            + "Parameters: "
            + "[" + PREFIX_BUDGET + "BUDGET] "
            + "[" + PREFIX_TAG + "TAG]...\n"
            + "Example: " + COMMAND_WORD + " "
            + PREFIX_BUDGET + "100000000 "
            + PREFIX_TAG + "bright "
            + PREFIX_TAG + "sunny";

    private BudgetAndTagsInRangePredicate predicate;

    /**
     * Creates an FilteredCustomerCommand to get all the specified {@code Customer}
     */
    public FilterCustomerCommand(BudgetAndTagsInRangePredicate predicate) {
        this.predicate = predicate;
    }

    @Override
    public CommandResult execute(Model model) throws CommandException {
        requireNonNull(model);
        model.updateFilteredCustomerList(predicate);
        return new CommandResult(
                String.format(Messages.MESSAGE_CUSTOMERS_LISTED_OVERVIEW, model.getFilteredCustomerList().size()));
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }

        // instanceof handles nulls
        if (!(other instanceof FilterCustomerCommand)) {
            return false;
        }

        FilterCustomerCommand otherFilterCustomerCommand = (FilterCustomerCommand) other;
        return predicate.equals(otherFilterCustomerCommand.predicate);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .add("predicate", predicate)
                .toString();
    }
}
