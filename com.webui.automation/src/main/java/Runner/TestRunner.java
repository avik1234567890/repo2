package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\achoudhury20\\OneDrive - DXC Production\\ONLINE\\My own\\Baltrum Online Dev workspaces\\com.webui.automation\\src\\main\\java\\Featurefiles\\newfeaturefile.Feature"
		,glue="Stepdefinition"
		,dryRun=false
		,plugin={"pretty","html:test-output"}
		,monochrome=true
		)
public class TestRunner {

}
	