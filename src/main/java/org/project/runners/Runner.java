package org.project.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/features/rover.feature",
        glue = {"org.project"},
        tags = "@regression"
)
public class Runner {
}
