package com.levelup.forestsandmonsters.cli;

import java.util.ArrayList;
import java.util.List;

import com.levelup.forestsandmonsters.GameController;
import com.levelup.forestsandmonsters.GameStatus;

import org.springframework.shell.Availability;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellMethodAvailability;
import org.springframework.shell.standard.ShellOption;
import org.springframework.shell.standard.commands.Quit;

@ShellComponent
public class LevelUpGame implements Quit.Command {

  private final GameController gameController;
  private List<GameStatus> gameHistory;
  private boolean isGameStarted = false;

  public LevelUpGame() {
    super();
    this.gameController = new GameController();
    this.gameHistory = new ArrayList<GameStatus>();
  }

  @ShellMethodAvailability("notStartedCheck")
  @ShellMethod(value = "Create a character (characterName)", key = { "create-character", "create" })
  public void createCharacter(@ShellOption(defaultValue = "Character") String characterName) {
    gameController.createCharacter(characterName);
    GameStatus status = gameController.getStatus();

    System.out.println("Your character, " + status.characterName + " is created!");
  }

  @ShellMethodAvailability("notStartedCheck")
  @ShellMethod("Start the game")
  public void startGame() {
    isGameStarted = true;
    gameController.startGame();
    // TODO: Update this prompt. Also, do you want to get the game status and tell
    // the character where their character is?
    System.out.println("Welcome to Forests and Monsters! You have entered a mysterious place.");
    this.drawMap();
    System.out.println(gameController.getStatus().characterName + " has entered the world at " + gameController.getStatus().currentPosition.x + "," + gameController.getStatus().currentPosition.y + ".");
    System.out.println("Would you like to go North(N), South(S), East(E), West(W) or Quit(Q)?");
  }

  public void drawMap() {
    String drawMap = "";
    for(int height=0; height <= 9; height++) {
        for(int width=0; width <= 9; width++) {
            if(gameController.character.currentPosition.coordinates.y == height
              && gameController.character.currentPosition.coordinates.x == width) {
              drawMap += "[P]";
            } else {
              drawMap += "[ ]";
            }
        }
      drawMap += "\r\n";
    }
    System.out.println(drawMap);
  }

  @ShellMethod(value = "Move North", key = { "N", "n" }, group = "Move")
  @ShellMethodAvailability("startedCheck")
  public void moveNorth() {
    gameController.move(GameController.DIRECTION.NORTH);
    this.drawMap();
    System.out.println(gameController.getStatus().toString());
    updateStatus(gameController.getStatus());
  }

  @ShellMethod(value = "Move South", key = { "S", "s" }, group = "Move")
  @ShellMethodAvailability("startedCheck")
  public void moveSouth() {
    gameController.move(GameController.DIRECTION.SOUTH);
    this.drawMap();
    System.out.println(gameController.getStatus().toString());
    updateStatus(gameController.getStatus());
  }

  @ShellMethod(value = "Move East", key = { "E", "e" }, group = "Move")
  @ShellMethodAvailability("startedCheck")
  public void moveEast() {
    gameController.move(GameController.DIRECTION.EAST);
    this.drawMap();
    System.out.println(gameController.getStatus().toString());
    updateStatus(gameController.getStatus());
  }

  @ShellMethod(value = "Move West", key = { "W", "w" }, group = "Move")
  @ShellMethodAvailability("startedCheck")
  public void moveWest() {
    gameController.move(GameController.DIRECTION.WEST);
    this.drawMap();
    System.out.println(gameController.getStatus().toString());
    updateStatus(gameController.getStatus());
  }

  @ShellMethod(value = "End the game", key = { "Q", "q" })
  public void endGame() {
    System.out.println("You exit the mysterious world.");
    printSummary();
    System.exit(0);
  }

  private void printSummary() {
    System.out.println("Exiting the mysterious land!");
    for (GameStatus status : gameHistory) {
      // TODO: Override toString on game status to print pretty
      System.out.println(status);
    }
    System.out.println("Final Move Count is " + gameController.character.getMoveCount() + ".");
  }

  private void updateStatus(GameStatus status) {
    this.gameHistory.add(status);
  }

  public Availability startedCheck() {
    return isGameStarted
        ? Availability.available()
        : Availability.unavailable("game not started");
  }

  public Availability notStartedCheck() {
    return !isGameStarted
        ? Availability.available()
        : Availability.unavailable("game already started");
  }

}
