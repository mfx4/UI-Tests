Feature: Sports Related Articles

  @wip
  Scenario: Read about all articles related to sports
    Given User navigates to sport page
    When User searches option to find all articles related to "sports"
    Then User gets  first heading and the last heading