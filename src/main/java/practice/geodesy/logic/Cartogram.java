package practice.geodesy.logic;

import practice.geodesy.entyties.Dot;
import practice.geodesy.entyties.Square;

public class Cartogram {
    LevelingLog log;
    Dot[] dots;
    private final Square[] squares = new Square[9];
    private double averageHeightOfAllSquares;

    public Cartogram(double picketHeight) {
        log = new LevelingLog(picketHeight);
        dots = log.getDots();
        calculatingTheAverageHeightOfAllSquares();
    }

    /**
     * Высчитываем среднюю высоту высот квадратов
     */
    private void calculatingTheAverageHeightOfAllSquares() {
        calculateSquares();
        for (Square square : squares) {
            averageHeightOfAllSquares += square.getAverageHeight();
        }
        averageHeightOfAllSquares /= 9;
    }

    public LevelingLog getLog() {
        return log;
    }

    /**
     * Метод создаёт квадраты и добавляет в них точки (высоты углов)
     */
    private void calculateSquares() {
        squares[0] = new Square(1);
        squares[0].addDot(dots[0]);
        squares[0].addDot(dots[1]);
        squares[0].addDot(dots[4]);
        squares[0].addDot(dots[5]);

        squares[1] = new Square(2);
        squares[1].addDot(dots[1]);
        squares[1].addDot(dots[2]);
        squares[1].addDot(dots[5]);
        squares[1].addDot(dots[6]);

        squares[2] = new Square(3);
        squares[2].addDot(dots[2]);
        squares[2].addDot(dots[3]);
        squares[2].addDot(dots[6]);
        squares[2].addDot(dots[7]);

        squares[3] = new Square(4);
        squares[3].addDot(dots[4]);
        squares[3].addDot(dots[5]);
        squares[3].addDot(dots[8]);
        squares[3].addDot(dots[9]);

        squares[4] = new Square(5);
        squares[4].addDot(dots[5]);
        squares[4].addDot(dots[6]);
        squares[4].addDot(dots[9]);
        squares[4].addDot(dots[10]);

        squares[5] = new Square(6);
        squares[5].addDot(dots[6]);
        squares[5].addDot(dots[7]);
        squares[5].addDot(dots[10]);
        squares[5].addDot(dots[11]);

        squares[6] = new Square(7);
        squares[6].addDot(dots[8]);
        squares[6].addDot(dots[9]);
        squares[6].addDot(dots[12]);
        squares[6].addDot(dots[13]);

        squares[7] = new Square(8);
        squares[7].addDot(dots[9]);
        squares[7].addDot(dots[10]);
        squares[7].addDot(dots[13]);
        squares[7].addDot(dots[14]);

        squares[8] = new Square(9);
        squares[8].addDot(dots[10]);
        squares[8].addDot(dots[11]);
        squares[8].addDot(dots[14]);
        squares[8].addDot(dots[15]);
    }

    public Dot[] getDots() {
        return dots;
    }

    public Square[] getSquares() {
        return squares;
    }

    public double getAverageHeightOfAllSquares() {
        return averageHeightOfAllSquares;
    }

    public void printPlan() {
        System.out.printf("%.3f   %.3f   %.3f   %.3f   %.3f   %.3f",squares[0].getDots()[0].getElevationMarks()
                ,squares[0].getDots()[1].getElevationMarks()
                ,squares[1].getDots()[0].getElevationMarks()
                ,squares[1].getDots()[1].getElevationMarks()
                ,squares[2].getDots()[0].getElevationMarks()
                ,squares[2].getDots()[1].getElevationMarks());
        System.out.println("\n\n");
        System.out.printf("%.3f   %.3f   %.3f   %.3f   %.3f   %.3f",squares[0].getDots()[2].getElevationMarks()
                ,squares[0].getDots()[3].getElevationMarks()
                ,squares[1].getDots()[2].getElevationMarks()
                ,squares[1].getDots()[3].getElevationMarks()
                ,squares[2].getDots()[2].getElevationMarks()
                ,squares[2].getDots()[3].getElevationMarks());
        System.out.println("\n\n");
        System.out.printf("%.3f   %.3f   %.3f   %.3f   %.3f   %.3f",squares[3].getDots()[0].getElevationMarks()
                ,squares[3].getDots()[1].getElevationMarks()
                ,squares[4].getDots()[0].getElevationMarks()
                ,squares[4].getDots()[1].getElevationMarks()
                ,squares[5].getDots()[0].getElevationMarks()
                ,squares[5].getDots()[1].getElevationMarks());
        System.out.println("\n\n");
        System.out.printf("%.3f   %.3f   %.3f   %.3f   %.3f   %.3f",squares[3].getDots()[2].getElevationMarks()
                ,squares[3].getDots()[3].getElevationMarks()
                ,squares[4].getDots()[2].getElevationMarks()
                ,squares[4].getDots()[3].getElevationMarks()
                ,squares[5].getDots()[2].getElevationMarks()
                ,squares[5].getDots()[3].getElevationMarks());
        System.out.println("\n\n");
        System.out.printf("%.3f   %.3f   %.3f   %.3f   %.3f   %.3f",squares[6].getDots()[0].getElevationMarks()
                ,squares[6].getDots()[1].getElevationMarks()
                ,squares[7].getDots()[0].getElevationMarks()
                ,squares[7].getDots()[1].getElevationMarks()
                ,squares[8].getDots()[0].getElevationMarks()
                ,squares[8].getDots()[1].getElevationMarks());
        System.out.println("\n\n");
        System.out.printf("%.3f   %.3f   %.3f   %.3f   %.3f   %.3f",squares[6].getDots()[2].getElevationMarks()
                ,squares[6].getDots()[3].getElevationMarks()
                ,squares[7].getDots()[2].getElevationMarks()
                ,squares[7].getDots()[3].getElevationMarks()
                ,squares[8].getDots()[2].getElevationMarks()
                ,squares[8].getDots()[3].getElevationMarks());
    }

}
