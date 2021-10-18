package com.cydeo.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


//this class has only one purpose
    //instructing how and what feature we want to run
    //where are the step definitions
    //do we want to just generate missing step definitions
    //dryRun=true will run the test without running all scenario for missing steps
    //so you can copy all the missing steps if there is any
    //do we want to get json, html report
    //do we want to filter the test run according to certain tags
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",   //"classpath:features",
                    glue = "com/cydeo/step_definitions",//glue is actual step deffinitions
                    publish = true,//it will give u public link in consol with link "view your cucumber report at:   "
                    plugin = { "pretty","html:target/cucumber_report.html" ,//create html folder under target folder, so u can see report on webPage
                                "rerun:target/rerun.txt", //store the failed scenario into rerun .txt
                                "me.jvt.cucumber.report.PrettyReports:target"},//fancy report

                    dryRun = false ,//quick check if there is any missing definitions
                   tags ="@non_ui"//"not @ui" //"@smoke or @salad"
                    )
    public class TestRunner{

}

