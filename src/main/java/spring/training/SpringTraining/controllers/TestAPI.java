package spring.training.SpringTraining.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import spring.training.SpringTraining.models.Owners;

@RestController
@RequestMapping("/test")
public class TestAPI {
    @Autowired
    private RemoteAPI remote;

    @GetMapping("/remote")
    public ResponseEntity<?> selectByOwnerName(){
        return remote.getOwners();
    }

    @PostMapping("/insert")
    public ResponseEntity<?> insertByOwnerName(@RequestBody Owners req){
        return remote.postOwner(req);
    }
}
