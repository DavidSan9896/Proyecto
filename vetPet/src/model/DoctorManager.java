package model;

import java.util.ArrayList;

public class DoctorManager {

    private AppointmentManager appointmentManager;
    private ArrayList<Doctor> doctors;

    public DoctorManager(){
        doctors = new ArrayList<>();
    }


    public DoctorManager(ArrayList<Doctor> doctors){
        this.doctors = doctors;
    }

    public void setDoctors(ArrayList<Doctor> doctors){
        this.doctors = doctors;
    }


    public void addDoctor(Doctor doctor){
        if (!doctors.contains(doctor)){
            doctors.add(doctor);
        }
    }


    public void deleteDoctor(String idDoctor){
        for (int i = 0; i < doctors.size(); i++) {
            if(doctors.get(i).getId().equalsIgnoreCase(idDoctor)){
                doctors.remove(i);
            }
        }
    }


    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }    

    public ArrayList<Appointment> getAppointmentsList() {
        return appointmentManager.getAppointmentList();
    }

    public AppointmentManager getAppointmentManager() {
        return appointmentManager;
    }

    public ArrayList<Double> percentageDoctorForCategory(){
        ArrayList<Double> list = new ArrayList<>();

        return list;
    }

    public int numberDoctorsCategorys(CategoryEspeciality especiality){
        int result = 0;
        for (int i = 0; i < doctors.size(); i++) {
            if (doctors.get(i).getCategoryEspeciality() == especiality){
                result++;
            }
        }
        return result;
    }

}
