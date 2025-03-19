package Animals.Animals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class AnimalsService {

    @Autowired
    private AnimalsRepository animalsRepository;

    // Fetch and return all Animals
    public Object getAllAnimals() {
        return animalsRepository.findAll();
    }

    // Fetch and return unique Animal
    public Object getAnimalsById(int Id) {
        return animalsRepository.getAnimalID(Id);
    }

    // Fetch and return Animal Name
    public Object getAnimalsByName(String animalName) {
        return animalsRepository.getAnimalName(animalName);
    }

    // Fetch and return Animal origin
    public Object getAnimalsByOrigin(String origin) {
        return animalsRepository.getAnimalOrigin(origin);
    }

    // Fetch and return Animal Lifespan
    public Object getAnimalsByLifespan(int lifespan) {
        return animalsRepository.getAnimalLifespan(lifespan);
    }

    // Fetch and return Animal description
    public Object getAnimalsByDescription(String description) {
        return animalsRepository.getAnimalDescription(description);
    }

    // Add new Animal
    public Object addNewAnimal(Animals animals) {
        return animalsRepository.save(animals); // ✅ Now using the instance
    }

    // Update Animal
    public void updateAnimal(int id, Animals animals) {
        Animals existing = (Animals) getAnimalsById(id);
        existing.setAnimalName(animals.getAnimalName());
        existing.setOrigin(animals.getOrigin());
        existing.setLifespan(animals.getLifespan());

        //Technically the 4 lines above are not necessary because the save method merges by default.
        animalsRepository.save(existing);
    }

    // Delete Animal
    public void deleteAnimalById(int id) {

        animalsRepository.deleteById(id);
    }

}
