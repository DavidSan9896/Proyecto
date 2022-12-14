package model;

import java.util.ArrayList;
import java.util.List;

public class VetManager {


    private PetManager petManager;
    private DoctorManager doctorManager;
    private AppointmentManager appointmentManager;


    public VetManager() {
        this.doctorManager = new DoctorManager();
        this.petManager = new PetManager();
        this.appointmentManager = new AppointmentManager();
    }

    public void addPet(Pet pet){
        petManager.addPet(pet);
    }

    public ArrayList<Pet> getPetsList() {
        return petManager.getPetsList();
    }


    public void addDoctor(Doctor doctor){
        doctorManager.addDoctor(doctor);
    }

    public ArrayList<Doctor> getDoctors() {
        return doctorManager.getDoctors();
    }


    public void addAppointment(Appointment appointment){
        appointmentManager.addAppointment(appointment);
    }

    public ArrayList<Appointment> appointmenList(){
        return appointmentManager.getAppointmentList();
    }

    public List<Double> percentageCategoriesAppointment(){
        return appointmentManager.percentageCategoriesAppointment();
    }

    public ArrayList<Integer> getMonths(){
        return appointmentManager.getMonths();
    }

    public void deleteAppointment(int idPet){
        appointmentManager.deleteAppointment(idPet);
    }


    public ArrayList<Double> frequentPets(){
        return petManager.frequentPets();
    }

    public ArrayList<Integer> getPercentageGender(){
       return petManager.getPercentageGender();
    }

    public void deletePet(int idOwner){
        petManager.deletePet(idOwner);
    }


    public ArrayList<Double> percentageDoctorForCategory(){
        return doctorManager.percentageDoctorForCategory();
    }

    public void deleteDoctor(String idDoctor){
        doctorManager.deleteDoctor(idDoctor);
    }



}
