Feature: Is it Saturday yet?
  Everybody wants to know when it´s Saturday

  Scenario Outline: Today is or is not Saturday
    Given today is "<day>"
    When I ask whether its Saturday yet
    Then I should be told "<answer>"



    Examples:
      | day            | answer |
      | Friday         | Nope   |
      | Saturday         | TGIF   |
      | anything else! | Nope   |