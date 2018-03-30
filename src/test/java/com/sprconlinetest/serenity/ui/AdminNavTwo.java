/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sprconlinetest.serenity.ui;

import net.serenitybdd.core.pages.PageObject;

/**
 *
 * @author Win 10
 */
public class AdminNavTwo extends PageObject{
    
    public void clickMenuItem(String item){
        
        $(item).waitUntilClickable().click();
    }
    
}
