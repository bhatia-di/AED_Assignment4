/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aed_assignment4.model;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author 18577
 */
public class PatientDirectory {
       private ArrayList<Patient> patient;
       private LocalDateTime lastUpdatedTimestamp = LocalDateTime.now();
}
