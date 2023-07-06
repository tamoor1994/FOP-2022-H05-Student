package h05;

public abstract class Animal {
    protected AnimalType animalType;

    /**
     * @return animalType
     */
    public AnimalType getAnimalType() {
        return animalType;
    }

    abstract String letMeMove();

    @Override
    public String toString() {
        String animalTypeName;
        if (animalType == null) {
            animalTypeName = "Null";
        } else {
            animalTypeName = animalType.name().substring(0, 1).toUpperCase() + animalType.name().substring(1).toLowerCase();
        }

        return "My species is called " + animalType + " which is part of animal type " + animalTypeName + ".";
    }

}
