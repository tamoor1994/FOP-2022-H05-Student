package h05;

public class SurvivalOfTheFittestZoo implements Zoo {
    @Override
    public boolean canLiveTogether(Animal a, Animal b) {
        return true;
    }

    @Override
    public boolean isAllowed(Animal animal) {
        return animal.animalType != AnimalType.AVES;
    }
}
