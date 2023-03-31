package com.levelup.forestsandmonsters.features;
import static org.junit.Assert.assertEquals;

import java.awt.Point;

import com.levelup.forestsandmonsters.GameStatus;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class gameStatusSteps {

    Point  pos;
    String characterName;
    GameStatus gameStatus;
    
    @Given("the gameStatus is initialized with x coordinate {int}")
    public void givenThePositionIsInitializedWithX (int currXInput) {
        pos.x = currXInput;
    }

    @Given("the gameStatus is initialized with y coordinate {int}")
    public void givenThePositionIsInitializedWithY (int currYInput) {
        pos.y = currYInput;
    }

    @Given("the gameStatus is initialized with name {string}")
    public void givenTheCharactersNameIs(String charNameInput) {
        this.characterName = charNameInput;
    }

    @When("the position is instantiated")
    public void thePositionIsInstantiated() {
        gameStatus = new GameStatus(characterName, pos.x, pos.y);
       
    }

    @Then("the gameStatus is created with x coordinate {int}")
    public void thePostionIsCreatedWithX(int currXOutput) {
        assertEquals(currXOutput, pos.x);
    }


    @Then("the gameStatus is created with y coordinate {int}")
    public void thePostionIsCreatedWithY(int currYOutput) {
        assertEquals(currYOutput, pos.y);
    }
    
    @Then("the gameStatus is created with name {String}")
    public void thenTheGameSetsTheCharactersName(String charNameOutput) {
        assertEquals(charNameOutput, gameStatus.characterName);
    }

    
}
