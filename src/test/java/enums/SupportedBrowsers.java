package enums;

import invoker.WebDriverInvoker;
import invoker.implementations.LocalChromeInvoker;
import invoker.implementations.LocalFirefoxInvoker;
import org.openqa.selenium.WebDriver;

public enum SupportedBrowsers {
    LOCAL_FIREFOX(new LocalFirefoxInvoker()),
    LOCAL_CHROME(new LocalChromeInvoker());
    private WebDriverInvoker webDriverInvoker;
    SupportedBrowsers(WebDriverInvoker webDriverInvoker){
        this.webDriverInvoker = webDriverInvoker;
    }
    public WebDriver getWEbDriver(){
        return webDriverInvoker.invokeWebDriver();
    }
}
