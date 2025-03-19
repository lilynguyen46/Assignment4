package Animals.Animals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/animals")
public class AnimalsController {

    @Autowired
    private AnimalsService service;

    @GetMapping("/all")
    public Object getAllAnimals() {
        return new ResponseEntity<>(service.getAllAnimals(), HttpStatus.OK);

    }

    @GetMapping("/{id}")
    public Object getOneAnimal(@PathVariable int id) {
        return new ResponseEntity<>(service.getAnimalsById(id), HttpStatus.OK);

    }

    @GetMapping("/animalname")
    public Object getAnimalsByanimalName(@RequestParam(name = "search", defaultValue = "") String search) {
        return new ResponseEntity<>(service.getAnimalsByName(search), HttpStatus.OK);

    }

    @GetMapping("/animalorigin")
    public Object getAnimalsByOrigin(@RequestParam(name = "search", defaultValue = "") String search) {
        return new ResponseEntity<>(service.getAnimalsByOrigin(search), HttpStatus.OK);

    }

    @GetMapping("/{lifespan}")
    public Object getAnimalsByLifespan(@PathVariable int lifespan) {
        return new ResponseEntity<>(service.getAnimalsByLifespan(lifespan), HttpStatus.OK);

    }


    @GetMapping("/description")
    public Object getDescription(@PathVariable String description) {
        return new ResponseEntity<>(service.getAnimalsByDescription(description), HttpStatus.OK);
    }

    @PostMapping("/new")
    public Object addNewAnimal(@RequestBody Animals animals) {
        service.addNewAnimal(animals);
        return new ResponseEntity<>(service.getAllAnimals(), HttpStatus.CREATED);

    }

    @PutMapping("/update/{id}")
    public Object updateAnimal(@PathVariable int id, @RequestBody Animals animals) {
        service.updateAnimal(id, animals);
        return new ResponseEntity<>(service.getAnimalsById(id), HttpStatus.CREATED);

    }

    @DeleteMapping("/delete/{id}")
    public Object deleteStudentById(@PathVariable int id) {
        service.deleteAnimalById(id);
        return new ResponseEntity<>(service.getAllAnimals(), HttpStatus.OK);
    }
}
