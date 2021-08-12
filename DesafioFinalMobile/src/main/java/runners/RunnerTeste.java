package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty"},
		features = "src\\main\\resources\\features",
		tags = {"@Gestao"},
		glue = "steps",
		snippets = SnippetType.CAMELCASE,
		monochrome = true,
		dryRun = false
		)
public class RunnerTeste {

}
