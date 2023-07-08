package h05;

import java.util.concurrent.ThreadLocalRandom;
import java.util.function.IntConsumer;

public class Shark extends Animal implements Swimming, IntConsumer {

    private short specificSpecies;
    private int x;
    private int y;
    private int degreeOfHunger;


    /**
     * @return the species
     */
    public short getSpecificSpecies() {
        return specificSpecies;
    }

    /**
     * @return the x-coordinate
     */
    public int getX() {
        return x;
    }

    /**
     * @return the y-coordinate
     */
    public int getY() {
        return y;
    }

    /**
     * @return the degree of hunger
     */
    public int getDegreeOfHunger() {
        return degreeOfHunger;
    }

    @Override
    String letMeMove() {
        int newX = x;
        int newY = y;
        letMeSwim((char) ThreadLocalRandom.current().nextInt(1, 6), ThreadLocalRandom.current().nextInt(1, 6), ThreadLocalRandom.current().nextInt(1, 6));
        return String.format("%d -> %d and %d -> %d", newX, x, newY, y);
    }

    @Override
    public boolean canLiveInSaltWater() {
        return (specificSpecies == 2) || (specificSpecies == 5) || (specificSpecies == 9);
    }

    @Override
    public boolean canLiveInFreshWater() {
        return (specificSpecies % 2 == 0) && (specificSpecies % 4 != 0);
    }

    @Override
    public void letMeSwim(char distance, double x, double y) {
        this.x = (int) x * distance;
        this.y  = (int) y * distance;
    }

    @Override
    public void accept(int value) {

    }
}
