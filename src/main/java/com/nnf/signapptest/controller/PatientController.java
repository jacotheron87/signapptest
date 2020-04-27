package com.nnf.signapptest.controller;

import com.nnf.signapptest.dto.PatientDTOWrapper;
import com.nnf.signapptest.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/v1")
public class PatientController {

    @Autowired
    private PatientService service;

    @PostMapping("/patients")
    ResponseEntity<Object> handlePatients(@Valid @RequestBody PatientDTOWrapper patientDtoWrapper) {
        String cleanId = service.cleanId(patientDtoWrapper.getClientId());
        patientDtoWrapper.setClientId(cleanId);
        return new ResponseEntity<>(patientDtoWrapper, HttpStatus.OK);
    }

}
