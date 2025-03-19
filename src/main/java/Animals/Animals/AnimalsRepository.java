package Animals.Animals;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnimalsRepository extends JpaRepository<Animals, Integer> {

    List<Animals> getAnimalID(int Id);

    List<Animals> getAnimalName(String animalName);

    List<Animals> getAnimalOrigin(String origin);

    List<Animals> getAnimalLifespan(int lifespan);

    List<Animals> getAnimalDescription(String description);

}
