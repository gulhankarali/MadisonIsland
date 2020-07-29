package com.MadisonIsland.step_definitions;

import com.MadisonIsland.utilities.ConfigurationReader;
import com.MadisonIsland.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import org.junit.AfterClass;
import org.junit.BeforeClass;

public class Hooks {
    @Before
    public void setUp(){
        Driver.get().get(ConfigurationReader.get("base_url"));
        Driver.get().manage().window().maximize();
    }
//    @After
//    public void tearDown(){
//        Driver.closeDriver();
//    }
}
