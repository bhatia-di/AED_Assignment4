/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aed_assignment4.model;

import java.util.ArrayList;

/**
 *
 * @author 18577
 */
public class EncounterHistory {
    ArrayList<VitalSigns> vitalSignHistory;

    public EncounterHistory() {
        this.vitalSignHistory = new ArrayList<VitalSigns>();
    }
    
    
    public void addVitalSign(VitalSigns newVitalSign) {
        vitalSignHistory.add(newVitalSign);
    }
    
    
    public int getVitalSignsCount() {
        
        return vitalSignHistory.size();
    }
    
    
}
