package com.company.test.steps.EATSA;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

    @Before
    public void InitializeTest(){
        System.out.println("INITIALIZING TEST HOOK");
    }

    @After
    public void TearDownTest(){
        System.out.println("TEAR DOWN TEST HOOK");
    }

}
