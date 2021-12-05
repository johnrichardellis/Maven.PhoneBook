package com.zipcodewilmington.phonebook;

import java.util.*;
//import java.util.HashMap;


/**
 * Created by leon on 1/23/18.
 * Made WAY better by kristofer 6/16/20
 */
public class PhoneBook {

    // associated data type (which is a data type with keys and values) in this case, a map
    private Map<String, List<String>> phoneBookMap = new LinkedHashMap<>();
//    private Map<String, List<String>> phoneBook;   // could also declare this way, although this isn't initialized.


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

        // declaring new list phoneNumberList to hold the phoneNumber variable
        // if you look above at our phoneBookMap, it is a Map of types <String and a List<String>>
        // so what are we given? a string for name and a string for the phone number
        // so we need to place the phone number into a list in order to satisfy the requirements of the phoneBookMap
        // created a list, called phoneNumberList and added phoneNumber parameter to it
        List<String> phoneNumberList = Arrays.asList(phoneNumber);

        // using our phoneBookMap map instance field declared above
        // with key value pairs of <String> and List<String>, we .put (add) them into the map
        phoneBookMap.put(name, phoneNumberList);
    }

    //addAll
    public void addAll(String name, String... phoneNumbers) { // String... means more than one

        // creating new list to store phone numbers (2nd parameter)
        // same idea here as in the above method, except we are passing in phoneNumbers, and not a singular phoneNumber
        List<String> phoneNumberList = Arrays.asList((phoneNumbers));

        // you add the above created list in as the 2nd parameter
        // adding to the phoneBookMap list
        // again, same idea as above
        phoneBookMap.put(name, phoneNumberList);

    }

    //remove
    public void remove(String name) {

        // using our declared instance field phoneBookMap
        // using .remove method and passing in the name we want to remove
        phoneBookMap.remove(name);
    }

    //hasEntry
    public Boolean hasEntry(String name) {

        // checking to see if the phoneBookMap contains a certain name, and if so, return true.
        // checking our above declared phoneBookMap to see if it contains the key we are looking for
        // notice we are using .containsKey to look for a specific key
        if (phoneBookMap.containsKey(name)) {
            return true;
        } else {
            // if the phoneBookMap doesnt contain name, then return false.
            return false;
        }
    }

    //lookup
    public List<String> lookup(String name) {
        // this will retrieve the phoneNumber in the phoneBookMap for the given Key
        // given key will return value
        return phoneBookMap.get(name);
    }

    //reverseLookup
    public String reverseLookup(String phoneNumber) {

        // for each loop going the entirety of the phoneBookMap
        // for (TYPE Map of Strings and List of Strings INDIVIDUAL ENTRY : the whole map set)
        for (Map.Entry<String, List<String>> entry : phoneBookMap.entrySet()) {
            // checking to see if the value contains parameter phoneNumber
            // using .getValue and .contains
            if (entry.getValue().contains(phoneNumber)) {
                // return the key for that entry where we found the phone number
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
        // here look what we are doing
        // we are using JUST the keys in the phoneBookMap, even though it obviously has both keys and values since it is a map
        // so, we iterate through all the keys in the phoneBookMap
        for (String key : phoneBookMap.keySet()) {

            // and we are adding every key in the phoneBookMap to our new list called allContactNames
            // or you could say, add that key from phoneBookMap.keySet to the new allContactNames list
            allContactNames.add(key);
        }
        //return this new list that now has all the key contact names in it
        return allContactNames;
    }

    //getMap
    public Map<String, List<String>> getMap() {

        // we are just going to return the instance field we declared above
        return phoneBookMap;
    }
}
