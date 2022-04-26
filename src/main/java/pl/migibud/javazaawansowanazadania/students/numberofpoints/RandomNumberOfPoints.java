package pl.migibud.javazaawansowanazadania.students.numberofpoints;

import java.util.Random;

public class RandomNumberOfPoints implements NumberOfPointsProvider {

    @Override
    public int getNumberOfPoints() {
        return new Random().nextInt(50)+1;
    }
}
