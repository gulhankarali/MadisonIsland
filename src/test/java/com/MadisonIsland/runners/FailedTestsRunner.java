package com.MadisonIsland.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin= {"json:target/failed-html-reports"},
        features={"@target/rerun.txt"},
        glue= {"com.MadisonIsland.step_definitions"}
)
public class FailedTestsRunner {
}
