package com.steps;

import com.utils.settings.TextContext;
import io.cucumber.java.*;
import io.cucumber.java.an.E;

import java.awt.*;

public class Hooks extends BaseClass{
    private Scenario scenario;
    public Hooks(TextContext context) throws Exception{
        super(context);
    }
    @Before
    public void before(Scenario scenario)throws Exception{
        System.out.println("-------Execution Started-------");
        this.scenario=scenario;
    }
    @After
    public void endOfTest(Scenario scenario) throws Exception{
        System.out.println("-------Execution Ended-------");
        driver.quit();
    }
}
