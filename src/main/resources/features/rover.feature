@regression
Feature: Mars Rovers Test

  Background: : Rover Initialisation
    Given Rover gets initialised

  Scenario Outline: Rover movement to x, y position with specific location
    When Rover is commanded to move "<process>"
    Then Print the final position
    Examples:
      | process   |
      | LMLMLMLMM |
      | RMMMRM    |

  Scenario Outline: Rover movement with an example
    When Rover is located at <x>,<y>,"<direction>"
    And Rover is commanded to move "<process>"
    Then Print the final position
    Examples:
      | x | y | direction | process    |
      | 1 | 2 | N         | LMLMLMLMM  |
      | 3 | 3 | E         | MMRMMRMRRM |
      | 0 | 0 | N         | MM         |
