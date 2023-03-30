Feature: Create a Position
    
    I want to create a position on the map.
    
   
    Scenario Outline: create a position
        Given the position is initialized with x coordinate <startingXCoordinate>
        And the position is initializzed with y coordinate <startingYCoordinate>
        When the position is instantiated
        Then the position is created wtih x coordinate <endingXCoordinate>
        And the position is created wtih y coordinate <endingYCoordinate>
       
        Examples:
            | startingXCoordinate | startingYCoordinate | endingXCoordinate | endingYCoordinate |
            | 0 | 0 | 0 | 0 |
            | 2 | 3 | 2 | 3 |