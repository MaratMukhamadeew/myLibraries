package learn.JavaInANutshell.classes;

import java.text.CollationKey;
import java.text.Collator;
import java.util.Locale;

/**
 * Этот класс определяет набор статических методов для эффективной сортировки массивов
 * строк или других объектов. Он определяет также два интерфейса, обеспечивающих два
 * различных способа сравнения сортируемых объектов.
 */
public class Sorter {
    /**
     * Этот интерфейс определяет метод compare(), используемый для сравнения двух объектов. Для
     * сортировки объектов некоторого типа вы должны снабдить объект Comparer методом compare(),
     * упорядочивающим эти объекты желательным для вас способом.
     */
    public interface Comparer {
        /**
         * Объекты сравниваются, и возвращается значение, обозначающее их относительный порядок:
         * если (a > b), возвращается значение > 0;
         * если (a == b), возвращается значение 0;
         * если (a < b), возвращается значение < 0;
         */
        int compare(Object a, Object b);
    }

    /**
     * Это альтернативный интерфейс, который можно использовать для упорядочивания объектов.
     * Если класс реализует интерфейс Comparable, то любые два экземпляра этого класса можно сравнить
     * непосредственно путем вызова метода compareTo().
     */
    public interface Comparable {
        /**
         * Объекты сравниваются, и возвращается значение, обозначающее их относительный порядок:
         * если (a > b), возвращается значение > 0;
         * если (a == b), возвращается значение 0;
         * если (a < b), возвращается значение < 0;
         */
        int compareTo(Object other);
    }

    /**
     * Это внутренний объект Comparer (Созданный безымянным классом),
     * сравнивающий две строки ASCII. Он используется ниже методами sortAscii.
     */
    private static Comparer asciiComparer = new Comparer() {
        @Override
        public int compare(Object a, Object b) {
            return ((String) a).compareTo((String) b);
        }
    };
    /**
     * Этот ещё один внутренний объект Comparer. Он используется для сравнения двух объектов
     * Comparable. Ниже он используется методами sort(), принимающими в качестве аргументов объекты
     * Comparable вместо произвольных объектов.
     */
    private static Comparer comparableComparer = new Comparer() {
        @Override
        public int compare(Object a, Object b) {
            return ((Comparable) a).compareTo(b);
        }
    };

    /**
     * Массив строк ASCII сортируется по возрастанию
     */
    public static void sortAscii(String[] a) {
        // Обратите внимание на применение объекта asciiComparer
        sort(a, null, 0, a.length - 1, true, asciiComparer);
    }

    /**
     * Часть массива строк ASCII сортируется по возрастанию или убыванию в зависимости от аргумента up.
     */
    public static void sortAscii(String[] a, int from, int to, boolean up) {
        sort(a, null, from, to, up, asciiComparer);
    }

    /**
     * Массив строк ASCII сортируется по возрастанию без учета регистра
     */
    public static void sortAsciiIgnoreCase(String[] a) {
        sortAsciiIgnoreCase(a, 0, a.length - 1, true);
    }

    /**
     * Часть массива строк ASCII сортируется без учета регистра: по возрастанию, если up имеет
     * значение true, в противном случае - по убыванию.
     */
    public static void sortAsciiIgnoreCase(String[] a, int from, int to, boolean up) {
        if ((a == null) || (a.length < 2)) return;
        // Создается вторичный массив строк, содержащий строчную (в нижнем регистре) версию всех заданных строк.
        String[] b = new String[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i].toLowerCase();
        }
        // Сортируется этот вторичный массив, и изначальный массив переупорядочивается точно в таком же порядке,
        // в результате получается сортировка, не зависящая от регистра. Обратите внимание на применение объекта asciiComparer
        sort(b, a, from, to, up, asciiComparer);
    }

    /**
     * Массив строк сортируется по возрастанию с применением принятого по умолчанию местного порядка символов
     */
    public static void sort(String[] a) {
        sort(a, 0, a.length - 1, true, false, null);
    }

    /**
     * Часть массива строк сортируется с применением принятого по умолчанию местного порядка символов: по возрастанию -
     * если аргумент up имеет значение true, в противном случае - по убыванию. Если ignoreCase имеет значение true,
     * различие между строчными и заглавными буквами игнорируется.
     */
    public static void sort(String[] a, int from, int to, boolean up, boolean ignoreCase) {
        sort(a, from, to, up, ignoreCase, null);
    }

    /**
     * Часть массива строк сортируется с применением принятого по умолчанию местного порядка символов: по возрастанию -
     * если аргумент up имеет значение true, в противном случае - по убыванию. Если ignoreCase имеет значение true,
     * различие между строчными и заглавными буквами игнорируется.
     */
    public static void sort(String[] a, int from, int to, boolean up, boolean ignoreCase, Locale locale) {
        // Не сортируем если сортировать нечего
        if ((a == null) || (a.length < 2)) return;
        // Объект java.text.Collator осуществляет интернационализированное сравнение строк.
        // Он создается для заданной или принимаемой по умолчанию локализации.
        Collator c;
        if (locale == null) c = Collator.getInstance();
        else c = Collator.getInstance(locale);

        // Указывается, следует ли при сортировке принимать во внимание регистр.
        // Замечание: этот вариант, кажется, не будет корректно работать в JDK 1.1.1
        // при использовании принимаемой по умолчанию локализации American English.
        if (ignoreCase) c.setStrength(Collator.SECONDARY);

        // Применяя объект Collator для создания массива объектов
        // CollationKey, соответствующих каждой из строк. Сравнение объектов CollationKey происходит значительно
        // быстрее сравнения строк.
        CollationKey[] b = new CollationKey[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = c.getCollationKey(a[i]);
        }

        // Теперь определяется объект Comparer для сравнения объектов
        // CollationKey с применением безымянного класса.
        Comparer comp = new Comparer() {
            @Override
            public int compare(Object a, Object b) {
                return ((CollationKey) a).compareTo((CollationKey) b);
            }
        };
        // Наконец, сортируется массив объектов CollationKey, и изначальный массив строк
        // переупорядочивается точно также.
        sort(b, a, from, to, up, comp);
    }

    /**
     * Массив объектов Comparable сортируется во возрастанию
     */
    public static void sort(Comparable[] a) {
        sort(a, null, 0, a.length - 1, true);
    }

    /**
     * Сортируется часть массива объектов Comparable: по возрастанию, если up имеет
     * значение true, в противном случае - по убыванию
     */
    public static void sort(Comparable[] a, int from, int to, boolean up) {
        sort(a, null, from, to, up, asciiComparer);
    }

    /**
     * Сортируется часть массива объектов Comparable: по возрастанию, если up имеет
     * значение true, в противном случае - по убыванию. Массив b переупорядочивается точно в таком же порядке, что им массив а.
     */
    public static void sort(Comparable[] a, Object[] b, int from, int to, boolean up) {
        sort(a, b, from, to, up, asciiComparer);
    }

    /**
     * Массив произвольных объектов сортируется по возрастанию с применением сравнения, определенного
     * объектом Comparer c
     */
    public static void sort(Object[] a, Comparer c) {
        sort(a, null, 0, a.length - 1, true, c);
    }

    /**
     * Часть массива объектов сортируется с применением сравнения, определенного объектом Comparer c:
     * по возрастанию, если up имеет значение true, в противном случае - по убыванию
     */
    public static void sort(Object[] a, int from, int to, boolean up, Comparer c) {
        sort(a, null, from, to, up, c);
    }

    /**
     * Это главная процедура sort(). Она выполняет быструю сортировку (quicksort) массива a от элемента from
     * до элемента to. Аргумент up указывает, следует ли сортировать в возрастающем (true) или убывающем (false)
     * порядке. Аргумент Comparer "c" используется для сравнения элементов массива. Элементы массива b
     * переупорядочиваются точно также, как элементы массива a.
     */
    public static void sort(Object[] a, Object[] b, int from, int to, boolean up, Comparer c) {
        // Не сортируем если сортировать нечего
        if ((a == null) || (a.length < 2)) return;
        // Это основной алгоритм быстрой сортировки, из которого убраны "украшения", делающие его ещё быстрее,
        // но и ещё запутаннее, чем сейчас. Вы должны понимать, что делает программа, не выясняя, где гарантия того,
        // что массив будет отсортирован...
        // Обратите внимание на применение метода compare() объекта Comparer.
        int i = from, j = to;
        Object center = a[(from + to) / 2];
        do {
            if (up) {
                while ((i < to) && (c.compare(center, a[i]) > 0)) i++;
                while ((j > from) && (c.compare(center, a[j]) < 0)) j--;
            } else {
                while ((i < to) && (c.compare(center, a[i]) < 0)) i++;
                while ((j > from) && (c.compare(center, a[j]) > 0)) j--;
            }
            if (i < j) {
                Object tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
                if (b != null) {
                    tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
                if (i <= j) {
                    i++;
                    j--;
                }
            }
        } while (i <= j);
        if (from < j) sort(a, b, from, to, up, c);
        if (i < to) sort(a, b, i, to, up, c);
    }
    /**
     * Этот вложенный класс определяет тестовую программу, демонстрирующую несколько способов применения
     * класса Sorter для сортировки объектов класса ComplexNumber
     * */
    public static class Test {
        /**
         * Этот подкласс класса ComplexNumber реализует интерфейс Comparable и определяет метод compareTo() для
         * сравнения комплексных чисел. Он сравнивает числа по их абсолютной величине. То есть по их
         * расстоянию от начала координат.
         * */
        static class SortableComplexNumber extends ComplexNumber implements Sorter.Comparable {
            public SortableComplexNumber(double x, double y) {
                super(x, y);
            }

            @Override
            public int compareTo(Object other) {
                return sign(this.magnitude() - ((ComplexNumber) other).magnitude());
            }
        }
    }

    /** Тестовая программа, сортирующая комплексные числа разными способами */
    public static void main(String[] args) {
        // Определяется массив объектов SortableComplexNumber.
        // Он инициализируется случайными комплексными числами.
        var a = new Test.SortableComplexNumber[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = new Test.SortableComplexNumber(Math.random() * 10, Math.random() * 10);
        }
        // Теперь осуществляется сортировка с применением метода compareTo()
        // класса SortableComplexNumber, упорядочивающего числа по абсолютной величине. Результат печатается.
        System.out.println("Отсортированы по сумме действительной и мнимой частей: ");
        Sorter.sort(a, new Sorter.Comparer() {
            @Override
            public int compare(Object a, Object b) {
                ComplexNumber i = (ComplexNumber) a;
                ComplexNumber j = (ComplexNumber) b;
                return sign((i.real() + i.imaginary()) - (j.real() + j.imaginary()));
            }
        });
        for (var sortableComplexNumber : a) {
            System.out.println(sortableComplexNumber);
        }

        // Они сортируются снова с применением объекта Comparer, сравнивающего сначала их действительные,
        // а затем мнимые части
        System.out.println("Отсортированы в порядке убывания сначала по действительной, а затем по мнимой частям: ");
        Sorter.sort(a,0,a.length - 1, false, new Sorter.Comparer() {
            @Override
            public int compare(Object a, Object b) {
                ComplexNumber i = (ComplexNumber) a;
                ComplexNumber j = (ComplexNumber) b;
                double result = i.real() - j.real();
                if (result == 0) {
                    result = i.imaginary() - j.imaginary();
                }
                return sign(result);
            }
        });
        for (var sortableComplexNumber : a) {
            System.out.println(sortableComplexNumber);
        }
    }
    /** Это вспомогательная процедура, используемая программами сравнения */
    public static int sign(double x) {
        if (x > 0) return 1;
        else if (x < 0) return -1;
        else return 0;
    }
}

