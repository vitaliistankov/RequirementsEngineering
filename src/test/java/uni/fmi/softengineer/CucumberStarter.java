package uni.fmi.softengineer;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith (Cucumber.class)
@CucumberOptions(features="Features",
plugin= {"pretty","html:target/cucumber-reports"},
monochrome= true)
public class CucumberStarter {

}
