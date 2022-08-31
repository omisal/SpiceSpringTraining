package spring.training.SpringTraining.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.training.SpringTraining.models.Buildings;

@Repository
public interface BuildingRepo extends JpaRepository<Buildings,Integer> {
}
