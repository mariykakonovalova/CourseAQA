package org.example;

import java.util.*;

public class TelephoneDirectory {

    private final Map<String, List<String>> data;

    public TelephoneDirectory() {
        this.data = new TreeMap<>();
    }

    public void add(String name, String phone) {
        List<String> phones = data.get(name);
        if (phones == null) {
            List<String> emptyPhones = new ArrayList<>();
            emptyPhones.add(phone);
            data.put(name, emptyPhones);
        } else {
            phones.add(phone);
        }
    }

    public List<String> getPhonesByName(String name) {
        return data.get(name);
    }

    @Override
    public String toString() {
        return "TelephoneDirectory{" +
                "data=" + data +
                '}';
    }

}