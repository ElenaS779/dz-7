public enum SolarSystem {
    MERCURY(1, 0, 2450),
    VENUS(2, 50, 6050, MERCURY),
    EARTH(3, 42, 6380, VENUS),
    MOON(3, 42, 1737.1, VENUS),
    MARS(4, 78, 3400, EARTH),
    JUPITER(5, 552, 71500, MARS),
    GANIMED(5, 552, 12700, MARS),
    CALLISTO(5, 552, 2400, MARS),
    IO(5, 552, 1815, MARS),
    EUROPE(5, 552, 1560.8, MARS),
    SATURN(6, 620, 60300, JUPITER),
    TITAN(6, 620, 2575, JUPITER),
    REA(6, 620, 765, JUPITER),
    YAPET(6, 620, 735, JUPITER),
    DIONNE(6, 620, 560, JUPITER),
    TEFIA(6, 260, 525, JUPITER),
    ENCELADUS(6, 620, 250, JUPITER),
    MIMAS(6, 620, 125, JUPITER),
    URANUS(7, 1500, 25500, SATURN),
    TITANIA(7, 1500, 789, SATURN),
    OBERON(7, 1500, 761, SATURN),
    UMBRIEL(7, 1500, 584.7, SATURN),
    ARIEL(7, 1500, 578.9, SATURN),
    MIRANDA(7, 1500, 235.8, SATURN),
    NEPTUNE(8, 1600, 25000, URANUS),
    TRITON(8, 1600, 1350, URANUS),
    PROTEUS(8, 1600, 210, URANUS);

    private final int numberFromSun;
    private final double distanceFromPlanetFront;
    private final double radius;
    private final SolarSystem planetNamePrevious;

    private final double distanceFromSun;

    SolarSystem(int numberFromSun, double distanceFromPlanetFront, double radius, SolarSystem planetNamePrevious) {
        this.numberFromSun = numberFromSun;
        this.distanceFromPlanetFront = distanceFromPlanetFront;
        this.radius = radius;
        this.planetNamePrevious = planetNamePrevious;

        this.distanceFromSun = planetNamePrevious != null ? planetNamePrevious.distanceFromSun + distanceFromPlanetFront : distanceFromPlanetFront;
    }

    SolarSystem(int numberFromSun, double distanceFromPlanetFront, double radius) {
        this.numberFromSun = numberFromSun;
        this.distanceFromPlanetFront = distanceFromPlanetFront;
        this.radius = radius;
        this.planetNamePrevious = null;
        this.distanceFromSun = 58;

    }

    public int getNumberFromSun() {

        return numberFromSun;
    }

    public double getDistanceFromPlanetFront() {
        return distanceFromPlanetFront;
    }

    public double getDistanceFromSun() {
        return distanceFromSun;
    }

    public double getRadius() {
        return radius;
    }

    public SolarSystem getPlanetNamePrevious() {
        return planetNamePrevious;
    }

    @Override
    public String toString() {
        return "Number From the Sun:" + this.numberFromSun
                + " Distance From the Planet in Front:" + this.distanceFromPlanetFront
                + " Planet radius:" + this.radius
                + " Previous name of the planet:" + this.planetNamePrevious.name()
                + " Distance from Sun:" + distanceFromSun;

    }
}
