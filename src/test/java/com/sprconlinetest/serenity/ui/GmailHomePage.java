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
 * @author jdvillalba
 */
@DefaultUrl("https://www.gmail.com/")
public class GmailHomePage extends PageObject{

    public void logsAsUser() {
        $("//*[@id=\"identifierId\"]").sendKeys("something");
        $("#identifierNext").click();
    }

    
}
