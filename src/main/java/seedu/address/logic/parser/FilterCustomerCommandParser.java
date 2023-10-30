package seedu.address.logic.parser;

import static java.util.Objects.isNull;
import static java.util.Objects.requireNonNull;
import static seedu.address.logic.Messages.MESSAGE_INVALID_COMMAND_FORMAT;
import static seedu.address.logic.parser.CliSyntax.PREFIX_BUDGET;
import static seedu.address.logic.parser.CliSyntax.PREFIX_TAG;

import java.util.Set;

import seedu.address.logic.commands.FilterCustomerCommand;
import seedu.address.logic.parser.exceptions.ParseException;
import seedu.address.model.customer.Budget;
import seedu.address.model.customer.BudgetAndTagsInRangePredicate;
import seedu.address.model.tag.Tag;

/**
 * Filters and lists all customers in address book whose budget and/or tags are selected.
 */
public class FilterCustomerCommandParser implements Parser<FilterCustomerCommand> {

    /**
     * Parses the given {@code String} of arguments in the context of the FilterCustomerCommand
     * and returns a FilterPropertyCommand object for execution.
     * @throws ParseException if the user input does not conform the expected format
     */
    public FilterCustomerCommand parse(String args) throws ParseException {
        requireNonNull(args);
        Budget budget = null;
        Set<Tag> tags;
        ArgumentMultimap argMultimap =
                ArgumentTokenizer.tokenize(args, PREFIX_BUDGET, PREFIX_TAG);

        argMultimap.verifyNoDuplicatePrefixesFor(PREFIX_BUDGET);
        if (argMultimap.getValue(PREFIX_BUDGET).isPresent()) {
            budget = ParserUtil.parseBudget(argMultimap.getValue(PREFIX_BUDGET).get());
        }

        tags = ParserUtil.parseTags(argMultimap.getAllValues(PREFIX_TAG));

        if (isNull(budget) && tags.isEmpty()) {
            throw new ParseException(String.format(MESSAGE_INVALID_COMMAND_FORMAT,
                    FilterCustomerCommand.MESSAGE_USAGE));
        }

        return new FilterCustomerCommand(new BudgetAndTagsInRangePredicate(budget, tags));
    }

}
