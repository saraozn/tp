---
layout: page
title: Loh Jian Rong's Project Portfolio Page
---

### Project: PropertyMatch

PropertyMatch is a desktop tool is for property agents who want to organise their client profiles with their corresponding properties. Property agents can boost their efficiency by seamlessly matching their clients with their desired properties.

Given below are my contributions to the project.

* **Code contributed**: [RepoSense link](https://nus-cs2103-ay2324s1.github.io/tp-dashboard/?search=jianrong7&sort=groupTitle&sortWithin=title&timeframe=commit&mergegroup=&groupSelect=groupByRepos&breakdown=true&checkedFileTypes=docs~functional-code~test-code&since=2023-09-22&tabOpen=true&tabType=authorship&tabAuthor=jianrong7&tabRepo=AY2324S1-CS2103T-W11-2%2Ftp%5Bmaster%5D&authorshipIsMergeGroup=false&authorshipFileTypes=docs~functional-code~test-code&authorshipIsBinaryFileTypeChecked=false&authorshipIsIgnoredFilesChecked=false)


* **Enhancements implemented**:
  * Added `listprop` command and tests
    * [#66](https://github.com/AY2324S1-CS2103T-W11-2/tp/pull/66)
    * [#84](https://github.com/AY2324S1-CS2103T-W11-2/tp/pull/84)
  * Added goodbye message to `exit` command
    * [#58](https://github.com/AY2324S1-CS2103T-W11-2/tp/pull/58)
  * Removed traces of AB3
    * [#61](https://github.com/AY2324S1-CS2103T-W11-2/tp/pull/61)
  * Fix CI/CD pipeline errors
    * [#94](https://github.com/AY2324S1-CS2103T-W11-2/tp/pull/94)
  * Added `editcust` command and tests
    * [#110](https://github.com/AY2324S1-CS2103T-W11-2/tp/pull/110)
  * Added `clear` command and tests
    * [#120](https://github.com/AY2324S1-CS2103T-W11-2/tp/pull/120)


* **Contributions to the UG**:
  * Make UG more friendly to property agents using our application in these PRs [#121](https://github.com/AY2324S1-CS2103T-W11-2/tp/pull/121), [#167](https://github.com/AY2324S1-CS2103T-W11-2/tp/pull/167), [#174](https://github.com/AY2324S1-CS2103T-W11-2/tp/pull/174)


* **Contributions to the DG**:
  * Added sequence diagram for edit command in [#97](https://github.com/AY2324S1-CS2103T-W11-2/tp/pull/97)


* **Project management**:
  * Led weekly group meetings
  * Managed milestones `v1.2` - `v1.4` (4 milestones) on GitHub
  * Managed releases `v1.2` - `v1.4` (4 releases) on GitHub


* **Contributions to team-based tasks**:
  * Setting up the GitHub team org and repo
  * Maintaining the issue tracker
  * Release management
  * Updating user guide that are not specific to feature
  * Updating developer guide that are not specific to feature
  * Set up CI for the team repository
  * Enabled assertions in Gradle
  * Filmed product demo for v1.2 and v1.3


* **Review/mentoring contributions**:
  * Reviewed 16 PRs (Links to PR reviews with non-trivial comments below)
    * [#56](https://github.com/AY2324S1-CS2103T-W11-2/tp/pull/56)
    * [#64](https://github.com/AY2324S1-CS2103T-W11-2/tp/pull/64)
    * [#87](https://github.com/AY2324S1-CS2103T-W11-2/tp/pull/87)
    * [#93](https://github.com/AY2324S1-CS2103T-W11-2/tp/pull/93)
    * [#122](https://github.com/AY2324S1-CS2103T-W11-2/tp/pull/122)
    * [#173](https://github.com/AY2324S1-CS2103T-W11-2/tp/pull/173)
  * Consistently answered queries from team members in the team chat


* **Contributions beyond the project team**:
  * Did the product pitch for CS2101
  * Reported 10 bugs for other team during PED
  * Answered queries in the CS2103T forum (Links to answers)
    * [#1](https://github.com/nus-cs2103-AY2324S1/forum/issues/107#issuecomment-1706281857)
    * [#2](https://github.com/nus-cs2103-AY2324S1/forum/issues/92#issuecomment-1704647357)


* **Contributions to the Developer Guide (Extracts)**:
  * `EditCustomerCommand`
    * Added sequence diagram in [#98](https://github.com/AY2324S1-CS2103T-W11-2/tp/pull/98)
    * Added design considerations
      > `EditCustomerCommand` and `EditPropertyCommand` are separate, and both  inherit from the `Command` class.
      >
      > Pros:
      > - Both the `Customer` and `Property` classes have different fields that are exclusive to each other.
      > - This reduces complexity of the system, and unexpected behaviours.
      > - The inheritance of the `Command` class allows us to keep to the Command design pattern, to easily add more types of edit commands in the future, without having to change the existing code.
      > 
      > Cons:
      > - More boilerplate code for each of the classes, which increases the size of the codebase.

* **Contributions to the User Guide (Extracts)**:
  * Added Interface Layout in [#121](https://github.com/AY2324S1-CS2103T-W11-2/tp/pull/121)
  ![UserInterface.png](../images/user-guide/UserInterface.png)
