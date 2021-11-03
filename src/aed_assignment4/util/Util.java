/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aed_assignment4.util;

import aed_assignment4.model.City;
import aed_assignment4.model.Community;
import aed_assignment4.model.VitalSigns;

/**
 *
 * @author 18577
 */
public class Util {
    
    
    
    public static  boolean isNumeric(String strNum) {
    
    if (strNum == null) {
        return false;
    }
    try {
        int d = Integer.parseInt(strNum);
    } catch (NumberFormatException nfe) {
        return false;
    }
    return true;
    }
    
    
    
    
    public static  boolean isNumericDouble(String strNum) {
    
    if (strNum == null) {
        return false;
    }
    try {
        double d = Double.parseDouble(strNum);
    } catch (NumberFormatException nfe) {
        return false;
    }
    return true;
    }



















    String commString = new Community().getCommunity();
    String city = new City().getCity();
    
}
