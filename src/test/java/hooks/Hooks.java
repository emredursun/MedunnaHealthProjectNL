package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {
    //    What is hooks class in cucumber?
    //    hooks has Before and After annotations.
    //    hooks will run Before and After each Scenario
    //    What is in your After in the hooks?
    //    -In cucumber hooks I use reports and I take screenshot
    //    -I designed my hooks. It takes screenshot when a test scenario fails.

/*    public  static RequestSpecification spec;
    @Before(value= "@Api")
    public void baseUrlSetup(){
        spec= new RequestSpecBuilder().setBaseUri(ConfigurationReader.getProperty("base_url")).build();
    }*/

//    @Before
//    public void setUp(){
//        System.out.println("This is before method");
//    }
//    @After("@smoke or @regression")
//    I can run hooks for specific tags. In this example, we run for only @smoke or @regression

    //    runs after each Scenario adn if a scenari fails, captured and attached the screeshot i out htmll gile
    @After
    public void tearDown(Scenario scenario){
//        System.out.println("This is after method");
        if (scenario.isFailed()) {
//            When test case fails, then attach the screenshot to teh html report
            final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "screenshots");
        }
    }
}