package spring.training.SpringTraining.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import spring.training.SpringTraining.models.Owners;

import java.util.List;

@Repository
public interface OwnerRepo extends JpaRepository<Owners,Integer> {
    @Query(value = "select * from owners where owner_name=?1", nativeQuery = true)
    List<Owners> getOwnerByName(String name);

    @Query("select ow from Owners ow where ow.ownerName=?1")
    List<Owners> getOwnersByNameJPQL(String name);
}
