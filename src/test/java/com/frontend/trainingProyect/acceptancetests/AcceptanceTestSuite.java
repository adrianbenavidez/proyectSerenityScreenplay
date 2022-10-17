package com.frontend.trainingProyect.acceptancetests;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(tags="",
        plugin = "pretty",
        features="src/test/resources/features/",
        glue="com.frontend.trainingProyect.steps")
public class AcceptanceTestSuite {}
