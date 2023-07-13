package h05;

public interface Amphibean extends Walking, Swimming {

    /**
     * @return the preferred Enviroment
     */
    EnvironmentType getPreferredEnvironmentType();
}
