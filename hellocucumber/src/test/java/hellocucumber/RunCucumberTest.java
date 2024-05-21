package hellocucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = { "pretty", "html:src/test/resources/reports/cucumber-html-report.html", "json:resources/cucumber.json"},
        glue = {"hellocucumber"},
        features = {"src/test/resources/hellocucumber/"}
)
public class RunCucumberTest {
}