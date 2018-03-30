/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sprconlinetest.serenity.steps;

import com.sprconlinetest.serenity.ui.AdminDashBoard;
import com.sprconlinetest.serenity.ui.AdminNavTwo;
import com.sprconlinetest.serenity.ui.HomePage;
import net.thucydides.core.annotations.Step;

/**
 *
 * @author Win 10
 */
public class AdminUser {

    private HomePage homePage;
    private AdminDashBoard adminDashBoard;
    private AdminNavTwo adminNavTwo;
    
    
    @Step
    public void openHomePage() {
        homePage.open();
    }

    @Step
    public void logAsAdmin() {
        homePage.logAsAdmin();
    }
    
    @Step
    public void userIsInDashboard(){
        adminDashBoard.userIsInDashBoard();
    }
    
    @Step
    public void clickMenuItem(String item){
        adminNavTwo.clickMenuItem(item);
    }
    
}
