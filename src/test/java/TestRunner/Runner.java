package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = "src/test/resources/sample.feature"
        ,glue = {"StepDefinitions"}
        ,monochrome = true
        ,plugin = {"pretty"}
        ,tags = "@smoke"
)

public class Runner extends AbstractTestNGCucumberTests{
}
