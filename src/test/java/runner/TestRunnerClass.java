package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\admin\\eclipse-workspace\\CucumberRestAssuredd\\src\\test\\resources\\Sample.feature",
glue="org.steps")
public class TestRunnerClass {

}
