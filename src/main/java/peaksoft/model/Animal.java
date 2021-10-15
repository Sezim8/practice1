package peaksoft.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Animal {
    @Autowired
    private AnimalsCage animalsCage;
    @Autowired
    private Dog dog1;

    public Animal() {
    }

    public AnimalsCage getAnimalsCage() {
        return animalsCage;
    }

    public void setAnimalsCage(AnimalsCage animalsCage) {
        this.animalsCage = animalsCage;
    }

    public Dog getDog1() {
        return dog1;
    }

    public void setDog1(Dog dog1) {
        this.dog1 = dog1;
    }
}

