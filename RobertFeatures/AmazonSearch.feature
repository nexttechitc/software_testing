Feature: Validate Amazon search

Scenario Outline: Validate Amazon search

Given user visit amazon homepage
When user type "<productname>" and click search icon
Then User should able to see the expected product

Examples:
|productname|
| iphone12 promax |


@Jahan
Scenario: Verify Buy Ticket button Dispaly in Home page

Given user visit amazon homepage
Then  Verify Buy Ticket button Dispaly in Home page
