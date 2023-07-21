package org.project.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.project.pageObjectModel.Rover;

public class RoverSteps {

    Rover rover = new Rover();

    @Given("Rover gets initialised")
    public void roverGetsInitialised() {
        rover.initialiseRover();
    }

    @When("Rover is located at {int},{int},{string}")
    public void roverIsLocatedAt(int x, int y, String direction) {
        switch (direction) {
            case "N":
                rover.setPosition(x, y, Rover.N);
                break;
            case "E":
                rover.setPosition(x, y, Rover.E);
                break;
            case "S":
                rover.setPosition(x, y, Rover.S);
                break;
            case "W":
                rover.setPosition(x, y, Rover.W);
                break;
        }
    }

    @When("Rover is commanded to move {string}")
    public void roverIsCommandedToMove(String cmd) {
        rover.process(cmd);
    }

    @Then("Print the final position")
    public void printTheFinalPosition() {
        rover.printPosition();
    }

}
