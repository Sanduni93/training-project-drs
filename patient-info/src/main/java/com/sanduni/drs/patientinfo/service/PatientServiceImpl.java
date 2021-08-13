package com.sanduni.drs.patientinfo.service;

import com.sanduni.drs.patientinfo.model.Patient;
import com.sanduni.drs.patientinfo.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientServiceImpl implements PatientService{

    @Autowired
    PatientRepository patientRepository;

    @Autowired
    PatientService patientService;

    public Patient Save(Patient patient) {
        return patientRepository.save(patient);
    }


    public Optional<Patient> fetchPatientById(int id) {
        return patientRepository.findById(id);

    }

    public List<Patient> fetchAllPatients() {
        return patientRepository.findAll();
    }

    public String deletePatientById(int id) {
        String result;

        try{
            patientRepository.deleteById(id);
            result = "Patient information is successfully deleted.";
        }
        catch (Exception e){
            result = "Paatient information have not deleted.";
        }
        return result;
    }


}
