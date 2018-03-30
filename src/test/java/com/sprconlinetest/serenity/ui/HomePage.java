/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sprconlinetest.serenity.ui;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

/**
 *
 * @author Win 10
 */
@DefaultUrl("https://www.phptravels.net/admin")
public class HomePage extends PageObject{
    
    protected String user = "admin@phptravels.com";
    protected String password = "demoadmin";
    
    public void logAsAdmin(){
        $("/html/body/div[1]/form[1]/div[1]/input[1]").sendKeys(user);
        $("/html/body/div[1]/form[1]/div[1]/input[2]").sendKeys(password);
        $("/html/body/div[1]/form[1]/button").click();
    }
    
}
