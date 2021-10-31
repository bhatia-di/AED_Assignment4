/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aed_assignment4.model;

import java.time.LocalDateTime;

/**
 *
 * @author 18577
 */
public class Encounter {
    // Map <patientId, ENcounterHistory>
    // getPatientDir - list of patientIds
    // map - using patient id - encounterhistory get 
    VitalSigns vitalSigns;
    LocalDateTime vitalSignsTimeStamp;
    
}
