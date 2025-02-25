package learn.programming_methods.glava3.data.subject;

import java.io.Serializable;

public abstract class Entity implements Serializable, Cloneable {
    private int id;

    public Entity() {
        super();
    }

    public Entity(int id) {
        super();
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
