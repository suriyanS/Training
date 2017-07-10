package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "D:\\Suriyan\\java\\bdd-master\\src\\test\\java\\features", 
glue = "definitions", dryRun = false, strict = true,
tags = {"@calc1","@calc"},
plugin = { "pretty", "html:target/html", "json:target/cucumber.json" })
public class RunCukesTest {

}