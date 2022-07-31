package model;

import java.util.ArrayList;

public class PetManager {

    private ArrayList<Pet> petsList;

    public PetManager() {
        this.petsList = new ArrayList<>();
        testDatas();
    }

    public int getTotalPets(){
        return petsList.size();
    }

    public void addPet(Pet pet){
        if (!petsList.contains(pet)){
            petsList.add(pet);
        }
    }

    public void deletePet(int idOwner){
        for (int i = 0; i < petsList.size(); i++) {
            if (petsList.get(i).getOwnerId() == idOwner){
                petsList.remove(i);
            }
        }
    }

    public ArrayList<Pet> getPetsList() {
        return petsList;
    }

    public ArrayList<Double> frequentPets(){
        ArrayList<Double> list = new ArrayList<>();
        int totalPets = petsList.size();

        list.add((double)numberFrequentPet(Size.BIG)*100/totalPets);
        list.add((double)numberFrequentPet(Size.MEDIUM)*100/totalPets);
        list.add((double)numberFrequentPet(Size.LITTLE)*100/totalPets);

        return list;
    }

    public int numberFrequentPet(Size size){
        int result = 0;
        for (int i = 0; i < petsList.size(); i++) {
            Pet tempPet = petsList.get(i);
            if (size == tempPet.getSize()){
                result++;
            }
        }
        return result;
    }

    public ArrayList<Integer> getPercentageGender(){
        ArrayList<Integer> list = new ArrayList<>();
        int male = 0;
        int female = 0;
        for (int i = 0; i < petsList.size(); i++) {
            if(petsList.get(i).getGender() == Gender.MALE){
                male++;
            }else {
                female++;
            }
        }
        list.add(male);
        list.add(female);
        return list;
    }

    //Datos quemados
    public void testDatas(){
        petsList.add(new Pet("Mizuky",Size.LITTLE,Gender.FEMALE,8,102910,"David","312312"));
        petsList.add(new Pet("Terracota", Size.MEDIUM,Gender.MALE,2,119382,"Marco","434324"));
        petsList.add(new Pet("Ruf", Size.MEDIUM,Gender.MALE,1,106352,"Nicolas","1231412"));
    }
}
