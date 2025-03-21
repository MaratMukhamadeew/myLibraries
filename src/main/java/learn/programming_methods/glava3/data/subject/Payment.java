package learn.programming_methods.glava3.data.subject;

public class Payment extends Entity {
    private String name;
    private int phone;

    public Payment() {
        super();
    }

    public Payment(int id, String name, int phone) {
        super(id);
        this.phone = phone;
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Payment { id = " + super.getId() + ", phone = " + phone + ", name = '" + name + " }";
    }
}
