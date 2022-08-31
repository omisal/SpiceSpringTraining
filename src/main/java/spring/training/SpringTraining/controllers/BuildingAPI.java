package spring.training.SpringTraining.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import spring.training.SpringTraining.models.Buildings;
import spring.training.SpringTraining.repositories.BuildingRepo;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/building")
public class BuildingAPI {

//    @GetMapping("/spice")
//    public String index(){
//        return "home";
//    }
    @Autowired
    private BuildingRepo buildingRepo;

    @PostMapping("")
    public ResponseEntity<?> newBuilding(@RequestBody Buildings building){
        Buildings building2= buildingRepo.save(building);
        return new ResponseEntity<>(building2,HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateBuilding(@PathVariable("id") int spice,@RequestBody Buildings building){
        if(buildingRepo.findById(spice).isPresent()){
            building.setId(spice);
            Buildings building2= buildingRepo.save(building);
            return new ResponseEntity<>(building2,HttpStatus.OK);
        }else{
            return new ResponseEntity<>("Building not found",HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteBuilding(@PathVariable("id") int spice){
        if(buildingRepo.findById(spice).isPresent()){
            buildingRepo.deleteById(spice);
            return new ResponseEntity<>("Building has been deleted",HttpStatus.OK);
        }else{
            return new ResponseEntity<>("Building not found",HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("")
    public ResponseEntity<?> newBuilding(){
        List<Buildings> buildings= buildingRepo.findAll();
        return new ResponseEntity<>(buildings,HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> newBuilding(@PathVariable("id") int id){
        Optional<Buildings> building = buildingRepo.findById(id);
        if(building.isPresent()){
            return new ResponseEntity<>(building.get(),HttpStatus.CREATED);
        }else{
            return new ResponseEntity<>("Building with id "+Integer.toString(id)+" is  not found",HttpStatus.NOT_FOUND);
        }
    }
}
