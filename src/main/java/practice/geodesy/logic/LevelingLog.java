package practice.geodesy.logic;

import practice.geodesy.entyties.Dot;

public class LevelingLog {
    double picketHeight;
    private final double rearRackReading = 0.666;
    private final double instrumentHorizon;
    private static final double[] intermediateReadingsOnTheStaff = new double[16];
    private final Dot[] dots;
    private double averageHeightOfAllDots;
    private double controlOfTheCorrectnessOfWorkingMarks;

    /**
     * Конструктор
     */
    public LevelingLog(double picketHeight) {
        this.picketHeight = picketHeight;
        dots = Dot.giveMeSixteenDotsArray();
        instrumentHorizon = rearRackReading + picketHeight;
        calculateDots();
    }

    /**
     * Все методы вычисления вершин и отметок точек
     */
    private void calculateDots() {
        calculateElevationMarks();
        calculateElevationMarks();
        calculatingTheAverageHeightOfAllDots();
        calculateWorkingMarks();
        controlOfTheCorrectnessOfCalculationOfWorkingMarks();
    }

    static {
        intermediateReadingsOnTheStaff[0] = 2.990;
        intermediateReadingsOnTheStaff[1] = 2.860;
        intermediateReadingsOnTheStaff[2] = 2.810;
        intermediateReadingsOnTheStaff[3] = 2.775;
        intermediateReadingsOnTheStaff[4] = 2.215;
        intermediateReadingsOnTheStaff[5] = 2.345;
        intermediateReadingsOnTheStaff[6] = 2.460;
        intermediateReadingsOnTheStaff[7] = 2.550;
        intermediateReadingsOnTheStaff[8] = 2.040;
        intermediateReadingsOnTheStaff[9] = 1.765;
        intermediateReadingsOnTheStaff[10] = 1.585;
        intermediateReadingsOnTheStaff[11] = 1.475;
        intermediateReadingsOnTheStaff[12] = 0.935;
        intermediateReadingsOnTheStaff[13] = 0.815;
        intermediateReadingsOnTheStaff[14] = 0.740;
        intermediateReadingsOnTheStaff[15] = 0.650;
    }

    /**
     * Вычисление отметок всех вершин
     */
    public void calculateElevationMarks() {
        for (int i = 0; i < dots.length; i++) {
            dots[i].setElevationMarks(instrumentHorizon - intermediateReadingsOnTheStaff[i]);
        }
    }

    /**
     * Вычисление рабочих отметок всех вершин
     */
    public void calculateWorkingMarks() {
        for (Dot dot : dots) {
            dot.setWorkingMark(averageHeightOfAllDots - dot.getElevationMarks());
        }
    }
    /**
     * Вычисление средней высоты вершин всех квадратов
     */
    public void calculatingTheAverageHeightOfAllDots() {
        averageHeightOfAllDots = (((dots[0].getElevationMarks() + dots[3].getElevationMarks() + dots[12].getElevationMarks() + dots[15].getElevationMarks())
                + 2 * (dots[1].getElevationMarks() + dots[2].getElevationMarks() + dots[4].getElevationMarks() + dots[8].getElevationMarks()
                + dots[7].getElevationMarks() + dots[11].getElevationMarks() + dots[13].getElevationMarks() + dots[14].getElevationMarks())
                + 4 * (dots[5].getElevationMarks() + dots[6].getElevationMarks() + dots[9].getElevationMarks() + dots[10].getElevationMarks())) / 36);
    }
    /**
     * Проверка вычисления средней высоты вершин всех квадратов
     */
    public void controlOfTheCorrectnessOfCalculationOfWorkingMarks() {
        controlOfTheCorrectnessOfWorkingMarks = (((dots[0].getWorkingMark() + dots[3].getWorkingMark() + dots[12].getWorkingMark() + dots[15].getWorkingMark())
                + 2 * (dots[1].getWorkingMark() + dots[2].getWorkingMark() + dots[4].getWorkingMark() + dots[8].getWorkingMark()
                + dots[7].getWorkingMark() + dots[11].getWorkingMark() + dots[13].getWorkingMark() + dots[14].getWorkingMark())
                + 4 * (dots[5].getWorkingMark() + dots[6].getWorkingMark() + dots[9].getWorkingMark() + dots[10].getWorkingMark())) / 36);
    }

    public Dot[] getDots() {
        return dots;
    }

    /**
     * Вывод на экран информации
     */
    public void levelingLog() {
        System.out.println("Отсчёт по рейке задней = " + rearRackReading + ", высота пикета Рп1 = " + picketHeight
                + " , горизонт инструмента = " + instrumentHorizon + "\nСреднее значение высотной отметки = "
                + String.format("%.3f", averageHeightOfAllDots) + "\nКонтроль правильности вычисления рабочих отметок "
                + String.format("%.5f ", controlOfTheCorrectnessOfWorkingMarks) + '≈' + " 0");
        for (int i = 0; i < dots.length; i++) {
            System.out.println("Точка №" + dots[i].getNumber() + ", промежуточный отсчёт по рейке = "
                    + intermediateReadingsOnTheStaff[i] + ", отметка высоты = " + String.format("%.3f", dots[i].getElevationMarks())
                    + ", рабочая отметка = " + String.format("%.3f", dots[i].getWorkingMark()));
        }
    }

    public void printPlan() {
        print(0,1,2,3);
        print(4,5,6,7);
        print(8,9,10,11);
        print(12,13,14,15);
    }

    private void print(int a, int b, int c, int d) {
        System.out.println(reduce(dots[a].getWorkingMark()) + "     " + reduce(dots[b].getWorkingMark()) + "     " + reduce(dots[c].getWorkingMark()) + "     " + reduce(dots[d].getWorkingMark()));
        System.out.println(reduce(dots[a].getElevationMarks()) + "     " + reduce(dots[b].getElevationMarks()) + "     " + reduce(dots[c].getElevationMarks()) + "     " + reduce(dots[d].getElevationMarks()));
        System.out.println("\n\n");
    }

    private String reduce(double d) {
        return String.format("%.3f",d);
    }

}
