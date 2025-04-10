package practice.geodesy.entyties;

public class Square {
    private double averageHeight;
    private final int number;
    private final Dot[] dots = new Dot[4];
    private final int sideOfTheSquare = 25;

    public Square(int number) {
        this.number = number;
    }

    public void addDot(Dot dot) {
        if (dots[0] == null) {
            dots[0] = dot;
        } else if (dots[1] == null) {
            dots[1] = dot;
        } else if (dots[2] == null) {
            dots[2] = dot;
        } else if (dots[3] == null) {
            dots[3] = dot;
        } else {
            System.out.println("Все точки квадрата №" + number + " заданы");
        }
    }

    public Dot[] getDots() {
        return dots;
    }

    public double getAverageHeight() {
        calculateAverageHeight();
        return averageHeight;
    }

    private void calculateAverageHeight() {
        for (Dot dot : dots) {
            averageHeight += dot.getElevationMarks();
        }
        averageHeight /= 4;
    }

    @Override
    public String toString() {
        return String.format("\nКвадрат №" + number + " - средняя высота = %.3f", averageHeight);
    }

    /**
     * Выводим в консоль все точки нулевых работ у сторон квадрата
     */
    //TODO
    public void findingThePositionOfZeroPointsOfWork() {
        if (dots[0].getWorkingMark() + dots[1].getWorkingMark() < dots[0].getWorkingMark() & !(-(dots[0].getWorkingMark() + dots[1].getWorkingMark()) == (Math.abs(dots[0].getWorkingMark()) + Math.abs(dots[1].getWorkingMark())))) {
            System.out.println("Длина стороны квадрата №" + number + " = " + sideOfTheSquare + " х = " + String.format("%.3f", (sideOfTheSquare / (Math.abs(dots[0].getWorkingMark()) + Math.abs(dots[1].getWorkingMark()))) * Math.abs(dots[0].getWorkingMark())) + " Между точками " + String.format("%.3f и %.3f", dots[0].getWorkingMark(), dots[1].getWorkingMark()));
        }
        if (dots[0].getWorkingMark() + dots[2].getWorkingMark() < dots[0].getWorkingMark() & !(-(dots[0].getWorkingMark() + dots[2].getWorkingMark()) == (Math.abs(dots[0].getWorkingMark()) + Math.abs(dots[2].getWorkingMark())))) {
            System.out.println("Длина стороны квадрата №" + number + " = " + sideOfTheSquare + " х = " + String.format("%.3f", (sideOfTheSquare / (Math.abs(dots[0].getWorkingMark()) + Math.abs(dots[2].getWorkingMark()))) * Math.abs(dots[0].getWorkingMark())) + " Между точками " + String.format("%.3f и %.3f", dots[0].getWorkingMark(), dots[2].getWorkingMark()));
        }
        if (dots[2].getWorkingMark() + dots[3].getWorkingMark() < dots[2].getWorkingMark() & !(-(dots[2].getWorkingMark() + dots[3].getWorkingMark()) == (Math.abs(dots[2].getWorkingMark()) + Math.abs(dots[3].getWorkingMark())))) {
            System.out.println("Длина стороны квадрата №" + number + " = " + sideOfTheSquare + " х = " + String.format("%.3f", (sideOfTheSquare / (Math.abs(dots[2].getWorkingMark()) + Math.abs(dots[3].getWorkingMark()))) * Math.abs(dots[2].getWorkingMark())) + " Между точками " + String.format("%.3f и %.3f", dots[2].getWorkingMark(), dots[3].getWorkingMark()));
        }
        if (dots[1].getWorkingMark() + dots[3].getWorkingMark() < dots[1].getWorkingMark() & !(-(dots[1].getWorkingMark() + dots[3].getWorkingMark()) == (Math.abs(dots[1].getWorkingMark()) + Math.abs(dots[3].getWorkingMark())))) {
            System.out.println("Длина стороны квадрата №" + number + " = " + sideOfTheSquare + " х = " + String.format("%.3f", (sideOfTheSquare / (Math.abs(dots[1].getWorkingMark()) + Math.abs(dots[3].getWorkingMark()))) * Math.abs(dots[1].getWorkingMark())) + " Между точками " + String.format("%.3f и %.3f", dots[1].getWorkingMark(), dots[3].getWorkingMark()));
        }
    }

    public void printPlan() {
        System.out.printf("%.3f     %.3f%n", dots[0].getElevationMarks(), dots[1].getElevationMarks());
        System.out.println("\n\n\n\n");
        System.out.printf("%.3f     %.3f%n", dots[2].getElevationMarks(), dots[3].getElevationMarks());
    }
}
