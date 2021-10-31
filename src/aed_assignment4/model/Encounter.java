/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aed_assignment4.model;

import java.time.LocalDateTime;
import java.util.Map;

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
    
}
