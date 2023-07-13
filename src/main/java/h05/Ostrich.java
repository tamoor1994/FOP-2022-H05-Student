package h05;

public class Ostrich extends Animal implements Walking {

    /**
     * Constructor of the class
     *
     */
    public Ostrich() {
       super();
       animalType = AnimalType.AVES;
   }
    private int distanceSoFar;

    /**
     * @return the distance
     */
    public int getDistanceSoFar() {
        return distanceSoFar;
    }

    @Override
    String letMeMove() {
        distanceSoFar++;
        return "Distace so far: " + distanceSoFar;
    }

    @Override
    public byte getNumberOfLegs() {
        return 2;
    }

    @Override
    public double getAverageSpeed(double distance) {
        if (distance <= 0) {
            return 0;
        }
        else if (distance <= 1.337) {
            return 6.900;
        }
        else if (distance <= 4.200) {
            return 3.140;
        } else {
            return 1;
        }
    }
}
