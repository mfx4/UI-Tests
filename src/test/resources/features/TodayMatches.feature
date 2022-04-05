Feature: Make a record of all teams which are playing today

  Background: User navigate to sport page
    @allMatches
    Scenario: Output all team names with a match today
      When User navigates to sport page
      Then User gets all team names
      And If there is no match User gets "no matches today" message
