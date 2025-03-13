package learn.Tsymbaliuk.javacore.StreamAPI.part2.sample3;

import java.util.Objects;

public class Cat {
    private String name;
    private int weight;
    private String color;

    public Cat() {
        super();
    }

    public Cat(String name, int weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return weight == cat.weight && Objects.equals(name, cat.name) && Objects.equals(color, cat.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight, color);
    }

    @Override
    public String toString() {
        return "Cat [name = " + name + ", weight = " + weight + ", color = " + color + "]";
    }
}
