package org.example.runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"org/example/stepdeffs"},
        plugin = {"pretty", "html:target/cucumber.html"}
)


public class RunnerTest extends AbstractTestNGCucumberTests {
}
