package h05;

public class SaltWaterCrocodile extends Animal implements Walking, Swimming {

    /**
     * average speed
     */
    public static double averageSpeed;

    /**
     * Constructer of the class
     */
    public SaltWaterCrocodile() {
        super();
        animalType = AnimalType.CROCODYLIDAE;
    }
    @Override
    String letMeMove() {
        return "";
    }

    @Override
    public boolean canLiveInSaltWater() {
        return true;
    }

    @Override
    public boolean canLiveInFreshWater() {
        return true;
    }

    @Override
    public void letMeSwim(char distance, double x, double y) {

    }

    @Override
    public byte getNumberOfLegs() {
        return 4;
    }

    @Override
    public double getAverageSpeed(double distance) {
        return averageSpeed;
    }

    /**
     * overwrites the attribut averageSpeed
     * @param averageSpeed the new average speed
     */
    public void setAverageSpeed(double averageSpeed) {
        SaltWaterCrocodile.averageSpeed = averageSpeed;
    }
}
