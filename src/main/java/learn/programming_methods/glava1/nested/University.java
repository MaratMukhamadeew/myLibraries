package learn.programming_methods.glava1.nested;

public interface University {
    int NUMBER_FACULTY = 20;
    void create();
    class LearningDepartment { // static по умолчанию
        public int idChief;
        public static void assignPlan(int idFaculty) {
            // Реализация
            System.out.println("Реализация метода \"assignPlan()\" вложенного класса \"LearningDepartment\" в " +
                    "интерфейс \"University\"" + idFaculty);
        }
        public void acceptProgram() {
            // Реализация
            System.out.println("Реализация метода \"acceptProgram()\" вложенного класса \"LearningDepartment\" в " +
                    "интерфейс \"University\"");
        }
    }
}
