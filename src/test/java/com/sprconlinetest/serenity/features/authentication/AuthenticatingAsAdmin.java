/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sprconlinetest.serenity.features.authentication;

import com.sprconlinetest.serenity.constants.MenuItemTwo;
import com.sprconlinetest.serenity.steps.AdminUser;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author Win 10
 */
@RunWith(SerenityRunner.class)
public class AuthenticatingAsAdmin {
    
    @Steps
    private AdminUser admin;
    
    @Managed(driver = "chrome", options = "")
    WebDriver browser;
    
    @Test
    public void shouldBeAbleToLogin(){
        browser.manage().window().maximize();
        
        admin.openHomePage();
        
        admin.logAsAdmin();
        
        admin.userIsInDashboard();
        
        admin.clickMenuItem(MenuItemTwo.BOOKINGS.getSelector());
    }
}
