package learn.programming_methods.glava1.inner.study;

public class TeacherCreator {
    public static AbstractTeacher createTeacher(int id) {
        // Объявление класса внутри метода
        class Rector extends AbstractTeacher {
            public Rector(int id) {
                super(id);
            }

            @Override
            public boolean excludeStudent(String name) {
                // Изменение статуса студента в БД
                return name != null;
            }
        } // Конец внутреннего класса

        if (isRectorId(id)) {
            return new Rector(id);
        } else {
            return new Teacher(id);
        }
    }

    private static boolean isRectorId(int id) {
        // Проверка id
        return id == 6; // stub
    }
}
