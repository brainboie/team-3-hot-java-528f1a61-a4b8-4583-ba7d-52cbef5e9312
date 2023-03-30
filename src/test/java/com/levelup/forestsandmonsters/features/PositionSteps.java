package com.levelup.forestsandmonsters.features;

import static org.junit.Assert.assertEquals;

import com.levelup.forestsandmonsters.GameController;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import com.levelup.forestsandmonsters.Position;

public class PositionSteps {

    Position pos;
    int X;
    int Y;


    @Given("the position is initialized with x coordinate {int}")
    public void givenThePositionIsInitializedWithX (int startingXCoordinate) {
        this.X = startingXCoordinate;
    }

    @Given("the position is initialized with y coordinate {int}")
    public void givenThePositionIsInitializedWithY (int startingYCoordinate) {
        this.X = startingYCoordinate;
    }

    @When("the position is instantiated")
    public void thePositionIsInstantiated() {
        pos = new Position(
            X,Y
        );
    }

    @Then("the position is created wtih x coordinate {int}")
    public void thePostionIsCreatedWithX(int endingXCoordinate) {
        assertEquals(endingXCoordinate, pos.coordinates.y);
    }


    @Then("the position is created wtih y coordinate {int}")
    public void thePostionIsCreatedWithY(int endingYCoordinate) {
        assertEquals(endingYCoordinate, pos.coordinates.y);
    }
}

