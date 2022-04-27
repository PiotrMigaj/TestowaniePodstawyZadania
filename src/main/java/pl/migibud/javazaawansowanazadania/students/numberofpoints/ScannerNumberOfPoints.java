package pl.migibud.javazaawansowanazadania.students.numberofpoints;

import java.util.Scanner;

public class ScannerNumberOfPoints implements NumberOfPointsProvider {

    private final Scanner scanner = new Scanner(System.in);

    @Override
    public int getNumberOfPoints() {
        System.out.println("Enter number of point of Student:");
        return scanner.nextInt();
    }
}
