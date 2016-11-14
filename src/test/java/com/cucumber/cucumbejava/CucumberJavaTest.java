package com.cucumber.cucumbejava;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * Unit test cucumber.
 */

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:Feature", 
format = {
        "json:target/cucumber/cucumberTest.json",
        "html:target/cucumber/cucumberTest.html",
        "pretty"
},
tags = {"~@ignored"})
public class CucumberJavaTest {

	
}
