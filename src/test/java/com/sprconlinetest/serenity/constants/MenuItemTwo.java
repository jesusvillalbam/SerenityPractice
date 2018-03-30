/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sprconlinetest.serenity.constants;

/**
 *
 * @author Win 10
 */
public enum MenuItemTwo {
    QUICKBOOKING("//*[@id=\"content\"]/div[1]/div[1]/button"),
    BOOKINGS("#content > div.row.form-group > div:nth-child(2) > form > button"),
    CMSPAGES("//*[@id=\"content\"]/div[1]/div[3]/form/button"),
    BLOG("//*[@id=\"content\"]/div[1]/div[4]/form/button"),
    SENDNEWSLETTER("//*[@id=\"content\"]/div[1]/div[5]/form/button");
    
    
    private String selector;

    private MenuItemTwo(String selector) {
        this.selector = selector;
    }
    
    public String getSelector(){
        return this.selector;
    }
    
    
}
