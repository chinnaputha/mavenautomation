package com.naukri.test;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) 
@CucumberOptions(features="src\\test\\resources\\featurefiles", 
				glue={"stepdefinitions"},
				tags= {"@sauceDemo"}) 
public class UIRunner {

}
