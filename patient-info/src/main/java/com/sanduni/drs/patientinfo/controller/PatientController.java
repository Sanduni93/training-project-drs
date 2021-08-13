package com.sanduni.drs.patientinfo.controller;

import com.sanduni.drs.patientinfo.model.Patient;
import com.sanduni.drs.patientinfo.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin

public class PatientController {

    @Autowired
    PatientService patientService;

    @RequestMapping(value = "/patient", method = RequestMethod.POST)
    @CrossOrigin(origins = "http://localhost:4200")
    public Patient save(@RequestBody Patient patient){
        return patientService.Save(patient);
    }

    @RequestMapping (value = "/patient/{id}", method = RequestMethod.GET)
    @CrossOrigin(origins = "http://localhost:4200")
    public Patient fetchPatientById(@PathVariable int id){
       return patientService.fetchPatientById(id).get();
    }

    @RequestMapping(value = "/patients", method = RequestMethod.GET)
    @CrossOrigin(origins = "http://localhost:4200")
    public List<Patient> fetchAllPatients(){
        List<Patient> patients = new ArrayList<Patient>();
        patients = patientService.fetchAllPatients();
        return patients;
    }

    @RequestMapping(value = "/patient/{id}", method = RequestMethod.DELETE)
    @CrossOrigin(origins = "http://localhost:4200")
    public String delete(@PathVariable int id){
        return patientService.deletePatientById(id);
    }

}