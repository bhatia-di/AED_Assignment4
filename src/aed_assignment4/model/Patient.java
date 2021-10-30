/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aed_assignment4.model;

/**
 *
 * @author 18577
 */
public class Patient extends Person {
    
    private String patientID;
    private String primaryDoctorName;
    private String prefferedPharmacy;

    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public String getPrimaryDoctorName() {
        return primaryDoctorName;
    }

    public void setPrimaryDoctorName(String primaryDoctorName) {
        this.primaryDoctorName = primaryDoctorName;
    }

    public String getPrefferedPharmacy() {
        return prefferedPharmacy;
    }

    public void setPrefferedPharmacy(String prefferedPharmacy) {
        this.prefferedPharmacy = prefferedPharmacy;
    }
    
}
