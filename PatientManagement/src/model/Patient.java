/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Phuc
 */
public class Patient {

    private String patientID;
    private String patientName;
    private Date birthday;
    private boolean gender;
    private String occupation;
    private String workplace;
    private String phone;
    private String address;
    private String healthInsuranceNumber;
    private String symptom;

    public Patient() {
    }

    public Patient(String patientID, String patientName, Date birthday, boolean gender, String occupation, String workplace, String phone, String address, String healthInsuranceNumber, String symptom) {
        this.patientID = patientID;
        this.patientName = patientName;
        this.birthday = birthday;
        this.gender = gender;
        this.occupation = occupation;
        this.workplace = workplace;
        this.phone = phone;
        this.address = address;
        this.healthInsuranceNumber = healthInsuranceNumber;
        this.symptom = symptom;
    }

    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public String getBirthdayString() {
        return new SimpleDateFormat("dd/MM/yyyy").format(birthday);
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public boolean isGender() {
        return gender;
    }

    public String getGender() {
        if (isGender() == true) {
            return "Male";
        } else {
            return "Female";
        }
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getWorkplace() {
        return workplace;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHealthInsuranceNumber() {
        return healthInsuranceNumber;
    }

    public void setHealthInsuranceNumber(String healthInsuranceNumber) {
        this.healthInsuranceNumber = healthInsuranceNumber;
    }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

}
