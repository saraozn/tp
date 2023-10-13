---
layout: page
title: User Guide
---

PropertyMatch is a desktop application for property agents who want to organise their client profiles with their corresponding properties. If you can type fast, PropertyMatch can get your contact management tasks done faster than traditional GUI apps.

* Table of Contents
  {:toc}

--------------------------------------------------------------------------------------------------------------------

## Quick start

1. Ensure you have Java `11` or above installed in your Computer.

1. Download the latest `propertymatch.jar`.

1. Copy the file to the folder you want to use as the _home folder_ for your PropertyMatch.

1. Open a command terminal, `cd` into the folder you put the jar file in, and use the `java -jar propertymatch.jar` command to run the application.<br>
   A GUI similar to the below should appear in a few seconds. Note how the app contains some sample data.<br>
   ![Ui](images/Ui.png)

1. Type the command in the command box and press Enter to execute it. e.g. typing **`help`** and pressing Enter will open the help window.<br>
   Some example commands you can try:

    * `list` : Lists all contacts.

    * `add n/John Doe p/98765432 e/johnd@example.com a/John street, block 123, #01-01` : Adds a contact named `John Doe` to the Address Book.

    * `delete 3` : Deletes the 3rd contact shown in the current list.

    * `clear` : Deletes all contacts.

    * `exit` : Exits the app.

1. Refer to the [Features](#features) below for details of each command.

--------------------------------------------------------------------------------------------------------------------

## Features

<div markdown="block" class="alert alert-info">

**:information_source: Notes about the command format:**<br>

* Words in `UPPER_CASE` are the parameters to be supplied by the user.<br>
  e.g. in `add n/NAME`, `NAME` is a parameter which can be used as `add n/John Doe`.

* Items in square brackets are optional.<br>
  e.g `n/NAME [t/TAG]` can be used as `n/John Doe t/friend` or as `n/John Doe`.

* Items with `…`​ after them can be used multiple times including zero times.<br>
  e.g. `[t/TAG]…​` can be used as ` ` (i.e. 0 times), `t/friend`, `t/friend t/family` etc.

* Parameters can be in any order.<br>
  e.g. if the command specifies `n/NAME p/PHONE_NUMBER`, `p/PHONE_NUMBER n/NAME` is also acceptable.

* Extraneous parameters for commands that do not take in parameters (such as `help`, `list`, `exit` and `clear`) will be ignored.<br>
  e.g. if the command specifies `help 123`, it will be interpreted as `help`.

* If you are using a PDF version of this document, be careful when copying and pasting commands that span multiple lines as space characters surrounding line-breaks may be omitted when copied over to the application.
</div>

### Adding a property: `addprop`

Adds a property to the application.

Format: `addprop n/NAME a/ADDRESS [c/CHARACTERISTIC] ph/number pr/price`

Parameter:
* `n/NAME`				         : The name of the property (String)
* `a/ADDRESS`		             : The address of the property (String)
* `c/CHARACTERISTIC` (Optional)  : The characteristics of the property (String)
* `ph/NUMBER`                    : The contact number (Integer)
* `pr/PRICE`                     : The price of the property in psf (Number)                                  : The price of the property in psf (Number)

Examples:
* addprop n/Fredy a/randomAddress c/bright;sunny;big;square ph/91135235 pr/5
* addprop n/Fredy a/randomAddress ph/91135235 pr/5

When command succeeds:
* `Property NAME has been added`

When command fails:
* `This property already exist` if the property have the same name and address
* `Missing name parameter for add properties command` for missing name parameter
* `Missing address parameter for add properties command` for missing address parameter
* `Missing number parameter for add properties command` for missing name parameter
* `Missing price parameter for add properties command` for missing price parameter
* `Invalid Command` for mispelling of command

### Adding a customer: `addcust`

Adds a customer to the application.

Format: `addcust n/NAME p/PHONE e/EMAIL [b/BUDGET] [c/CHARACTERISTIC]`

Parameter:
* `NAME`				         : The name of the customer (String)
* `PHONE`		                 : The phone number of the customer (String)
* `EMAIL`				         : The email of the customer (String)
* `BUDGET` (Optional)		     : The budget of the customer (Integer)
* `c/CHARACTERISTIC` (optional)  : The characteristics of the property the customer is looking for (String)                                      : The price of the property in psf (Number)

Examples:
* `addcust n/Fredy p/12345678 e/fredylawrence@gmail.com b/100000`
* `addcust n/Boedi p/88888888 e/boedi@gmail.com c/white`
* `addcust n/Phoebe p/87654321 e/pb@gmail.com`

When command succeeds:
* `Customer NAME has been added`

When command fails:
* `Missing name parameter for add customers command` for missing name parameter
* `Missing phone parameter for add customers command` for missing phone parameter
* `Missing email parameter for add customers command` for missing email parameter
* `Invalid Command` for mispelling of command


### Listing all customers : `listcust`

Updates the Customer List to show all customers in your database.

Format: `listcust`

No additional parameters are needed for this command and they will be ignored if used.

When command succeeds: Customer list will be updated to show all properties in your database.


### Listing all properties : `listprop`

Updates the Property List to show all properties in your database.

Format: `listprop`

No additional parameters are needed for this command and they will be ignored.

When command succeeds: Property list will be updated to show all properties in your database.


When command fails: Invalid command for misspelling of command

### Deleting a customer : `delcust`

Deletes the specified customer and their corresponding details from the database.

Format: `delcust INDEX`

* Deletes the customer at the specified `INDEX`.
* The index refers to the index number shown in the displayed customer list.
* The index **must be a positive integer** 1, 2, 3, …​

Examples:
* `list` followed by `delcust 2` deletes the 2nd person in the customer list.

When command succeeds:
* `deleted customer 3`

When command fails:
* `Missing customer index` for missing parameter
* `No such customer index` for wrong parameter/ index beyond list size
* `Invalid command` for misspelling of command

### Deleting a property : `delprop`

Format: `delprop INDEX`

* Deletes the property at the specified `INDEX`.
* The index refers to the index number shown in the displayed property list.
* Acceptable parameters are integers within the property list size.
* The index **must be a positive integer** 1, 2, 3, …​

Examples:
* `delprop 2` deletes the 2nd property in the address book.

When command succeeds: `deleted property 2`

When command fails:
* `Missing property index` for missing parameter
* `No such property index` for wrong parameter or index beyond list size
* `Invalid command` for misspelling of command


### Exiting the program : `exit`

Displays a goodbye message. Exit the application after 3 seconds.

Format: `exit`

When command succeeds: Exit from application

When command fails: Invalid command for misspelling of command

--------------------------------------------------------------------------------------------------------------------

## FAQ

**Q**: How do I transfer my data to another Computer?<br>
**A**: Install the app in the other computer and overwrite the empty data file it creates with the file that contains the data of your previous PropertyMatch home folder.

**Q**: How do I install Java 11?<br>
**A**: Follow this [link](https://www3.ntu.edu.sg/home/ehchua/programming/howto/jdk_howto.html) for steps to download Java.

**Q**: Help! I can’t seem to get a command to work…<br>
**A**: Refer to the features section of our guide for command information and syntax. Make sure that you have supplied all necessary inputs for the command and specified the flags in a correct manner.
--------------------------------------------------------------------------------------------------------------------

## Known issues

1. **When using multiple screens**, if you move the application to a secondary screen, and later switch to using only the primary screen, the GUI will open off-screen. The remedy is to delete the `preferences.json` file created by the application before running the application again.

--------------------------------------------------------------------------------------------------------------------

## Command summary

| Action       | Format, Examples                                                                                                                                         |
|--------------|----------------------------------------------------------------------------------------------------------------------------------------------------------|
| **Addprop**  | `addprop n/NAME a/ADDRESS [c/CHARACTERISTIC] ph/number pr/price` <br> e.g., `addprop n/Fredy a/randomAddress c/bright;sunny;big;square ph/91135235 pr/5` |
| **Addcust**  | `addcust n/NAME p/PHONE e/EMAIL [b/BUDGET] [c/CHARACTERISTIC]` <br> e.g., `addcust n/Fredy p/12345678 e/fredylawrence@gmail.com b/100000`                |
| **Delprop**  | `delprop INDEX`<br> e.g., `delprop 3`                                                                                                                    |
| **Delcust**  | `delcust INDEX`<br> e.g., `delcust 3`                                                                                                                    |
| **Listprop** | `listprop`                                                                                                                                               |
| **Listcust** | `listcust`                                                                                                                                               |
| **Exit** | `exit`|
