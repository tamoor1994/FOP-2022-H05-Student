package h05;

public interface Swimming {

    /**
     * @return if animal can live in Salt Water
     */
    boolean canLiveInSaltWater();

    /**
     * @return the distance of swimming
     */
    boolean canLiveInFreshWater();

    /**
     * gives the range of swimming
     * @param distance for distance
     * @param x -coordinate
     * @param y -coordinate
     */
    void letMeSwim(char distance, double x, double y);
}
