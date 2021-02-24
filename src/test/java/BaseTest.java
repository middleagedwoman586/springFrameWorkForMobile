
import config.IConfig;
import org.junit.After;
import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;

import java.net.MalformedURLException;

@ActiveProfiles("APPIUM")
public class BaseTest {
    @Autowired
    private IConfig config;


    @Autowired
    public void setConfig(IConfig config) {
        this.config = config;
    }

    @Before
    public void initDriverWeb() throws MalformedURLException {
        config.setDriver();
    }


    @After
    public void tearDown() {
        config.tearDown();
    }

}