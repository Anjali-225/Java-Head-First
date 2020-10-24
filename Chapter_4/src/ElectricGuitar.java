public class ElectricGuitar {
    String brand;
    int numOfPickups;
    boolean rockStarUSesIt;

    // Getter
    String getBrand() {
        return brand;
    }

    // Setter
    void setBrand(String aBrand) {
        brand = aBrand;
    }

    // Getter
    int getNumOfPickups() {
        return numOfPickups;
    }

    // Setter
    void setNumOfPickups(int num) {
        numOfPickups = num;
    }

    // Getter
    boolean getRockStarUsesIt() {
        return rockStarUSesIt;
    }

    void setRockStarUSesIt(boolean yesOrNo) {
        rockStarUSesIt = yesOrNo;
    }
}
