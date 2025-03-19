package Animals.Animals;

import jakarta.persistence.*;

@Entity
@Table(name = "animals")
public class Animals {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String animalName;
    private String origin;
    private int lifespan;
    private String description;


    public Animals(int id, String animalName, String origin, int lifespan, String description) {
        this.id = id;
        this.animalName = animalName;
        this.origin = origin;
        this.lifespan = lifespan;
        this.description = description;
    }

    public Animals() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public int getLifespan() {
        return lifespan;
    }

    public void setLifespan(int lifespan) {
        this.lifespan = lifespan;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}