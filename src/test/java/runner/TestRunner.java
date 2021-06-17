package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/features", 
glue="TestCaseExecution",
plugin = {"pretty","com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/ExtendedReport.html","junit:target/cucumber-reports/Cucumber.xml","html:target/cucumber-html-reports","json:target/cucumber-reports/cucumber.json","html:target/Cucumber-JVM-report"},
monochrome =true //display the console output in a proper readable format
,strict=true //it will check if any step is not defined in step definition file
,dryRun = false // true: generating step definitions  false: execution test cases
,tags = {"@loginpage"}
)
        
public class TestRunner {
    
}


