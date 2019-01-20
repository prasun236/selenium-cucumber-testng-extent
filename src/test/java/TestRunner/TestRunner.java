package TestRunner;



import java.io.File;
import java.io.IOException;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import managers.FileReaderManager;



//@RunWith(Cucumber.class)
//@CucumberOptions(  
//	    features = "src/test/java/features",
//	    glue="stepDefinitions")
//public class TestRunner   {
//
//}

//@CucumberOptions( plugin = { “com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html”})


//@RunWith(Cucumber.class)
@CucumberOptions(  
	    features = "src/test/java/features",
	    glue="stepDefinitions",
	    plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"})
public class TestRunner extends AbstractTestNGCucumberTests  {
	
//	@AfterClass
//	 public static void writeExtentReport() throws IOException {
//	 Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
//	
//	 
//	 }
	
	

	@AfterClass
	public static void writeExtentReport() throws IOException {
		Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
	    Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
	    Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
	    Reporter.setSystemInfo("Machine", 	"Windows 10" + "64 Bit");
	    Reporter.setSystemInfo("Selenium", "3.7.0");
	    Reporter.setSystemInfo("Maven", "3.5.2");
	    Reporter.setSystemInfo("Java Version", "1.8.0_151");
	}


}