/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sprconlinetest.serenity.ui;

import java.util.logging.Level;
import java.util.logging.Logger;
import net.serenitybdd.core.pages.PageObject;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *
 * @author Win 10
 */
public class AdminDashBoard extends PageObject{
    
    public void userIsInDashBoard(){
        waitForTimeoutInMilliseconds();
        assertThat(getTitle(), is("Dashboard"));
    }
}
