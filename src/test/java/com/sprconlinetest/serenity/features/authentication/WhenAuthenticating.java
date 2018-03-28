/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sprconlinetest.serenity.features.authentication;

import com.sprconlinetest.serenity.steps.GmailUser;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author jdvillalba
 */
@RunWith(SerenityRunner.class)
public class WhenAuthenticating {
    
    @Steps
    private GmailUser user;
    
    @Managed(driver = "chrome")
    WebDriver browser;
    
    @Test
    public void shouldBeAbleToLogin(){
        
        user.isOnTheHomePage();
        
        user.logsAsUser();
        
        //user.isOnTheLandingPage();
        
    }
    
}
