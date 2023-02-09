package com.test.steprunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
		(
		features = "src/test/resources/Features",
		glue= {"com.test.stepdefinition"}
		)


public class LMSTestRunner {

}
