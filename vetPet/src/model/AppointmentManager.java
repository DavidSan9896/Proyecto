package model;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class AppointmentManager {

    private ArrayList<Appointment> appointmentList;


    public AppointmentManager() {
         this.appointmentList = new ArrayList<>();
    }

    public void addAppointment(Appointment appointment){
        int count = appointmentList.size()+1;
        if (!appointmentList.contains(appointment)){
            appointment.setIdPet(count++);
            appointmentList.add(appointment);
        }
    }

    public void deleteAppointment(int idPet){
        for (int i = 0; i < appointmentList.size(); i++) {
            if (appointmentList.get(i).getIdPet() == idPet){
                appointmentList.remove(i);
            }
        }
    }


    public List<Double> percentageCategoriesAppointment(){
        int total = appointmentList.size();
        List<Double> results = new ArrayList<>();



        return results;
    }

    public int getTotalNumberOfCategories(CategoryEspeciality categoryEspeciality){
        int result = 0;
        for (int i = 0; i < appointmentList.size(); i++) {
            if (appointmentList.get(i).getCategory() == categoryEspeciality){
                result++;
            }
        }
        return result;
    }

    public void registerNewAppointment(Appointment appointment){
        
    }

    public ArrayList<Appointment> getAppointmentList() {
        return appointmentList;
    }


    public void setAppointmentList(ArrayList<Appointment> appointmentList) {
        this.appointmentList = appointmentList;
    }




}
