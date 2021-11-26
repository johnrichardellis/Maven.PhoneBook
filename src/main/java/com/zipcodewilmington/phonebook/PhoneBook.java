package com.zipcodewilmington.phonebook;

import java.util.*;
//import java.util.HashMap;


/**
 * Created by leon on 1/23/18.
 * Made WAY better by kristofer 6/16/20
 */
public class PhoneBook {

    // associated data type
    private Map<String, List<String>> phoneBookMap = new LinkedHashMap<>();
//    private Map<String, List<String>> phoneBook;   // could also declare this way


    // constructor
    public PhoneBook(Map<String, List<String>> phoneBook) {
        this.phoneBookMap = phoneBook;
    }


    // nullary constructor
    public PhoneBook() {
        phoneBookMap = new LinkedHashMap<>();
    }


    //add
    public void add(String name, String phoneNumber) {

        List<String> phoneNumberList = Arrays.asList(phoneNumber); // declaring new list phoneNumberList to hold the phoneNumber variable
        phoneBookMap.put(name, phoneNumberList); // made a list, calling .put method on phoneBookMap list to add name and phoneNumbers
    }

    //addAll
    public void addAll(String name, String... phoneNumbers) {

        List<String> phoneNumberList = Arrays.asList((phoneNumbers)); // creating new list to store phone numbers (2nd parameter)
        phoneBookMap.put(name, phoneNumberList); // you add the above created list in as the 2nd parameter
        // adding to the phoneBookMap list
    }

    //remove
    public void remove(String name) {

        phoneBookMap.remove(name);
    }

    //hasEntry
    public Boolean hasEntry(String name) {

        // checking to see if the phoneBookMap contains a certain name, and if so, return true.
        if (phoneBookMap.containsKey(name)) {
            return true;
        } else {
            // if the phoneBookMap doesnt contain name, then return false.
            return false;
        }
    }

    //lookup
    public List<String> lookup(String name) {
        // this will retrieve the name in the given phoneBookMap
        return phoneBookMap.get(name);
    }

    //reverseLookup
    public String reverseLookup(String phoneNumber) {

        //
        for (Map.Entry<String, List<String>> entry : phoneBookMap.entrySet()) {
            if (entry.getValue().contains(phoneNumber)) {
                return entry.getKey();
            }
        }
        return null;
    }

    //getAllContactNames
    public List<String> getAllContactNames() {

        // want to return a List<String> so you create one to use. allContactNames
        List<String> allContactNames = new ArrayList<>();

        // for each String type key in the phoneBookMap list .keySet
        for (String key : phoneBookMap.keySet()) {

            // add that key from phoneBookMap.keySet to the new allContactNames list
            allContactNames.add(key);
        }
        //return this new list that now has all the key contact names in it
        return allContactNames;
    }

    //getMap
    public Map<String, List<String>> getMap() {

        return phoneBookMap;
    }
}
