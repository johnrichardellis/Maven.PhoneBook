package com.zipcodewilmington.phonebook;

import java.util.List;
import java.util.ArrayList;
//import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by leon on 1/23/18.
 * Made WAY better by kristofer 6/16/20
 */
public class PhoneBook {

    private List<String> phoneNumbers = new ArrayList<>();
    private Map<String, List<String>> phonebook = new LinkedHashMap<>();


    public PhoneBook(Map<String, List<String>> phonebookMap) {
        this.phonebook = phonebookMap;
    }

    public PhoneBook() {
        this(null);
    } // todo??

    //add
    public void add(String name, String phoneNumber) {

        phoneNumbers.add(phoneNumber);

        phonebook.put(name, phoneNumbers);
    }

    //addAll
    public void addAll(String name, String... phoneNumbers) {
    }

    //remove
    public void remove(String name) {
    }

    //hasEntry
    public Boolean hasEntry(String name) {
        return null;
    }

    //lookup
    public List<String> lookup(String name) {
        return null;
    }

    //reverseLookup
    public String reverseLookup(String phoneNumber)  {
        return null;
    }

    //getAllContactNames
    public List<String> getAllContactNames() {
        return null;
    }

    //getMap
    public Map<String, List<String>> getMap() {
        return null;
    }
}
