package com.TestRunner.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"classpath:features"},
        glue = {"com.incubyte.steps"},
        plugin = { "json: target/reports/cucumber-html-reports/cucumber.json"},
        dryRun=false,
        monochrome = true,
        tags={"@scenario1"}
)
public class Runner {
}
