package learn.programming_methods.glava1.exam;

public class Runner {
    public static void main(String[] args) {
        Exam<Double> md1 = new Exam<>(71.41, "Progr");
        Exam<Double> md2 = new Exam<>(71.49, "Progr");
        Exam<Double> md3 = new Exam<>(71.50, "Progr");
        System.out.print("md1 = " + md1.getMark() + ", ");
        System.out.print("md2 = " + md2.getMark() + ", ");
        System.out.println("md3 = " + md3.getMark());
        System.out.println("md1.equalsToMark(md2) -> " + md1.equalsToMark(md2));
        System.out.println("md2.equalsToMark(md3) -> " + md2.equalsToMark(md3));
        Exam<Integer> md4 = new Exam<>(71, "Progr");
        System.out.println(md1.equalsToMark(md4));
    }
}
