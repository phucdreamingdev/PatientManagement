/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import model.Patient;

/**
 *
 * @author Phuc
 */
public class PatientDAO {

    public static List<Patient> patientList = new ArrayList<>();
    public int validIndexArraySize = 8;

    public String getInvalidError(Patient patient, boolean addNew, boolean[] emptyIndex) {
        String invalidMessage = "";
        if (addNew == true) {
            if (emptyIndex[0]) {
                invalidMessage += "- Patient ID empty.\n";
            } else {
                if (!checkValidPatientID(patient.getPatientID())) {
                    invalidMessage += "- Patient ID format PAxxx. x are 1 - 8 numeric characters.\n";
                } else if (isIDExisted(patient.getPatientID())) {
                    invalidMessage += "- Patient ID " + patient.getPatientID() + " is exist.\n";
                }
            }
        }

        if (emptyIndex[1]) {
            invalidMessage += "- Patient Name empty.\n";
        } else if (!checkValidPatientName(patient.getPatientName())) {
            invalidMessage += "- Patient Name invalid.\n";
        }

        if (emptyIndex[2]) {
            invalidMessage += "- Birthday invalid.\n";
        } else if (!checkValidBirthday(patient.getBirthday())) {
            invalidMessage += "- Birthday must be a day less than or today.\n";
        }

        if (emptyIndex[3]) {
            invalidMessage += "- Please choose Male or Female.\n";
        }

        if (emptyIndex[4]) {
            invalidMessage += "- Occupation empty.\n";
        } else if (!checkValidOccupation(patient.getOccupation())) {
            invalidMessage += "- Occupation invalid.\n";
        }

        if (emptyIndex[5]) {
            invalidMessage += "";
        } else if (!checkValidWorkPlace(patient.getWorkplace())) {
            invalidMessage += "- Workplace invalid.\n";
        }

        if (emptyIndex[6]) {
            invalidMessage += "- Phone number empty.\n";
        } else if (!checkValidPhone(patient.getPhone())) {
            invalidMessage += "- Phone number invalid.\n";
        }

        if (emptyIndex[7]) {
            invalidMessage += "- Health Insurance Number empty.\n";
        } else if (!checkValidHealthInsuranceNumber(patient.getHealthInsuranceNumber())) {
            invalidMessage += "- Health Insurance Number must be GDxxx or DNxxx. x are 13 numeric characters.";
        }

        return invalidMessage;
    }

    //Valid Error 0
    public boolean isIDExisted(String patientID) {
        for (int i = 0; i < patientList.size(); i++) {
            if (patientID.equalsIgnoreCase(patientList.get(i).getPatientID())) {
                return true;
            }
        }
        return false;
    }

    public boolean checkValidPatientID(String patientID) {
        if (!patientID.matches("^PA\\d{1,8}$")) {
            return false;
        }
        return true;
    }

    public boolean checkValidPatientName(String patientName) {
        if (!patientName.matches("^[a-zA-Z ]{3,50}$")) {
            return false;
        }
        return true;
    }

    public boolean checkValidBirthday(Date birthday) {
        Date now = new Date();
        if (birthday.after(now)) {
            return false;
        }
        return true;
    }

    public boolean checkValidOccupation(String occupation) {
        if (!occupation.matches("^[a-zA-Z ]{3,50}")) {
            return false;
        }
        return true;
    }

    public boolean checkValidWorkPlace(String workplace) {
        if (!workplace.matches("^[a-zA-Z ]{3,50}")) {
            return false;
        }
        return true;
    }

    public boolean checkValidPhone(String phone) {
        if (!phone.matches("\\d{10,15}")) {
            return false;
        }
        return true;
    }

    public boolean checkValidHealthInsuranceNumber(String healthInsuranceNumber) {
        if (!healthInsuranceNumber.matches("(GD|DN)\\d{13}")) {
            return false;
        }
        return true;
    }

    public void addNewPatient(Patient patient) {
        patientList.add(patient);
    }

    public void updatePatient(Patient patient, int index) {
        patientList.get(index).setPatientName(patient.getPatientName());
        patientList.get(index).setBirthday(patient.getBirthday());
        patientList.get(index).setGender(patient.isGender());
        patientList.get(index).setOccupation(patient.getOccupation());
        patientList.get(index).setWorkplace(patient.getWorkplace());
        patientList.get(index).setPhone(patient.getPhone());
        patientList.get(index).setAddress(patient.getAddress());
        patientList.get(index).setHealthInsuranceNumber(patient.getHealthInsuranceNumber());
        patientList.get(index).setSymptom(patient.getSymptom());
    }

    public void removePatient(int index) {
        patientList.remove(index);
    }

    public int searchByID(String patientID) {
        int i = -1;
        for (int j = 0; j < patientList.size(); j++) {
            if (patientList.get(j).getPatientID().equals(patientID)) {
                i = j;
            }
        }
        return i;
    }

    public List<Patient> searchByPatientName(String patientName) {
        List<Patient> searchResult = new ArrayList<>();
        for (Patient patient : patientList) {
            if (patient.getPatientName().contains(patientName)) {
                searchResult.add(patient);
            }
        }
        return searchResult;
    }

    public void sortAscendingByPatientName() {
        Collections.sort(patientList, new Comparator<Patient>() {
            @Override
            public int compare(Patient o1, Patient o2) {
                return o1.getPatientName().compareTo(o2.getPatientName());
            }
        });
    }

    public void sortDescendingByPatientName() {
        Collections.sort(patientList, new Comparator<Patient>() {
            @Override
            public int compare(Patient o1, Patient o2) {
                return o2.getPatientName().compareTo(o1.getPatientName());
            }
        });
    }

}
