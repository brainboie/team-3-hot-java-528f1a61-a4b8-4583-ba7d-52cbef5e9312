Feature: Move in a direction 
    
    I want to move my character. If they attempt to 
    move past a boundary, the move results in no change in position but does increment move count.
    
    @Accpetance
    Scenario Outline: Move in a direction
        Given the character starts at position with XCoordinates <startingPositionX> 
        And starts at YCoordinates <startingPositionY>
        And the player choses to move in <direction>
        And the current move count is <startingMoveCount>
        When the character moves
        Then the character is now at position with XCoordinates <endingPositionX>
        And YCoordinates <endingPositionY>
        And the new move count is <endingMoveCount>
        Examples:
            | startingPositionX | startingPositionY | direction | startingMoveCount | endingPositionX | endingPositionY | endingMoveCount |
            | 0 | 0 | NORTH | 0 | 0 | 1 | 1 |
            | 0 | 0 | SOUTH | 0 | 0 | 0 | 1 |
            | 0 | 0 | EAST | 0 | 1 | 0 | 1 |
            | 0 | 0 | WEST | 0 | 0 | 0 | 1 |
            | 0 | 9 | NORTH | 0 | 0 | 9 | 1 |
            | 0 | 9 | SOUTH | 0 | 0 | 8 | 1 |
            | 0 | 9 | EAST | 0 | 1 | 9 | 1 |
            | 0 | 9 | WEST | 0 | 0 | 9 | 1 |
            | 9 | 9 | NORTH | 0 | 9 | 9 | 1 |
            | 9 | 9 | SOUTH | 0 | 9 | 8 | 1 |
            | 9 | 9 | EAST | 0 | 9 | 9 | 1 |
            | 9 | 9 | WEST | 0 | 8 | 9 | 1 |
            | 9 | 0 | NORTH | 0 | 9 | 1 | 1 |
            | 9 | 0 | SOUTH | 0 | 9 | 0 | 1 |
            | 9 | 0 | EAST | 0 | 9 | 0 | 1 |
            | 9 | 0 | WEST | 0 | 8 | 0 | 1 |  