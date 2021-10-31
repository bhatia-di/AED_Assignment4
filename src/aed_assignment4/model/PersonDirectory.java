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
public class PersonDirectory {
     private ArrayList<Person> persons;
    private LocalDateTime lastUpdatedTimestamp = LocalDateTime.now();

    public PersonDirectory() {
        persons = new ArrayList<Person>();
        initPersonDirectory();
      
   }
    
    private void initPersonDirectory() {
    
        persons.add(new Person("Paul", 25, "Fenway", "Boston", 9088, "Fenway"));
        persons.add(new Person("John", 25, "Fenway", "Boston", 9088, "Fenway"));
        persons.add(new Person("Brain", 25, "Roxbury", "Boston", 9088, "Fenway"));
        persons.add(new Person("Kelly", 25, "Bolyston", "Boston", 9088, "Fenway"));
    
    
    }

    public ArrayList<Person> getPeople() {
        return persons;
    }

    public void setPersons(ArrayList<Person> persons) {
        this.persons = persons;
        setLastUpdatedTimestamp(LocalDateTime.now());
    }

    public String getLastUpdatedTimestamp() {
        return lastUpdatedTimestamp.toString();
    }

    public void setLastUpdatedTimestamp(LocalDateTime lastUpdatedTimestamp) {
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    }


    public int getTotalPersonCount() {

        return getPeople().size();

    }


    public Person getPersonAtIndex(int index) {

        return persons.get(index);

    }


    public void setPersonAtIndex(int index, Person newPerson) {

        persons.set(index, newPerson);
        setLastUpdatedTimestamp(LocalDateTime.now());


    }

    public void removePersonAtIndex(int index) {
        persons.remove(getPersonAtIndex(index));
        setLastUpdatedTimestamp(LocalDateTime.now());
    }
}
