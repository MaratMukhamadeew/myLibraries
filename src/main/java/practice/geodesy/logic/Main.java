package practice.geodesy.logic;

import practice.geodesy.entyties.Square;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Cartogram cartogram = new Cartogram(23.666);
//        System.out.println(Arrays.toString(cartogram.getSquares()));
//        System.out.printf("%.3f",cartogram.getAverageHeightOfAllSquares());
//            cartogram.printPlan();
        for (Square square : cartogram.getSquares()) {
            square.findingThePositionOfZeroPointsOfWork();
            System.out.println();
        }

        LevelingLog log = new LevelingLog(23.666);
        log.printPlan();
    }
}

