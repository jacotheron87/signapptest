package com.nnf.signapptest.service;

import org.springframework.stereotype.Service;

@Service
public class PatientService {

    public String cleanId(String id) {
        if (id.contains("|")) {
            id = id.substring(id.indexOf("|") + 1);
            id = cleanId(id);
        }
        return id;
    }
}
