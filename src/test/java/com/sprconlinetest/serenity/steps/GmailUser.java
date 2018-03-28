/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sprconlinetest.serenity.steps;

import net.thucydides.core.annotations.Step;
import com.sprconlinetest.serenity.ui.GmailHomePage;

/**
 *
 * @author jdvillalba
 */
public class GmailUser {
    
    private GmailHomePage gmailHomePage;
    
    @Step
    public void isOnTheHomePage() {
        gmailHomePage.open();
    }

    @Step
    public void logsAsUser() {
        gmailHomePage.logsAsUser();
    }

    @Step
    public void isOnTheLandingPage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
