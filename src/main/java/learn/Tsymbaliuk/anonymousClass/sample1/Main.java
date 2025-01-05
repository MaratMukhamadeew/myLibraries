package learn.Tsymbaliuk.anonymousClass.sample1;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Vaska");
        System.out.println(cat1);
        System.out.println(cat1.getVoice());

        Cat cat2 = new Cat() {
            @Override
            public String getVoice() {
                return "woof";
            }
        };
        System.out.println(cat2);
        System.out.println(cat2.getVoice());
    }
}

class Cat {
    private String name;

    public Cat(String name) {
        super();
        this.name = name;
    }

    public Cat() {
        super();
    }

    public String getVoice() {
        return "Meow";
    }

    @Override
    public String toString() {
        return "Cat {name='" + name + '}';
    }
}
