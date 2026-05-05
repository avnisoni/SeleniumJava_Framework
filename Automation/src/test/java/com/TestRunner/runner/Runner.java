package com.TestRunner.runner;

import io.cucumber.core.cli.Main;
        public class Runner
        {
            public static void main(String[] args){
                String tags= System.getProperty("cucumber.options","@scenario1");
                System.out.println("Executing with tag :" +tags);
                String[] cucumberOptions=new String[]{
                        "--glue","com.steps",
                        "--plugin","pretty",
                        "--plugin","html:target/cucumber/cucumber-html-reports",
                        "--tags",tags,
                        "classpath:features"
                };
                Main.run(cucumberOptions,Thread.currentThread().getContextClassLoader());
            }
}