package com.sanduni.drs.patientinfo.repository;

import com.sanduni.drs.patientinfo.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PatientRepository extends JpaRepository<Patient, Integer> {

}
