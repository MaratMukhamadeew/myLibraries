package learn.programming_methods.glava3.simpledao;

import learn.programming_methods.glava3.data.subject.Payment;

import java.util.List;

public class PaymentDAO extends AbstractDAO<Integer, Payment> {
    public PaymentDAO() {
    }

    @Override
    public List<Payment> findAll() {
        return null;
    }

    @Override
    public Payment findEntityById(Integer id) {
        return null;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }

    @Override
    public boolean delete(Payment entity) {
        return false;
    }

    @Override
    public boolean create(Payment entity) {
        return false;
    }

    @Override
    public Payment update(Payment entity) {
        return null;
    }
}
