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

### Adding a customer: `addcust`

Adds a customer to the application.

Format: `addcust n/NAME p/PHONE e/EMAIL b/BUDGET [c/CHARACTERISTIC]…​`

Parameter:
* `n/NAME`				         : The name of the customer (String)
* `p/PHONE`		                 : The phone number of the customer (String)
* `e/EMAIL`				         : The email of the customer (String)
* `b/BUDGET`		             : The budget of the customer (Integer)
* `c/CHARACTERISTIC` (optional)  : The characteristics of the property the customer is looking for (String)

Examples:
* `addcust n/Fredy p/12345678 e/fredylawrence@gmail.com b/1000000`
* `addcust n/Boedi p/88888888 e/boedi@gmail.com b/250000 c/white`
* `addcust n/Phoebe p/87654321 e/pb@gmail.com b/200000`

When command succeeds:
* `New customer added:Name; Phone:PHONE; Email:EMAIL; Budget:BUDGET; Tags:[TAGS]…​`

When command fails:
* `Missing name parameter for add customers command` for missing name parameter
* `Missing phone parameter for add customers command` for missing phone parameter
* `Missing email parameter for add customers command` for missing email parameter
* `Invalid Command` for misspelling of command

### Adding a property: `addprop`

Adds a property to the application.

Format: `addprop n/NAME a/ADDRESS [c/CHARACTERISTIC] ph/number pr/budget`

Parameter:
* `n/NAME`				         : The Name of the property (String)
* `a/ADDRESS`		             : The Address of the property (String)
* `c/CHARACTERISTIC` (Optional)  : The characteristics of the property (String)
* `ph/NUMBER`                    : The contact number (Integer)
* `pr/PRICE`                     : The price of the property in psf (Number)


Examples:
* addprop n/Fredy a/randomAddress c/bright;sunny;big;square ph/91135235 pr/5
* addprop n/Fredy a/randomAddress ph/91135235 pr/5

When command succeeds:
* `New property added:Name; Address:ADDRESS; Phone:PHONE; Price:price; Tags:[TAGS]…​`

When command fails:
* `This property already exist` if the property have the same Name and Address
* `Missing Name parameter for add properties command` for missing Name parameter
* `Missing Address parameter for add properties command` for missing Address parameter
* `Missing number parameter for add properties command` for missing Name parameter
* `Missing price parameter for add properties command` for missing price parameter
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
* `list` followed by `delcust 2` deletes the 2nd customer in the customer list.

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
### Editing a customer : `editcust`
Edits an existing customer.
Format: `editcust INDEX [n/NAME] [ph/PHONE] [e/EMAIL] [b/BUDGET] [c/CHARACTERISTIC]…​`
* Edits the customer at the specified `INDEX`. The index refers to the index number shown in the displayed customer list. The index **must be a positive integer** 1, 2, 3, …​
* At least one of the optional fields must be provided.
* Existing values will be updated to the input values.
* When editing tags, the existing tags of the property will be removed i.e adding of tags is not cumulative.
* You can remove all the person’s tags by typing `c/` without
  specifying any tags after it.
  Examples:
*  `editprop 1 ph/91234567 e/andrew@gmail.com` Edits the phone number and email of the 1st customer to be `91234567` and `andrew@gmail.com` respectively.
*  `edit 2 n/Andrew c/` Edits the name of the 2nd customer to be `Andrew` and clears all existing tags.

### Editing a property : `editprop`
Edits an existing property.
Format: `editprop INDEX [n/NAME] [ph/PHONE] [pr/PRICE] [a/ADDRESS] [c/CHARACTERISTIC]…​`
* Edits the property at the specified `INDEX`. The index refers to the index number shown in the displayed property list. The index **must be a positive integer** 1, 2, 3, …​
* At least one of the optional fields must be provided.
* Existing values will be updated to the input values.
* When editing tags, the existing tags of the property will be removed i.e adding of tags is not cumulative.
* You can remove all the person’s tags by typing `c/` without
  specifying any tags after it.
  Examples:
*  `editprop 1 ph/91234567 a/43 Clementi Avenue 3 #03-543` Edits the phone number and address of the 1st property to be `91234567` and `43 Clementi Avenue 3 #03-543` respectively.
*  `edit 2 n/Skyview t/` Edits the name of the 2nd property to be `Skyview` and clears all existing tags.
* 
### Finding a customer : `findcust`

Finds and returns a customer or a list of customers whose name contains the substring inputted.

Format: `findcust String`

* Finds and returns the customer(s) whose name contains the `String` substring.
* The String must be in the same language as the name, i.e English.
* The String should only contain the relevant alphabets

Examples:
* `list` followed by `findcust F` finds and returns the customer(s) with names that begin with "F" in the customer list.
* `list` followed by `findcust F J` finds and returns the customer(s) with names that begin with "F" and/or "J" in the customer list.


When command succeeds:
* `1 customer listed`

When command fails:
* `Invalid command format` for missing parameter
* `Unknown command` for misspelling of command

### Finding a property : `findprop`

Finds and returns a property or a list of properties whose name contains the substring inputted.

Format: `findprop String`

* Finds and returns the property or properties whose name contains the `String` substring.
* The String must be in the same language as the name, i.e English.
* The String should only contain the relevant alphabets

Examples:
* `list` followed by `findprop F` finds and returns the property or properties with names that begin with "F" in the property list.
* `list` followed by `findprop F J` finds and returns the property or properties with names that begin with "F" and/or "J" in the property list.


When command succeeds:
* `1 property listed`

When command fails:
* `Invalid command format` for missing parameter
* `Unknown command` for misspelling of command

### Filter customers : `filtercust`

Format: `filtercust [b/BUDGET] [c/CHARACTERISTIC]…​`

Parameter:
* `b/BUDGET` (optional)          : The budget of the customer (Integer)
* `c/CHARACTERISTIC` (optional)  : The characteristics of the property the customer is looking for (String)

Notes:
* Even though both `BUDGET` and `CHARACTERISTIC` are optional, at least one of them should exist.

Examples:
* `filtercust b/100000`
* `filtercust b/250000 c/white`
* `filtercust c/white`

When command succeeds:
* `4 customers listed!` when there are 4 customers fulfilling the filter.

When command fails:
* `Invalid command format!` for missing both `BUDGET` and `CHARACTERISTIC` parameters.
* `Unknown command` for misspelling of command.

### Filter properties : `filterprop`

Format: `filtercust [pr/PRICE] [c/CHARACTERISTIC]…​`

Parameter:
* `pr/PRICE` (optional)          : The budget of the property (Integer)
* `c/CHARACTERISTIC` (optional)  : The characteristics of the property (String)

Notes:
* Even though both `PROPERTY` and `CHARACTERISTIC` are optional, at least one of them should exist.

Examples:
* `filterprop pr/100000`
* `filterprop pr/250000 c/white`
* `filterprop c/white`

When command succeeds:
* `4 properties listed!` when there are 4 properties fulfilling the filter.

When command fails:
* `Invalid command format!` for missing both `PRICE` and `CHARACTERISTIC` parameters.
* `Unknown command` for misspelling of command.

### Matching customer : `matchcust`

Format: `matchcust [INDEX]`

Parameter:
* `INDEX`         : The index number of the customer you want to match.

Notes:
* The Index must in the range of customers you have added.

Examples:
* `matchcust 1`
* `matchcust 10`
* `matchcust 32`

When command succeeds:
* `4 properties matched with customer 1!` when there are 4 properties fulfilling the criteria of the customer 1.

When command fails:
* `Invalid command format!` for missing `INDEX` parameters.
* `Unknown command` for misspelling of command.
* `There is no customer with index [INDEX]` for `INDEX` inputted is not in the range of the customers. 

### Matching property : `matchprop`

Format: `matchprop [INDEX]`

Parameter:
* `INDEX`         : The index number of the property you want to match.

Notes:
* The Index must in the range of properties you have added.

Examples:
* `matchprop 1`
* `matchprop 10`
* `matchprop 32`

When command succeeds:
* `4 customers matched with property 1!` when there are 4 customers have the criteria of the property 1.

When command fails:
* `Invalid command format!` for missing `INDEX` parameters.
* `Unknown command` for misspelling of command.
* `There is no proeprty with index [INDEX]` for `INDEX` inputted is not in the range of the properties.

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

**Q**: I don’t understand some terms used in the guide…<br>
**A**: Please check out the key definitions portion of the guide and see if the term that you are confused about is documented there!

**Q**: I deleted my data file! Is there any way to recover the data that I lost?<br>
**A**: Try looking in your computer’s trash bin on macOS or recycle bin on Windows for the files that were deleted. If the files can’t be found, then we apologise, but there is currently no way for you to retrieve lost data. 🙁

**Q**: How do I uninstall PropertyMatch?<br>
**A**: We are sad to see you go 🙁 PropertyMatch is not installed onto your hard drive, so you only need to delete the folder that contains propertymatch.jar (that is, the home folder of PropertyMatch).

--------------------------------------------------------------------------------------------------------------------

## Known issues

1. **When using multiple screens**, if you move the application to a secondary screen, and later switch to using only the primary screen, the GUI will open off-screen. The remedy is to delete the `preferences.json` file created by the application before running the application again.

--------------------------------------------------------------------------------------------------------------------

## Command summary

| Action         | Format, Examples                                                                                                                                             |
|----------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------|
| **Addprop**    | `addprop n/NAME a/ADDRESS [c/CHARACTERISTIC] ph/number pr/budget` <br> e.g., `addprop n/Property a/randomAddress c/bright;sunny;big;square ph/91135235 pr/5` |
| **Addcust**    | `addcust n/NAME p/PHONE e/EMAIL [b/BUDGET] [c/CHARACTERISTIC]` <br> e.g., `addcust n/Fredy p/12345678 e/fredylawrence@gmail.com b/100000`                    |
| **Delprop**    | `delprop INDEX`<br> e.g., `delprop 3`                                                                                                                        |
| **Delcust**    | `delcust INDEX`<br> e.g., `delcust 3`                                                                                                                        |
| **Listprop**   | `listprop`                                                                                                                                                   |
| **Listcust**   | `listcust`                                                                                                                                                   |
| **Filtercust** | `filtercust [b/BUDGET] [c/CHARACTERISTIC]…​` <br> e.g., `filtercust b/250000 c/white`                                                                        |
| **Filterprop** | `filterprop [pr/PRICE] [c/CHARACTERISTIC]…​` <br> e.g., `filterprop pr/250000 c/white`                                                                       |
| **Matchcust**  | `matchcust INDEX`<br> e.g., `matchcust 1`                                                                                                                    |
| **Matchprop**  | `matchprop INDEX`<br> e.g., `matchprop 1`                                                                                                                    |
| **Exit**       | `exit`                                                                                                                                                       |
