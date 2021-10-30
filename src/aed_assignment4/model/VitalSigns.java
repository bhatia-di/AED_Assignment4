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
    private int weight;
    private LocalDateTime lastUpdatedTimeStamp = LocalDateTime.now();
}
