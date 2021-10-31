/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aed_assignment4.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author 18577
 */
public class Patient extends Person {
    
    private String patientID;
    private String doctorName;
    private List<String> allergies;

    public Patient(Person p) {
         super(p);
         this.patientID = UUID.randomUUID().toString();
    }
    
    public List<String> getAllergies() {
        return allergies;
    }

    public void setAllergies(List<String> allergies) {
        this.allergies = allergies;
    }

    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }


}
