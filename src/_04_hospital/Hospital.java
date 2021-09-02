package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
ArrayList<Doctor> doctors = new ArrayList<Doctor>();
ArrayList<Patient> patients = new ArrayList<Patient>();;
	public void addDoctor(Doctor d) {
		doctors.add(d);
	}

	public void addPatient(Patient p) {
		patients.add(p);
	}

	public List<Doctor> getDoctors() {
		return doctors;
	}

	public List<Patient> getPatients() {
		return patients;
	}

	public void assignPatientsToDoctors()throws Exception {
		for (int i = 0; i < doctors.size(); i++) {
			if (patients.size()>=3) {
				for (int j = 2; j >= 0; j--) {
					doctors.get(i).assignPatient(patients.remove(j));
				}
			}else {
				for (int j = patients.size()-1; j >= 0; j--) {
					doctors.get(i).assignPatient(patients.remove(j));
				}
			}
		}
	}

}
