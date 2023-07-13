package h05;

public interface Zoo {

    /**
     * if
     * @param a can live with
     * @param b together
     * @return true
     */
    boolean canLiveTogether(Animal a, Animal b);


    /**
     * if
     * @param animal is allowed
     * @return true
     */
    boolean isAllowed(Animal animal);

}
