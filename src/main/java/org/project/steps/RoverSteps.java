package org.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.pageObjectModel.Rover;

public class RoverSteps {

    Rover rover = new Rover();

    @Given("^Rover gets initialised$")
    public void roverGetsInitialised() {
        rover.initialiseRover();
    }

    @When("Rover is located to {string},{string},{string}")
    public void roverIsLocatedTo(String x, String y, String location) {
        rover.setPosition(Integer.valueOf(x), Integer.valueOf(y), location);
    }

    @And("Rover is directed to {string}")
    public void roverIsDirectedTo(String process) {
        rover.process(process);
    }

    @Then("Print the final position")
    public void printTheFinalPosition() {
        rover.printPosition();
    }
}
