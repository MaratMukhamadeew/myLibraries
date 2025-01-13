package learn.Tsymbaliuk.javacore.privateMethos.sample2;

public class Cat implements Comparable<Cat> {
    private String name;
    private int weight;

    public Cat() {
        super();
    }

    public Cat(String name, int weight) {
        super();
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(Cat o) {
        return Integer.compare(this.weight, o.getWeight());
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
