package com.codecool.sirazad.Dao;

import com.codecool.sirazad.model.Customer.Customer;
import com.codecool.sirazad.model.Feedback.Opinion;

import java.util.Optional;

public interface CustomerDao {

   public Customer findById(long id);
   public long addCustomer(Customer customer);
   public void updateCustomer(Customer customer);
   public Customer findCustomerByNameAndEmail(String name, String email);
   public Optional<Opinion> findOpinionOfBook (long customerId, long bookId);
}

