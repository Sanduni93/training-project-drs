package com.sanduni.drs.patientinfo.service;


import com.sanduni.drs.patientinfo.model.Patient;

import java.util.List;
import java.util.Optional;

public interface PatientService {

    Patient Save(Patient patient);
    Optional<Patient> fetchPatientById(int id);
    List<Patient> fetchAllPatients();
    String deletePatientById(int id);
}
