package spring.training.SpringTraining.controllers;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import spring.training.SpringTraining.models.Owners;

@FeignClient(name = "owner21" , url = "localhost:8090/owner")
public interface RemoteAPI {
    @GetMapping
    ResponseEntity<?> getOwners();

    @PostMapping
    ResponseEntity<?> postOwner(@RequestBody Owners request);
}
