package _04_hospital;

import java.util.ArrayList;

public class Doctor {
	ArrayList<Patient> patients = new ArrayList<Patient>();

	public boolean performsSurgery() {
		return false;
	}

	public boolean makesHouseCalls() {
		return false;
	}

	public void assignPatient(Patient patient) throws DoctorFullException {
		// TODO Auto-generated method stub
		if (patients.size()<3) {
			patients.add(patient);
		}else {
			throw new DoctorFullException();
		}
		
	}

	public ArrayList<Patient> getPatients() {
		// TODO Auto-generated method stub
		return patients;
	}

	public void doMedicine() {
		// TODO Auto-generated method stub
		for (int i = 0; i < patients.size(); i++) {
			patients.get(i).caredFor=true;
		}
	}

}
