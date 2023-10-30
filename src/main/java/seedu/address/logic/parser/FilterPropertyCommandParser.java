package seedu.address.logic.parser;

import seedu.address.logic.commands.FilterCustomerCommand;
import seedu.address.logic.commands.FilterPropertyCommand;
import seedu.address.logic.parser.exceptions.ParseException;
import seedu.address.model.property.Price;
import seedu.address.model.property.PriceAndTagsInRangePredicate;
import seedu.address.model.tag.Tag;

import java.util.Set;

import static java.util.Objects.isNull;
import static java.util.Objects.requireNonNull;
import static seedu.address.logic.Messages.MESSAGE_INVALID_COMMAND_FORMAT;
import static seedu.address.logic.parser.CliSyntax.*;

/**
 * Filters and lists all properties in property book whose price and/or tags are selected.
 */
public class FilterPropertyCommandParser implements Parser<FilterPropertyCommand> {
    /**
     * Parses the given {@code String} of arguments in the context of the FilterPropertyCommand
     * and returns a FilterPropertyCommand object for execution.
     * @throws ParseException if the user input does not conform the expected format
     */
    public FilterPropertyCommand parse(String args) throws ParseException {
        requireNonNull(args);
        Price price = null;
        Set<Tag> tags;
        ArgumentMultimap argMultimap =
                ArgumentTokenizer.tokenize(args, PREFIX_PRICE, PREFIX_TAG);

        argMultimap.verifyNoDuplicatePrefixesFor(PREFIX_PRICE);
        if (argMultimap.getValue(PREFIX_PRICE).isPresent()) {
            price = ParserUtil.parsePrice(argMultimap.getValue(PREFIX_PRICE).get());
        }

        tags = ParserUtil.parseTags(argMultimap.getAllValues(PREFIX_TAG));

        if (isNull(price) && tags.isEmpty()) {
            throw new ParseException(String.format(MESSAGE_INVALID_COMMAND_FORMAT,
                    FilterCustomerCommand.MESSAGE_USAGE));
        }

        return new FilterPropertyCommand(new PriceAndTagsInRangePredicate(price, tags));
    }
}
