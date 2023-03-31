package com.levelup.forestsandmonsters.features;
import static org.junit.Assert.assertEquals;

import java.awt.Point;

import com.levelup.forestsandmonsters.GameStatus;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GameStatusSteps {

    Point pos = new Point();
    String characterName;
    GameStatus gameStatus;
    
    @Given("the gameStatus is initialized with x coordinate {int}")
    public void givenTheGameStatusPositionIsInitializedWithX (int currXInput) {
        pos.x = currXInput;
    }

    @Given("the gameStatus is initialized with y coordinate {int}")
    public void givenTheGameStatusPositionIsInitializedWithY (int currYInput) {
        pos.y = currYInput;
    }

    @Given("the gameStatus is initialized with name {string}")
    public void givenTheGameStatusCharactersNameIs(String charNameInput) {
        this.characterName = charNameInput;
    }

    @When("the gameStatus is instantiated")
    public void theGameStatusPositionIsInstantiated() {
        gameStatus = new GameStatus(this.characterName, pos.x, pos.y);
    }

    @Then("the gameStatus is created with x coordinate {int}")
    public void theGameStausPostionIsCreatedWithX(int currXOutput) {
        assertEquals(currXOutput, gameStatus.currentPosition.x);
    }


    @Then("the gameStatus is created with y coordinate {int}")
    public void theGameStatusPostionIsCreatedWithY(int currYOutput) {
        assertEquals(currYOutput, gameStatus.currentPosition.y);
    }
    
    @Then("the gameStatus is created with name {string}")
    public void thenTheGameStatusCharactersName(String charNameOutput) {
        assertEquals(charNameOutput, gameStatus.characterName);
    }

    
}
