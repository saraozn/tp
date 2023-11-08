---
layout: page
title: User Guide
---

![Logo](images/Logo.png)

Greetings property agents! A warm welcome to our user guide, your companion for navigating and maximizing the full potential of PropertyMatch.

--------------------------------------------------------------------------------------------------------------------

## Table of Contents

* Table of Contents
{:toc}

--------------------------------------------------------------------------------------------------------------------

## Introduction
[Back to Table of Contents](#table-of-contents)

PropertyMatch is a **contact and property management system** that aims to help you, property agents, to organise their client profiles with their corresponding properties.

With PropertyMatch, you can easily
- **Match** your existing customers and properties
- **Filter** your existing customers and properties to your needs
- **Find** that customer or property you are looking for, instead of relying on your memory
- and so much more...!

With these powerful features, you can easily capitalise on your network, allowing you to convert them into your valuable leads. This can give you the revenue boost you needed to become an all-star property agent.

The only tools you need to make use of the full suite of capabilities PropertyMatch has to offer are your hands and a keyboard.

This **user guide** aims to provide you with an in-depth overview of how to set up, use, and troubleshoot PropertyMatch. Take a look at the [Command Summary](#command-summary) - your cheatsheet for the different commands along with how to use them, or dive into the [Quick Start](#quick-start) section to get started. Happy exploring!

--------------------------------------------------------------------------------------------------------------------

## Using this Guide
[Back to Table of Contents](#table-of-contents)

As property agents, we understand that using a [Command Line Interface (CLI)](https://en.wikipedia.org/wiki/Command-line_interface) might not be your forte. Fear not! Our application is tailored just for you with simplicity in mind, with easy to use commands that you will naturally reach to without having to remember how to use them.

* Embark on your PropertyMatch journey using our [Quick Start](#quick-start) Guide - the express lane to get PropertyMatch up and running in no time!
* Afterwhich, you can head over to our [Interface Layout](#interface-layout) section to familiarise yourself with our snazzy interface and discover the ins and outs of the [CLI](#2-command-input-and-output-boxes).

Let the fun begin – because who said setting up can't be a joyride?

If you have any doubts while using PropertyMatch, do head over to our FAQ section to view comprehensive answers to some frequently asked questions. You may also contact us at [hello@propertymatch.com](mailto:hello@propertymatch.com) if you have any other questions.

In addition, here are some symbols that will give you a more enjoyable time using our guide:

| Symbol               | Meaning                                                                                        |
|----------------------|------------------------------------------------------------------------------------------------|
| :information_source: | Note. Provides additional information.                                                         |
| :bulb:               | Helpful tip that will improve your experience.                                                 |
| :exclamation:        | Warning. Attempting to perform an action with a warning will lead to undesirable consequences. |

<div markdown="block" class="alert alert-primary">

**:information_source: Note:**<br>
* These symbols will be encapsulated in a box as such.
</div>

--------------------------------------------------------------------------------------------------------------------


## Interface Layout
[Back to Table of Contents](#table-of-contents)

When you launch PropertyMatch, PropertyMatch will appear on your screen as a window. Let's take a look at the 5 different components
that make up this window.

![UserInterface](images/user-guide/UserInterface.png)

### 1. Menu Bar
The Menu Bar is your command center, allowing you to exit the application and look for the link to our user guide.

### 2. Command Input and Output Boxes
These boxes are located at the top section of the window.<br><br>
![CommandBox](images/user-guide/CommandBox.png)<br><br>
The **command input box** is located where the placeholder text `Enter command here...` is.<br>
Clicking on it will allow you to type commands for PropertyMatch to execute.

The **command output box** is located directly beneath the **command input box**. Upon execution of any command, PropertyMatch will
display some information regarding the command, regardless of whether the command is successfully or not successfully executed.
In the image above, it is displaying the message "Listed all customers", the message shown after successfully executing
the [List Customers Command](#listing-all-customers-listcust).

<div markdown="block" class="alert alert-primary">

**:information_source: Note:**<br>
* If a command is not successfully executed, the text within the command input box will turn <span style="color:red">red</span>.
</div>

Here are some commands you can test to start with.

* **`listcust`** : Lists all customers in the database.

* **`addcust n/ Tim Cook p/91234567 e/cook@apple.com b/2500000 c/bright c/sunny`** :
  Adds a customer named "Tim Cook" with a specified phone number and email to the database.
  This customer has a specified budget, and desired characteristics for the property he wants to buy.

* **`delcust 1`** : Deletes a customer at index 1 of the [customer list](#2-customer-list) from the database.

* **`help`** : Displays a help window.

* **`exit`** : Exits the application.

You can refer to the [Features](#features) below for the details of each command.

### 3. Customer List
You can find the customer list located at the left section of the window.<br><br>
<img src="images/user-guide/CustomerList.png" width="300" /><br><br>
The customer list displays information regarding customers who are currently stored in PropertyMatch's database.

Note that it might not be showing *all* the customers in the database all the time (check out the [FAQ](#faq) for more information).

You can also filter and modify the customer list using the commands given in the [Features](#features) section below.

### 4. Property List
You can find the property list located at the right section of the window.<br><br>
<img src="images/user-guide/PropertyList.png" width="300" /><br><br>
The property list displays information regarding properties that are currently stored in PropertyMatch's database.

Note that it might not be showing *all* the properties in the database all the time (check out the [FAQ](#faq) for more information).

You can also filter and modify the property list using the commands given in the [Features](#features) section below.

### 5. Help Window
This will appear as a separate window.
![Help Window](images/user-guide/HelpWindow.png)
The __help window__ displays a link to PropertyMatch's User Guide, which is the online version of this document. :)

It appears when you execute the [Help Command](#viewing-help-help).

--------------------------------------------------------------------------------------------------------------------

## Quick start
[Back to Table of Contents](#table-of-contents)

1. Ensure you have Java `11` or above installed in your Computer.
    * The method to check the Java version you use will be different for every operating system.
        * **Windows** users: <br>
          Click on the '**Windows**' key and search for '**Command Prompt**' <br>
        * **Mac** users: <br>
          Click on '**F4**' and search for '**Terminal**'
        * **Linux** users: <br>
          Click on '**Ctrl**' + '**Alt**' + '**T**' keys simultaneously
    * Once the application is open, type `java -version` and hit '**Enter/ Return**'.
    * The application should state your Java version as `11`.

    * If you do not see `11`, this [link](https://docs.oracle.com/en/java/javase/11/install/overview-jdk-installation.html#GUID-8677A77F-231A-40F7-98B9-1FD0B48C346A) (external link to Oracle) provides a step-by-step installation guide for Java `11`.

2. Download the latest `propertymatch.jar` from our [releases page](https://github.com/AY2324S1-CS2103T-W11-2/tp/releases). After clicking into the release page, scroll down slightly until you reach the Assets section of the page. This section should look like this:<br>
   ![Release page](images/user-guide/ReleasePage.png)

3. Simply click on `propertymatch.jar`, and PropertyMatch should begin automatically downloading on your computer!

4. Copy the `propertymatch.jar` file to the folder you want to use as the _home folder_ for PropertyMatch. All data will be created and stored in that folder. If you are unsure where to place the folder, go to your desktop and create a folder. You can then copy the `propertymatch.jar` file into the folder you just created.

5. Open the folder and double-click on `propertymatch.jar` to open PropertyMatch. If this does not work, please open up the terminal on your computer and type in `java -jar propertymatch.jar` to start the application.

6. A GUI similar to the one below should appear in a few seconds. Note that the app already contains some sample data.<br>
   ![startUi](images/startUi.png)

Congratulations! PropertyMatch is now set up and ready to work on your system.

If you encounter any problems during the setup process, please check out the FAQ section of this guide, which hopefully contains some information that can help you diagnose your issue.

<div markdown="block" class="alert alert-danger">

**:exclamation: Caution (for advanced users):**<br>
* On first launch, PropertyMatch will create a few files that have the extension `.json` in its *home directory*. These files are used
by PropertyMatch to store its data. <br>
* **Edit these at your own risk**, as PropertyMatch will start with an empty database if it detects any
error in the formatting of the data in these files.
</div>
<br>

--------------------------------------------------------------------------------------------------------------------

## Features
[Back to Table of Contents](#table-of-contents)

PropertyMatch's features are mostly in the form of commands you can input into the [command input box](#1-command-input-and-output-boxes). We will now go into the details about each feature of PropertyMatch.
If you just want a quick summary of all the feature PropertyMatch has, do take a look at the [command summary](#command-summary) section.

<div markdown="block" class="alert alert-primary">

**:information_source: Notes about the command format:**<br>

* Words in `UPPER_CASE` are the parameters to be supplied by the user.<br>
  e.g. in `add n/NAME`, `NAME` is a parameter which can be used as `add n/John Doe`.

* Items in square brackets are optional.<br>
  e.g `n/NAME [c/CHARACTERISTIC]` can be used as `n/Tim Cook c/smart` or as `n/John Doe`.

* Items with `…`​ after them can be used multiple times including zero times.<br>
  e.g. `[c/CHARACTERISTIC]…​` can be used as ` ` (i.e. 0 times), `c/smart`, `c/smart c/rich` etc.

* Parameters can be in any order.<br>
  e.g. if the command specifies `n/NAME p/PHONE_NUMBER`, `p/PHONE_NUMBER n/NAME` is also acceptable.

* Extraneous parameters for commands that do not take in parameters (such as `help`, `list`, `exit` and `clear`) will be ignored.<br>
  e.g. if the command specifies `help 123`, it will be interpreted as `help`.

* If you are using a PDF version of this document, be careful when copying and pasting commands that span multiple lines as space characters surrounding line-breaks may be omitted when copied over to the application.
</div>

### Add Commands
#### Adding a customer: `addcust`
[Back to Table of Contents](#table-of-contents)

Adds a customer to your application.

Format: `addcust n/NAME p/PHONE e/EMAIL b/BUDGET [c/CHARACTERISTIC]…​`

* `n/NAME`				         : Name of the customer
* `p/PHONE_NUMBER`		         : Phone number of the customer
* `e/EMAIL`				         : Email of the customer
* `b/BUDGET`		             : Budget of the customer
* `c/CHARACTERISTIC` (optional)  : Characteristics of the property the customer is looking for

Examples:
* `addcust n/Fredy p/12345678 e/fredylawrence@gmail.com b/1000000`
* `addcust n/Phoebe p/87654321 e/pb@gmail.com b/200000 c/bright c/sunny c/white`

You should see the message in the [output box](#2-command-input-and-output-boxes) as below when a customer is successfully added. The new customer will be added to the bottom of your list for easy reference!
![addcustUi](images/user-guide/addcustUi.png)

<div markdown="block" class="alert alert-warning">

**:bulb: Tip:**<br>
* If you encounter an error, ensure that you have typed the command accurately with all the parameters present. (refer to the example commands above)<br>
* The characteristics field is optional. If it is not set, the characteristics field will be empty.
</div>

<div markdown="block" class="alert alert-primary">

**:information_source: Note:**<br>
* To ensure that your database remains neat, PropertyMatch will warn you when you try to add duplicate customers that have the same name.
</div>


#### Adding a property: `addprop`
[Back to Table of Contents](#table-of-contents)

Adds a property to your application.

Format: `addprop n/NAME a/ADDRESS p/PHONE_NUMBER pr/PRICE [c/CHARACTERISTIC]…​`

* `n/NAME`				         : Name of the property
* `p/PHONE`                      : Contact number
* `a/ADDRESS`		             : Address of the property
* `p/PHONE_NUMBER`               : Phone number of the owner of the property
* `pr/PRICE`                     : Price of the property
* `c/CHARACTERISTIC` (Optional)  : Characteristics of the property

Examples:
* `addprop n/Aqua Heights a/195 Paya Lebar 3 #18-32 p/91135235 pr/700000`
* `addprop n/Skyview a/214 Clementi Ave 2 #09-78 p/91135235 pr/500000 c/bright c/sunny c/big c/square`

You should get a result similar to adding customers when the property is successfully added!

<div markdown="block" class="alert alert-warning">

**:bulb: Tip:**<br>
* Similar to adding a customer, ensure that you have typed the command accurately with all the parameters present. (refer to the example commands above)<br>
* The characteristics field is also optional. If it is not set, the characteristics field will be empty.
</div>

<div markdown="block" class="alert alert-primary">

**:information_source: Note:**<br>
* Similar to adding a customer, PropertyMatch will warn you when you try to add duplicate customers that have the name.
</div>


### List Commands

<div markdown="block" class="alert alert-primary">

**:information_source: Note:**<br>
* The List Commands should be used to view all buyers and properties again, after a [Filter Command](#filter-commands), [Find Command](#find-commands), or [Match Command](#match-commands) is executed.
</div>

#### Listing all customers: `listcust`
[Back to Table of Contents](#table-of-contents)

Updates the [Customer List](#3-customer-list) to show all customers in your database.

Format: `listcust`

No additional parameters are needed for this command, and they will be ignored if used.


#### Listing all properties: `listprop`

Updates the [Property List](#4-property-list) to show all properties in your database.

Format: `listprop`

No additional parameters are needed for this command, and they will be ignored if used.


### Delete Commands
#### Deleting a customer: `delcust`
[Back to Table of Contents](#table-of-contents)

Deletes the specified customer and their corresponding details from your database.

Format: `delcust INDEX`

* Deletes the customer at the specified `INDEX`.
* The index refers to the index number shown in the displayed customer list.
* Acceptable indexes are integers within the customer list size.
* The index **must be a positive integer** 1, 2, 3, …​

Examples:
* `listcust` followed by `delcust 2` deletes the 2nd customer in the customer list.

Upon successfully deleting a customer, the confirmation message will appear in the [output box](#2-command-input-and-output-boxes) as below!

![delcustcustUi](images/user-guide/delcustUi.png)

#### Deleting a property: `delprop`
[Back to Table of Contents](#table-of-contents)

Deletes the specified property and its corresponding details from your database.

Format: `delprop INDEX`

* Deletes the property at the specified `INDEX`.
* The index refers to the index number shown in the displayed property list.
* Acceptable indexes are integers within the property list size.
* The index **must be a positive integer** 1, 2, 3, …​

Examples:
* `listprop` followed by `delprop 2` deletes the 2nd property in the address book.

The result will be similar to deleting customers when the property is successfully deleted!

### Edit Commands
#### Editing a customer: `editcust`
[Back to Table of Contents](#table-of-contents)

Edits the details of your customer.

Format: `editcust INDEX [n/NAME] [p/PHONE] [e/EMAIL] [b/BUDGET] [c/CHARACTERISTIC]…​`
* Edits the customer at the specified `INDEX`. The index refers to the index number shown in the displayed customer list. The index **must be a positive integer** 1, 2, 3, …​
* At least one of the optional fields must be provided.
* Existing values will be updated to the input values.
<div markdown="block" class="alert alert-primary">

**:information_source: Note:**<br>

* When editing tags, the existing tags of your customer will be removed i.e adding of tags is not cumulative.
</div>

<div markdown="block" class="alert alert-warning">

**:bulb: Tip:** <br>

* You can remove all your customer’s tags by typing `c/` without specifying any tags after it.
</div>

Examples:
*  `editcust 2 p/91234567 e/andrew@gmail.com` Edits the phone number and email of the 1st customer to be `91234567` and `andrew@gmail.com` respectively.
*  `editcust 1 n/Andrew c/` Edits the name of the 2nd customer to be `Andrew` and clears all existing tags.

You should see a similar message in the [output box](#2-command-input-and-output-boxes) as below when your customer's details is successfully edited.

When `editcust 1 n/Andrew c/` is entered

![editcustUi](images/user-guide/editcustUi.png)



#### Editing a property: `editprop`
[Back to Table of Contents](#table-of-contents)

Edits the details of your property.

Format: `editprop INDEX [n/NAME] [p/PHONE] [pr/PRICE] [a/ADDRESS] [c/CHARACTERISTIC]…​`
* Edits the property at the specified `INDEX`. The index refers to the index number shown in the displayed property list. The index **must be a positive integer** 1, 2, 3, …​
* At least one of the optional fields must be provided.
* Existing values will be updated to the input values.

<div markdown="block" class="alert alert-primary">

**:information_source: Note:** <br>
* When editing tags, the existing tags of the property will be removed i.e adding of tags is not cumulative.
</div>

<div markdown="block" class="alert alert-warning">

**:bulb: Tip:** <br>
* You can remove all the property’s tags by typing `c/` without specifying any tags after it.
</div>

Examples:
*  `editprop 1 p/91234567 a/43 Clementi Avenue 3 #03-543` Edits the phone number and address of the 1st property to be `91234567` and `43 Clementi Avenue 3 #03-543` respectively.
*  `editprop 2 n/Skyview c/` Edits the name of the 2nd property to be `Skyview` and clears all existing characteristics.

Successfully editing your property would produce a similar result as editing a customer!

### Find Commands
#### Finding a customer: `findcust`
[Back to Table of Contents](#table-of-contents)

Finds and returns a customer or a list of customers, from all your customers whose name contains the substring inputted.

Format: `findcust NAME`

* Finds and returns the customer(s) whose names begins with the `NAME` substring at any position within their name.
* The `NAME` must be in the same language as the name, i.e English.
* The `NAME` should only contain the relevant alphabets

Examples:
* `list` followed by `findcust F` finds and returns the customer(s) whose names begin with "F" at any position within their name in the customer list.
* `list` followed by `findcust B D` finds and returns the customer(s) whose names begin with "B" or "D" at any position within their name in the customer list.

You should see the message in the [output box](#2-command-input-and-output-boxes) as below when you have successfully found your customers.

When `findcust B D` is entered.

![findcustUi](images/user-guide/findcustUi.png)

#### Finding a property: `findprop`
[Back to Table of Contents](#table-of-contents)

Finds and returns a property or a list of properties, from all your properties whose name contains the substring inputted.

Format: `findprop NAME`

* Finds and returns the property or properties whose name contains the `NAME` substring.
* The `NAME` must be in the same language as the name, i.e English.
* The `NAME` should only contain the relevant alphabets

Examples:
* `list` followed by `findprop F` finds and returns the property or properties with names that begin with "F" in the property list.
* `list` followed by `findprop F J` finds and returns the property or properties with names that begin with "F" or "J" in the property list.

Successfully finding the property you want would produce a similar result as finding a customer!

### Filter Commands

#### Filtering customers: `filtercust`
[Back to Table of Contents](#table-of-contents)

Filters all your customers to only show customers that fit the criteria.

Format: `filtercust [b/BUDGET] [c/CHARACTERISTIC]…​`

* Filter and return the customers whose budget is bigger than or equals to the `BUDGET` and who is/are seeking for properties which have all the `CHARACTERISTIC`.
* `b/BUDGET` (optional)          : Budget of the customer
* `c/CHARACTERISTIC` (optional)  : Characteristics of the property the customer is looking for

<div markdown="block" class="alert alert-primary">

**:information_source: Note:**<br>
* While both `BUDGET` and `CHARACTERISTIC` are optional, note that at least one of them should be present.
</div>

<div markdown="block" class="alert alert-warning">

**:bulb: Tip:** <br>
* Omitting`BUDGET` will return customers is search of properties with the specified `CHARACTERISTIC`.<br>
* Omitting `CHARACTERISTIC` will return customers with a budget is greater than or equal to `BUDGET`.
</div>

Examples:
* `filtercust b/250000 c/white c/big`
* `filtercust c/white`

You should see the message in the [output box](#2-command-input-and-output-boxes) as below when you have successfully filtered your customers.

When `filtercust c/white` is entered.

![filtercustUi](images/user-guide/filtercustUi.png)

#### Filter properties: `filterprop`
[Back to Table of Contents](#table-of-contents)

Filters all your properties to only show properties that fit the criteria.

Format: `filterprop [pr/PRICE] [c/CHARACTERISTIC]…​`

* Filter and return properties whose price is lower than or equals to the `pr/PRICE` and which has or have all the `c/CHARACTERISTIC`.
* `pr/PRICE` (optional)          : The price of the property
* `c/CHARACTERISTIC` (optional)  : The characteristics of the property

<div markdown="block" class="alert alert-primary">

**:information_source: Note:**<br>
* While both `PROPERTY` and `CHARACTERISTIC` are optional, note that at least one of them should be present.
</div>

<div markdown="block" class="alert alert-warning">

**:bulb: Tip:**<br>
* Omitting `PRICE` will return the properties which have all the `CHARACTERISTIC`.<br>
* Omitting `CHARACTERISTIC` will return properties priced lower than or equal to `PRICE`.
</div>


Examples:
* `filterprop pr/250000 c/white c/big`
* `filterprop c/white`

Successfully filtering your properties would produce a similar result as filtering your customers!

### Match Commands

#### Matching properties to a customer: `matchcust`
[Back to Table of Contents](#table-of-contents)

Shows the list of properties that matches the criteria of your customer.

Format: `matchcust INDEX`

* Matches the customer at the specified `INDEX`.
* The index refers to the index number shown in the displayed customer list.
* Acceptable parameters are integers within the customer list size.
* The index **must be a positive integer** 1, 2, 3, …​

Examples:
* `matchcust 1`
* `matchcust 10`

A message in the [output box](#2-command-input-and-output-boxes) identical to the one below should appear when you have successfully matched your customers!

![Ui](images/user-guide/Ui.png)

#### Matching customers to a property: `matchprop`
[Back to Table of Contents](#table-of-contents)

Shows the list of customers that matches the criteria of your property.

Format: `matchprop INDEX`

* Matches the property at the specified `INDEX`.
* The index refers to the index number shown in the displayed property list.
* Acceptable parameters are integers within the property list size.
* The index **must be a positive integer** 1, 2, 3, …​

Examples:
* `matchprop 1`
* `matchprop 10`

Matching your properties successfully will output a similar message as matching your customers.

### General Features
#### Clear the data in the application: `clear`
[Back to Table of Contents](#table-of-contents)

Resets all data in the application. (i.e. Deletes all entries in your Customer List and Property List)

Format: `clear`

 <div markdown="block" class="alert alert-danger">

**:exclamation: Caution:**<br>
* Clearing the data in your application will result in all data being lost! Be careful when you perform this operation and be sure that you want to reset all data in the app.
</div>
<br>

#### Exiting the program: `exit`
[Back to Table of Contents](#table-of-contents)

Displays a goodbye message. Exit the application after 3 seconds.

Format: `exit`


#### Viewing help: `help`
[Back to Table of Contents](#table-of-contents)

Displays a window containing the link to PropertyMatch's user guide if you need further help.

Format: `help`


#### Saving data
[Back to Table of Contents](#table-of-contents)

PropertyMatch data is saved in the hard disk automatically after any command that changes the data. There is no need to save manually.


#### Editing the data file
[Back to Table of Contents](#table-of-contents)

PropertyMatch's data is saved as 2 separate JSON files `[JAR file location]/data/addressbook.json` and `[JAR file location]/data/propertybook.json`. Advanced users are welcome to update data directly by editing those JSON files.


<div markdown="block" class="alert alert-danger">

**:exclamation: Caution (for advanced users):**<br>
* If your changes to the data file makes its format invalid, PropertyMatch will discard all data and start with an empty data file at the next run. Hence, it is recommended to take a backup of the file before editing it.
</div>
<br>


--------------------------------------------------------------------------------------------------------------------

## FAQ
[Back to Table of Contents](#table-of-contents)

**Q**: How do I transfer my data to another Computer?<br>
**A**: Install the app in the other computer and overwrite the empty data file it creates with the file that contains the data of your previous PropertyMatch home folder.

**Q**: How do I install Java 11?<br>
**A**: Follow this [link](https://docs.oracle.com/en/java/javase/11/install/overview-jdk-installation.html#GUID-8677A77F-231A-40F7-98B9-1FD0B48C346A) for steps to download Java 11.

**Q**: Help! I can’t seem to get a command to work…<br>
**A**: Refer to the features section of our guide for command information and syntax. Make sure that you have supplied all necessary inputs for the command and specified the flags in a correct manner.

**Q**: Why is PropertyMatch not displaying all customers/properties in the database?<br>
**A**:  It's possible that the application may not show all customers/properties all the time due to specific commands like [filtering](#filter-commands), [finding](#finding-commands), or [matching](#match-commands) that have been executed. If you're encountering this issue, consider using the [list commands](#list-commands) to ensure you're viewing the complete list.

**Q**: I don’t understand some terms used in the guide…<br>
**A**: Please check out the key definitions portion of the guide and see if the term that you are confused about is documented there!

**Q**: I deleted my data file! Is there any way to recover the data that I lost?<br>
**A**: Try looking in your computer’s trash bin on macOS or recycle bin on Windows for the files that were deleted. If the files can’t be found, then we apologise, but there is currently no way for you to retrieve lost data. 🙁

**Q**: How do I uninstall PropertyMatch?<br>
**A**: We are sad to see you go 🙁 PropertyMatch is not installed onto your hard drive, so you only need to delete the folder that contains propertymatch.jar (that is, the home folder of PropertyMatch).

**Q**: Do I need an active internet connection to use PropertyMatch?<br>
**A**: No, PropertyMatch is a standalone application that does not require an internet connection to function. However, you'll need an internet connection to download it to your machine.

--------------------------------------------------------------------------------------------------------------------

## Known issues
[Back to Table of Contents](#table-of-contents)

1. **When using multiple screens**, if you move the application to a secondary screen, and later switch to using only the primary screen, the GUI will open off-screen. The remedy is to delete the `preferences.json` file created by the application before running the application again.

--------------------------------------------------------------------------------------------------------------------

## Command summary
[Back to Table of Contents](#table-of-contents)

| Action                           | Format, Examples                                                                                                                                                          |
|----------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| **Add customer**                 | `addcust n/NAME p/PHONE_NUMBER e/EMAIL b/BUDGET [c/CHARACTERISTIC]…​` <br> e.g., `addcust n/Phoebe p/87654321 e/pb@gmail.com b/200000 c/bright c/sunny c/white`           |
| **Add property**                 | `addprop n/NAME a/ADDRESS [c/CHARACTERISTIC]…​ p/PHONE_NUMBER pr/PRICE` <br> e.g., `addprop n/Fredy a/randomAddress c/bright c/sunny c/big c/square p/91135235 pr/500000` |
| **Delete customer**              | `delcust INDEX`<br> e.g., `delcust 3`                                                                                                                                     |
| **Delete property**              | `delprop INDEX`<br> e.g., `delprop 3`                                                                                                                                     |
| **Edit customer**                | `editcust INDEX [n/NAME] [p/PHONE_NUMBER] [e/EMAIL] [b/BUDGET] [c/CHARACTERISTIC]…​` <br> e.g., `editcust 1 p/91234567 e/andrew@gmail.com`                                |
| **Edit property**                | `editprop INDEX [n/NAME] [a/ADDRESS] [c/CHARACTERISTIC]…​ [p/PHONE_NUMBER] [pr/PRICE]` <br> e.g., `editprop 1 ph/91234567 a/43 Clementi Avenue 3 #03-543`                 |
| **List properties**              | `listprop`                                                                                                                                                                |
| **List customers**               | `listcust`                                                                                                                                                                |
| **Find customers**               | `findcust NAME` <br> e.g., `findcust Amy`                                                                                                                                 |
| **Find properties**              | `findprop NAME` <br> e.g., `findprop Skyview`                                                                                                                             |
| **Filter properties**            | `filterprop [pr/PRICE] [c/CHARACTERISTIC]…​` <br> e.g., `filterprop pr/250000 c/white`                                                                                    |
| **Filter customers**             | `filtercust [b/BUDGET] [c/CHARACTERISTIC]…​` <br> e.g., `filtercust b/250000 c/white`                                                                                     |
| **Match properties to customer** | `matchcust INDEX` <br> e.g., `matchcust 1`                                                                                                                                |
| **Match customers to property**  | `matchprop INDEX` <br> e.g., `matchprop 1`                                                                                                                                |
| **Clear**                        | `clear`                                                                                                                                                                   |
| **Exit**                         | `exit`                                                                                                                                                                    |
| **Help**                         | `help`                                                                                                                                                                    |
