/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aed_assignment4.model;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 *
 * @author 18577
 */
public class Encounter {
    // Map <patientId, ENcounterHistory>
    // getPatientDir - list of patientIds
    // map - using patient id - encounterhistory get 
    Map<String, EncounterHistory> encounterList;
    LocalDateTime vitalSignsTimeStamp;

    public Encounter() {

        encounterList = new HashMap<>();
    }

    
    public void addEncounter (String patientId, VitalSigns newVitalSigns) {
        EncounterHistory encounterHistory = encounterList.getOrDefault(patientId, null);
        if (Objects.isNull(encounterHistory)) {
            encounterHistory = new EncounterHistory();
        }
        encounterHistory.addVitalSign(newVitalSigns);   
        System.out.println("Encounter History for patient " + patientId +" is " + encounterHistory.getVitalSignsCount());
        encounterList.put(patientId, encounterHistory);
    
    }

    public EncounterHistory getEncounterHistoryOfPatient(String patientId) {
        return encounterList.get(patientId);

    }
    
    public int getEncounterMapSize() {
            return encounterList.size();
    }
    
    public Map<String, EncounterHistory> getEncounterList() {
        return encounterList;    
    }
    
}
