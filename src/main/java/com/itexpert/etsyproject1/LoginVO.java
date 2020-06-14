/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itexpert.etsyproject1;

/**
 *
 * @author Vitali
 */
public class LoginVO {
    private String userName;
    private String password;
    private String currency;
    private String region;
    private String regionVerf;
    private String newPass3;
    private String newPass3Invalid;
    private String errorMesg3;
    private String currentPassInvalid;
    private String errorMesg4;
    private String newPassword;
    
    public LoginVO(String userName, String password, String currency, String region, String regionVerf, String newPass3,
            String newPass3Invalid, String errorMesg3,String currentPassInvalid,String errorMesg4,String newPassword) {
        this.userName = userName;
        this.password = password;
        this.currency = currency;
        this.region = region;
        this.regionVerf = regionVerf;
        this.newPass3 = newPass3;
        this.newPass3Invalid = newPass3Invalid;
        this.errorMesg3 = errorMesg3;
        this.currentPassInvalid = currentPassInvalid;
        this.errorMesg4 =errorMesg4;
        this.newPassword = newPassword;
    }
    @Override
    public String toString() {
        return "LoginVO{" + "userName=" + userName + ", password=" + password + ","
                + " currency=" + currency + ", region=" + region + ", "
                + "regionVerf=" + regionVerf + ", newPass3=" + newPass3 + ","
                + " newPass3Invalid=" + newPass3Invalid + ", errorMesg3=" + errorMesg3 + ", "
                + "currentPassInvalid=" + currentPassInvalid + ", errorMesg4=" + errorMesg4 + ", "
                + "newPassword=" + newPassword + '}';
    }

    

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }
    
    

    public String getErrorMesg4() {
        return errorMesg4;
    }

    public void setErrorMesg4(String errorMesg4) {
        this.errorMesg4 = errorMesg4;
    }

    

    public String getCurrentPassInvalid() {
        return currentPassInvalid;
    }

    public void setCurrentPassInvalid(String currentPassInvalid) {
        this.currentPassInvalid = currentPassInvalid;
    }

    
    

    public String getErrorMesg3() {
        return errorMesg3;
    }

    public void setErrorMesg3(String errorMesg3) {
        this.errorMesg3 = errorMesg3;
    }
    
      public String getNewPass3() {
        return newPass3;
    }

    public void setNewPass3(String newPassword3) {
        this.newPass3 = newPass3;
    }

    public String getNewPass3Invalid() {
        return newPass3Invalid;
    }

    public void setNewPass3Invalid(String newPass3Invalid) {
        this.newPass3Invalid = newPass3Invalid;
    }

    public String getRegionVerf() {
        return regionVerf;
    }

    public void setRegionVerf(String regionVerf) {
        this.regionVerf = regionVerf;
    }

   public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
    
    

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
