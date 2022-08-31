package spring.training.SpringTraining.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.training.SpringTraining.models.Students;

@Repository
public interface StudentRepo extends JpaRepository<Students,Integer> {
}
