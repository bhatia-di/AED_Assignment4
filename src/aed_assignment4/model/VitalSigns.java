/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aed_assignment4.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author 18577
 */
public class VitalSigns {
    private int respiratoryRate;
    private int heartRate;
    private int bloodPressure;
    private double bodyTemperature;
    private LocalDateTime lastUpdatedTimeStamp = LocalDateTime.now();
    
    
    public boolean isVitalSignNormal (String vitalSignName, Patient currentPatient) {
    
    switch(vitalSignName) {
    
        case "Blood Pressure" : {
            
            int age = currentPatient.getAge();
            if ((age < 12 && bloodPressure < 80) || (age < 12 && bloodPressure > 110)) return true;
            if ((age > 13 && bloodPressure < 110) ||(age > 13 && bloodPressure > 120)) return true;
            break;       
        
        }
        
        
        case "Respiratory Rate" : {
            
            int age = currentPatient.getAge();
            if (age < 12 && (respiratoryRate < 20 || respiratoryRate > 30)) return true;
            if (age > 13 && (respiratoryRate < 12 && respiratoryRate > 20)) return true;
            break;       
        
        }
        
        
        case "Heart Rate" : {
            
            int age = currentPatient.getAge();
            if (age < 12 && (heartRate < 70 || heartRate > 110)) return true;
            if (age > 13 && (heartRate < 55 || heartRate > 105)) return true;
            break;       
        
        }
        
        
        case "Body Temperature" : {
            
            if (bodyTemperature < 36 && bodyTemperature > 37) return true;
            break;       
        
        }
        
    
    
    }
    
    return false;
    
    
    
    }

    public int getRespiratoryRate() {
        return respiratoryRate;
    }

    public void setRespiratoryRate(int respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public int getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(int bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public double getBodyTemperature() {
        return bodyTemperature;
    }

    public void setBodyTemperature(double bodyTemperature) {
        this.bodyTemperature = bodyTemperature;
    }

    public LocalDateTime getLastUpdatedTimeStamp() {
        return lastUpdatedTimeStamp;
    }

    public void setLastUpdatedTimeStamp(LocalDateTime lastUpdatedTimeStamp) {
        this.lastUpdatedTimeStamp = lastUpdatedTimeStamp;
    }
    
    
    
    
}
