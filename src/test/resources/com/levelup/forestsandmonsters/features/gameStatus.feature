Feature: Create a GameStaus
    
    I want to create a GameStatus for GameController.
    
   @acceptance   
    Scenario Outline: create a GameStatus
        Given the gameStatus is initialized with x coordinate <currXInput>
        And the gameStatus is initialized with y coordinate <currYInput>
        And the gameStatus is initialized with name <charNameInput>
        When the gameStatus is instantiated
        Then the gameStatus is created with x coordinate <currXOutput>
        And the gameStatus is created with y coordinate <currYOutput>
        And the gameStatus is created with name <charNameOutput>

        Examples:
            | currXInput | currYInput | charNameInput | currXOutput | currYOutput | charNameOutput |
            | 0 | 0 | test1 | 0 | 0 | test1 |
            | 1 | 1 | test2 | 1 | 1 | test2 |