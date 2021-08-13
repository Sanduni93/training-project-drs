package com.sanduni.drs.patientinfo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "patient")
public class Patient {

    @Id
    @GeneratedValue
    int id;
    String firstName;
    String lastName;
    String gender;
    String nicNo;
    String dob;
    String address;
    String phoneNo;
    String division;
    String idedntifiedDate;
    String identifiedMonth;
    String identifiedYear;
    String status;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNicNo() {
        return nicNo;
    }

    public void setNicNo(String nicNo) {
        this.nicNo = nicNo;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getIdedntifiedDate() {
        return idedntifiedDate;
    }

    public void setIdedntifiedDate(String idedntifiedDate) {
        this.idedntifiedDate = idedntifiedDate;
    }

    public String getIdentifiedMonth() {
        return identifiedMonth;
    }

    public void setIdentifiedMonth(String identifiedMonth) {
        this.identifiedMonth = identifiedMonth;
    }

    public String getIdentifiedYear() {
        return identifiedYear;
    }

    public void setIdentifiedYear(String identifiedYear) {
        this.identifiedYear = identifiedYear;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
