/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aed_assignment4.model;

import java.util.UUID;

/**
 *
 * @author 18577
 */
public class Person {
    
    private String personId;
    private String name;
    private int age;
    private House house;

    public Person() {
        this.personId = UUID.randomUUID().toString();
    }

    /**
    * Accept DOB/ Gender/ phone
    * */

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public void setHouse (String community, String city, int zipcode, String address) {
        this.house = new House(community, city, zipcode, address);
    }
    
    public House getHouse() {
    return this.house;
    }
    
}
