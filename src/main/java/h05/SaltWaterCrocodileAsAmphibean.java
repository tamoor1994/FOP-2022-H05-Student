package h05;

public class SaltWaterCrocodileAsAmphibean implements Amphibean {
    private SaltWaterCrocodile salty;

    /**
     * Constructor from the class
     * @param animal from typ Animal
     */
    public SaltWaterCrocodileAsAmphibean(Animal animal) {
        super();
        if (animal instanceof SaltWaterCrocodile) {
            salty = (SaltWaterCrocodile) animal;
        }
    }


    @Override
    public EnvironmentType getPreferredEnvironmentType() {
        return EnvironmentType.IN_WATER;
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
        salty.letMeSwim(distance, x, y);
    }

    @Override
    public byte getNumberOfLegs() {
        return salty.getNumberOfLegs();
    }

    @Override
    public double getAverageSpeed(double distance) {
        return salty.getAverageSpeed(distance);
    }

    @Override
    public boolean equals(Object obj) {
        return (obj != null && obj instanceof SaltWaterCrocodileAsAmphibean) && salty == ((SaltWaterCrocodileAsAmphibean)obj).salty;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new SaltWaterCrocodileAsAmphibean(salty);
    }
}
