package by.company.controllers;
/*
import by.company.enteties.Pet;
import by.company.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/pet")
public class PetController {

    @Autowired
    private PetService petService;

    @GetMapping(path = "/findByStatus")
    public ResponseEntity<List<Pet>> findByStatus(@RequestBody Pet pet){
            List<Pet> byStatus = petService.getByStatus(pet);
            return new ResponseEntity<>(byStatus,HttpStatus.OK);
    }

    @GetMapping(path = "/findById")
    public ResponseEntity<String> findById(Pet pet){

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<String> addNewPet(Pet pet){
        petService.save(pet);
        return new ResponseEntity<>("Success",HttpStatus.OK);
    }

    @PostMapping(path = "/petid")
    public ResponseEntity<String> update(Pet pet){

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Pet> updateExistingPet(){

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping(path = "/delpetid")
    public ResponseEntity<String> deleteById(Pet pet){

        return new ResponseEntity<>(HttpStatus.OK);
    }

}*/
