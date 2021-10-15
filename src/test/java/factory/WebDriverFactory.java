package factory;

import enums.SupportedBrowsers;
import org.openqa.selenium.WebDriver;
import props.convertor.SupportedBrowsersConvertor;
import props.holder.PropertyHolder;

public class WebDriverFactory {
    public WebDriver getWebDriver(){
        return SupportedBrowsersConvertor.valueOfWebBrowser(new PropertyHolder().readProperties("browser"))
                .getWebDriver();
    }
}
