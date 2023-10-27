package seedu.address.logic.commands;

import static java.util.Objects.requireNonNull;
import static seedu.address.logic.parser.CliSyntax.PREFIX_BUDGET;
import static seedu.address.logic.parser.CliSyntax.PREFIX_TAG;

import seedu.address.commons.core.index.Index;
import seedu.address.commons.util.ToStringBuilder;
import seedu.address.logic.Messages;
import seedu.address.logic.commands.exceptions.CommandException;
import seedu.address.model.Model;
import seedu.address.model.customer.Budget;
import seedu.address.model.customer.BudgetAndTagsInRangePredicate;
import seedu.address.model.customer.Customer;
import seedu.address.model.property.Price;
import seedu.address.model.property.PriceAndTagsInRangePredicate;
import seedu.address.model.property.Property;
import seedu.address.model.tag.Tag;

import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

/**
 * Match all properties in the property book to the user based on specific tags
 * and/or budget satisfy the customer criteria.
 */
public class MatchPropertyCommand extends Command {
    public static final String COMMAND_WORD = "matchprop";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Match properties from the property book. \n"
            + "Parameters: "
            + "Index" + "\n"
            + "Example: " + COMMAND_WORD + "  2";

    private Index targetIndex;

    /**
     * Creates an MatchPropertyCommand to get all the specified {@code Customer}
     */
    public MatchPropertyCommand(Index targetIndex) {
        this.targetIndex = targetIndex;
    }

    @Override
    public CommandResult execute(Model model) throws CommandException {
        requireNonNull(model);
        List<Property> lastShownList = model.getFilteredPropertyList();

        Property targetProperty = lastShownList.get(targetIndex.getZeroBased());

        Price price = targetProperty.getPrice();
        Set<Tag> tags = targetProperty.getTags();

        Budget minBudget = price.ConvertToBudget();
        BudgetAndTagsInRangePredicate predicate = new BudgetAndTagsInRangePredicate(minBudget, tags);

        model.updateMatchedPropertyList(targetProperty, predicate);

        return new CommandResult(
                String.format(
                        Messages.MESSAGE_ALL_LISTED_OVERVIEW,
                        model.getFilteredCustomerList().size(),
                        model.getFilteredPropertyList().size()
                )
        );
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }

        // instanceof handles nulls
        if (!(other instanceof MatchPropertyCommand)) {
            return false;
        }

        MatchPropertyCommand otherMatchPropertyCommand = (MatchPropertyCommand) other;
        return targetIndex.equals(otherMatchPropertyCommand.targetIndex);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .add("Index", targetIndex)
                .toString();
    }
}
