package learn.shildt.lambda;

// Пример захвата локальной переменной из объемлющей области действия

interface MyFunc {
    int func(int n);
}

public class VarCapture {
    public static void main(String[] args) {
        // Локальная переменная, которая может быть захвачена
        int num = 10;

        MyFunc myLambda = n -> {
            // Такое применение переменной num допустимо, поскольку она не видоизменяется
            int v = num + n;

            // Следующая строка недопустима, т.к. предпринимается попытка видоизменить значение
            // переменной num
//            num++;
        return v;
        };

        System.out.println(myLambda.func(10));
    }
}
