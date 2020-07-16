package by.company.service;
/*
import by.company.enteties.Pet;
import by.company.storage.PetStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetService {

    @Autowired
    private PetStorage petStorage;

    public void save(Pet pet){
        petStorage.addPet(pet);
    }

    public List<Pet> getByStatus(Pet pet){
        checkStatus(pet,pet.getStatus());
        String status = pet.getStatus();
        List<Pet> byStatus = petStorage.getByStatus(status);
        return byStatus;
    }

    public void checkStatus(Pet pet,String status){
        boolean available = pet.getStatus().equals(status);
        boolean pending = pet.getStatus().equals(status);
        boolean sold = pet.getStatus().equals(status);
        if(!(available || pending || sold)){
            throw new IllegalStateException();
        }
    }

}*/
