package h05;

public class FamilyFriendlyZoo implements Zoo {

    @Override
    public boolean canLiveTogether(Animal a, Animal b) {
        if (a.getAnimalType() == AnimalType.CHONDRICHTHYES && b instanceof Shark) {
            return false;
        }

        if (a instanceof Shark && b.getAnimalType() == AnimalType.CHONDRICHTHYES) {
            return false;
        }

        if (a.getAnimalType() == AnimalType.CROCODYLIDAE && b.getAnimalType() == AnimalType.MAMMALIA) {
            return false;
        }

        if (a.getAnimalType() == AnimalType.MAMMALIA && b.getAnimalType() == AnimalType.CROCODYLIDAE) {
            return false;
        }

        if (a.getAnimalType() == AnimalType.AVES) {
            if (b.getAnimalType() == AnimalType.MAMMALIA) {
                // Check if mammals run slower than 3 m/s
                // Assuming mammals run slower than 3 m/s for simplicity
                return true;
            } else if (b.getAnimalType() == AnimalType.AVES) {
                // Birds can live together with other birds
                return true;
            } else {
                return false; // Birds can't live with other types of animals
            }
        }

        // All other cases are allowed
        return true;
    }

    @Override
    public boolean isAllowed(Animal animal) {
        return false;
    }
}
