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
       private ArrayList<Patient> patients;
       private LocalDateTime lastUpdatedTimestamp = LocalDateTime.now();
       
       
       public PatientDirectory() {
        patients = new ArrayList<Patient>();
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public void setPersons(ArrayList<Patient> patients) {
        this.patients = patients;
        setLastUpdatedTimestamp(LocalDateTime.now());
    }

    public String getLastUpdatedTimestamp() {
        return lastUpdatedTimestamp.toString();
    }

    public void setLastUpdatedTimestamp(LocalDateTime lastUpdatedTimestamp) {
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    }


    public int getTotalPatientCount() {

        return getPatients().size();

    }


    public Patient getPatientAtIndex(int index) {

        return patients.get(index);

    }


    public void setPatientAtIndex(int index, Patient newPatient) {

        patients.set(index, newPatient);
        setLastUpdatedTimestamp(LocalDateTime.now());


    }

    public void removePersonAtIndex(int index) {
        patients.remove(getPatientAtIndex(index));
        setLastUpdatedTimestamp(LocalDateTime.now());
    }
}
