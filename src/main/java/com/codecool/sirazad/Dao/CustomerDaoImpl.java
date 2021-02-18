package com.codecool.sirazad.Dao;

import com.codecool.sirazad.model.Customer.Customer;
import com.codecool.sirazad.model.Feedback.Opinion;

import java.util.Optional;

public class CustomerDaoImpl implements CustomerDao {
    @Override
    public Customer findById(long id) {
        return null;
    }

    @Override
    public long addCustomer(Customer customer) {
        return 0;
    }

    @Override
    public void updateCustomer(Customer customer) {

    }

    @Override
    public Customer findCustomerByNameAndEmail(String name, String email) {
        return null;
    }

    @Override
    public Optional<Opinion> findOpinionOfBook(long customerId, long bookId) {
        return Optional.empty();
    }
}
