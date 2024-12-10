package learn.programming_methods.glava1.nested;

public class RunnerShip {
    public static void main(String[] args) {
        // Вызов статического метода
        Ship.LifeBoat.down();
        University.LearningDepartment.assignPlan(55);
        // Создание объекта статического класса
        Ship.LifeBoat lifeBoat = new Ship.LifeBoat();
        University.LearningDepartment department = new University.LearningDepartment();
        // Вызов обычного метода
        lifeBoat.swim();
        department.acceptProgram();
    }
}
