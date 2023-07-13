package h05;

public class SurvivalOfTheFittestZoo implements Zoo {
    @Override
    public boolean canLiveTogether(Animal a, Animal b) {
        return false;
    }

    @Override
    public boolean isAllowed(Animal animal) {
        return false;
    }
}
